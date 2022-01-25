package com.xworkz.autoservices.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.autoservices.entity.AutoServicesEntity;


public class AutoServicesDAOImpl implements AutoServicesDAO {

	@Override
	public AutoServicesEntity saveAll(List<AutoServicesEntity> entities) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount = 0;
			for (AutoServicesEntity autoserviceEntity : entities) {
				manager.persist(autoserviceEntity);

				if (flushcount == 5) {
					manager.flush();
					System.out.println("flushingdata");
					flushcount = 0;
					manager.clear();
					System.out.println("cleardata");
				}
				flushcount++;

			}
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}

		return null;
	}

	@Override
	public void save(AutoServicesEntity autoEntity) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
	
		try {
			transaction.begin();
			manager.persist(autoEntity);
			transaction.commit();


		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			
		}

	}

}
