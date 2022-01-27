package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorDAOImpl implements VendorDAO {

	@Override
	public void save(VendorEntity entity) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(entity);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

	}

}
