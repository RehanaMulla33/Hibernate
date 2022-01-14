package com.xworkz.airport.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;
import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.tour.util.EMFUtil;

import antlr.collections.List;

public class AirportDAOImpl implements AirportDAO {

	@Override
	public void put(com.xworkz.airport.entity.AirportEntity entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

	@Override
	public void putall(java.util.List<AirportEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (AirportEntity airportEntity : entities) {
			manager.persist(airportEntity);

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 50; i++) {
					if (flushcount == 7) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}

			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}
			transaction.commit();
		}

	}

}
