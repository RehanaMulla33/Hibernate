package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tour.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO {

	@Override
	public void put(TouristEntity entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}

	public void putall(List<TouristEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (TouristEntity touristEntity : entities) {
			manager.persist(touristEntity);

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i <90 ; i++) {
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
