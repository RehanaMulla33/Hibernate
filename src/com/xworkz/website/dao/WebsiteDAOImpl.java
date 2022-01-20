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
			for (WebsiteEntity railwayEntity : webSiteEntity) {
				manager.persist(railwayEntity);
				if (flushcount >= 10) { // 1>>2>>3
					manager.flush();
					System.out.println("flushing the data");
					flushcount = 0;
					manager.clear();
					System.out.println("clear the data");
				}
				flushcount++;
			}
			transaction.commit();
		} catch (PersistenceException e) {
			transaction.rollback();
		}

		
	}

	@Override
	public WebsiteEntity getByNameGoogle() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByNameGoogle");
			Object result = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) result;
			System.out.println("result fetched for name");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;

	
	}

	@Override
	public WebsiteEntity getByLikeUrl() {
		return null;
	}

	@Override
	public WebsiteEntity getMaxBySince() {
		return null;
	}

	@Override
	public WebsiteEntity getMinBySince() {
		return null;
	}

	@Override
	public WebsiteEntity getSecondMinSince() {
		return null;
	}

	@Override
	public WebsiteEntity getSecondMaxBySince() {
		return null;
	}
}



	