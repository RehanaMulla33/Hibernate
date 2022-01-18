package com.xworkz.sugarCane.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.sugarCane.entity.SugarCaneEntity;
import com.xworkz.tour.util.EMFUtil;

public class SugarCaneDAOImpl implements SugarCaneDAO {
	public void put(SugarCaneEntity entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}
}
