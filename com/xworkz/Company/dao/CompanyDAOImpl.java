package com.xworkz.Company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Company.entity.CompanyEntity;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity entity) {
		System.out.println("Invoked create dao method");
		System.out.println(entity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
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

	@Override
	public void updateById(String name, int id) {
		CompanyDAO.super.updateById(name, id);
		System.out.println("invoke by id and update");

		System.out.println("passing arg " + name + " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, id);
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
		CompanyDAO.super.deleteById(id);
		System.out.println("invoked delete by id");

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
				System.out.println("you found that record and deleted");
				session.close();
			} else {
				System.out.println("not found  id");
			}
		}
		factory.close();
	}

}
