package com.xworkz.registration.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.registration.entity.RegisterEntity;

public class RegisterDAOImpl implements RegisterDAO {

	@Override
	public void save(RegisterEntity entity) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			if (manager != null) {
				manager.close();
			}

		}

	}

}
