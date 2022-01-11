package com.xworkz.Patient.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Patient.Entity.PatientEntity;

public class PatientDAOImpl implements PatientDAO {

	@Override
	public void create(PatientEntity entity2) {
		System.out.println("Invoked create dao method");
		System.out.println(entity2);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(PatientEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(entity2);
			tx.commit();
			session.close();

		}
		factory.close();
	}

	@Override
	public PatientEntity getById(int id) {
		PatientEntity patientEntity = null;
		System.out.println("invked getbyid");
		System.out.println("id passed as argument " + id);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(PatientEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			patientEntity = session.get(PatientEntity.class, id);
			if (patientEntity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return patientEntity;

	}

	@Override
	public void updateById(String p_Name, int p_age, int id) {
		System.out.println("invode by id and update");

		System.out.println("passing arg " + p_Name + " " + p_age + " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(PatientEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			PatientEntity entity = session.get(PatientEntity.class, id);
			if (entity != null) {

				entity.setName(p_Name);
				entity.setAge(p_age);
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
		System.out.println("invoked delete by id");
		 
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(PatientEntity.class).buildSessionFactory(); 		
		if(factory!=null) {
			Session session =factory.openSession();
			Transaction transaction=session.beginTransaction();
			PatientEntity entity=session.get(PatientEntity.class, id);
			if(entity!=null) {
				session.delete(entity);
				transaction.commit();
				System.out.println("you are genius found that and deleted");
				session.close();
			}else {
				System.out.println("not found that id");
			}
		}factory.close();
	}

	}


