package com.xworkz.railwayStation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.railwayStation.entity.RailwayEntity;
import com.xworkz.tour.util.EMFUtil;

public class RailwayDAOImpl implements RailwayDAO {

	@Override
	public void put(RailwayEntity entity) {
		EntityManagerFactory emf=EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}
		
	}


