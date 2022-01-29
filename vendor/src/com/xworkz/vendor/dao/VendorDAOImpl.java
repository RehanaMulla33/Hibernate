package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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

	@Override
	public boolean findLoginAndPassword(String loginName, String password) {

		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("findLoginAndPassword");

			query.setParameter("ln", loginName);

			query.setParameter("pswd", password);

			VendorEntity vend = (VendorEntity) query.getSingleResult();

			if (vend != null) {
				System.out.println("match found" + vend);
				System.out.println("password" + vend);

				return true;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return false;
	}

	@Override
	public boolean findByEmail(String email) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("findByEmail");

			query.setParameter("email", email);
			Object obj = query.getSingleResult();

			VendorEntity vnt = (VendorEntity) obj;
			System.out.println(vnt);
			if (obj != null) {
				return true;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return false;
	}

	@Override
	public void updatePasswordByEmail(String email, String pwd) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updatePasswordByEmail");
			query.setParameter("em", email);
			query.setParameter("pass", pwd);

			int obj = query.executeUpdate();

			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}

		finally {
			if (manager != null) {
				manager.close();
			}
		}
	}

}
