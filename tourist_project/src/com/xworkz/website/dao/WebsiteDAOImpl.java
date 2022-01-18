package com.xworkz.website.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import com.xworkz.tour.util.EMFUtil;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO {


	@Override
	public void put(WebsiteEntity entity) {

		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();

	}

	@Override
	public WebsiteEntity getByNameGmail() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
		Query query = manager.createNamedQuery("getByNameGmail");
		Object obj = query.getSingleResult();
		WebsiteEntity entity = (WebsiteEntity)obj;

		} catch (PersistenceException e) {

			e.printStackTrace();

		}

		return null;
	}

	@Override
	public WebsiteEntity getByLikeUrla() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByLikeUrla");
			Object obj=query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity)obj;
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getByMinSince() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByMinSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity)obj;
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getByMaxSince() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByMaxSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity)obj;
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getBySecondMinSince() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getBySecondMinSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity)obj;
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public WebsiteEntity getBySecondMaxSince() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getBySecondMaxSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity)obj;
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
