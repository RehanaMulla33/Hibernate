package com.xworkz.medicine.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.airport.entity.AirportEntity;
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

	@Override
	public void putall(List<MedicineEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (MedicineEntity medicineEntity : entities) {
			manager.persist(medicineEntity);

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 37; i++) {
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

	


