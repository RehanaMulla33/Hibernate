package com.xworkz.City.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.xworkz.City.entity.CityEntity;

public class CityDAOImpl implements CityDAO {

	public void create(CityEntity entity) {
		System.out.println("Invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CityEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(entity);
			tx.commit();
			session.close();

		}

		factory.close();
	}

	public CityEntity getById(int id) {
		CityEntity cityentity = null;
		System.out.println("inovked getbyid");
		System.out.println("id passed as argument " + id);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			cityentity = session.get(CityEntity.class, id);
			if (cityentity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return cityentity;
	}

	@Override
	public void updateById(String name, int id) {
		CityDAO.super.updateById(name, id);
		System.out.println("passing arg " + name + " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
			if (entity != null) {

				entity.setName(name);
				session.update(entity);
				tran.commit();
				System.out.println("entity updated");
				session.close();

			} else {
				System.out.println("not found wrong passing");
			}
			factory.close();

		}
	}

	@Override
	public void deleteById(int id) {
		CityDAO.super.deleteById(id);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CityEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CityEntity entity = session.get(CityEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
				System.out.println("you found record and deleted");
				session.close();
			} else {
				System.out.println("not found se arching id");
			}
		}
		factory.close();
	}

}
