 package com.xworkz.autoservices.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.autoservices.entity.AutoservicesEntity;

public class AutoservicesDAOImpl implements AutoservicesDAO {

	@Override
	public AutoservicesEntity saveAll(List<AutoservicesEntity> entities) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount = 0;
			for (AutoservicesEntity autoserviceEntity : entities) {
				manager.persist(autoserviceEntity);

				if (flushcount == 10) {
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

}
