package com.xworkz.website.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.tour.util.EMFUtil;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO {

	@Override
	public void save(List<WebsiteEntity> webSiteEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount = 0;
			for (WebsiteEntity websiteEntity : webSiteEntity) {
				manager.persist(websiteEntity);
				if (flushcount >= 10) {
					manager.flush();
					System.out.println("flushing the data");
					flushcount = 0;
					manager.clear();
					System.out.println("clear the data");
				}
				flushcount++;
			}
		} catch (PersistenceException e) {
			transaction.rollback();
		}
		transaction.commit();


	}

	@Override
	public WebsiteEntity getByNameGoogle() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByNameGoogle");
			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;
			System.out.println("result fetched");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public WebsiteEntity getByLikeUrl() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByLikeUrl");
			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;
			System.out.println("result fetched");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public WebsiteEntity getMaxBySince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getMaxBySince");
			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;
			System.out.println("result fetched");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public WebsiteEntity getMinBySince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getMinBySince");
			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;
			System.out.println("result fetched");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public WebsiteEntity getSecondMinSince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getSecondMinSince");
			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;
			System.out.println("result fetched");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public WebsiteEntity getSecondMaxBySince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getSecondMaxBySince");
			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;
			System.out.println("result fetched");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}
}
