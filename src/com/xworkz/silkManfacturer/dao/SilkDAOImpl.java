package com.xworkz.silkManfacturer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.silkManfacturer.entity.SilkEntity;
import com.xworkz.tour.util.EMFUtil;

public class SilkDAOImpl implements SilkDAO {

	@Override
	public void put(SilkEntity entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}

}
