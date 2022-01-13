package com.xworkz.medicine.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.medicine.entity.MedicineEntity;
import com.xworkz.tour.util.EMFUtil;

public class MedicineDAOImpl implements MedicineDAO{

	@Override
	public void put(MedicineEntity entity) {
		EntityManagerFactory emf=EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
		
	}

	}


