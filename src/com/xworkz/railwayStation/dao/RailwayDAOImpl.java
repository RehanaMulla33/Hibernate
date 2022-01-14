package com.xworkz.railwayStation.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.railwayStation.entity.RailwayEntity;
import com.xworkz.tour.util.EMFUtil;

public class RailwayDAOImpl implements RailwayDAO {

	@Override
	public void put(RailwayEntity entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}

	@Override
	public void putall(List<RailwayEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (RailwayEntity railwayEntity : entities) {
			manager.persist(railwayEntity);

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 79; i++) {
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
