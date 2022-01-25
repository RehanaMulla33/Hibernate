package com.xworkz.autoservices.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.autoservices.dao.AutoservicesDAO;
import com.xworkz.autoservices.dao.AutoservicesDAOImpl;
import com.xworkz.autoservices.entity.AutoservicesEntity;
import com.xworkz.autoservices.exception.InvalidCreateBy;
import com.xworkz.autoservices.exception.InvalidCreatedAt;
import com.xworkz.autoservices.exception.InvalidEmail;
import com.xworkz.autoservices.exception.InvalidLocation;
import com.xworkz.autoservices.exception.InvalidPhoneno;
import com.xworkz.autoservices.exception.InvalidVType;
import com.xworkz.autoservices.exception.InvalidfName;

public class ValidateAutoserviceImpl implements ValidateAutoservice {

	private AutoservicesDAO dao;

	boolean validate = true;
	AutoservicesDAOImpl auto1 = new AutoservicesDAOImpl();
	private Object Autoservice;

	@Override
	public boolean validateAndSave(AutoservicesEntity entity) {
		EntityManager manager=SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		

		try {
			if (entity.getFName() == null && entity.getFName().length()<3 && entity.getFName().length() > 25) {
				this.validate = false;
				throw new InvalidfName();
			}

			if (entity.getEmail() == null && entity.getEmail().length() < 8
					&& entity.getEmail().endsWith("@gmail.com")) {
				this.validate = false;
				throw new InvalidEmail("Invalid Email");
			}
			if (entity.getPhoneNo() == null && entity.getPhoneNo().length() < 12
					&& entity.getPhoneNo().startsWith("91")) {
				this.validate = false;
				throw new InvalidPhoneno("Invalid phone");
			}
			if (entity.getVType() == null && entity.getVType().length() < 2 && entity.getVType().length() > 6) {
				this.validate = false;
				throw new InvalidVType("Invalid Type");
			}
			if (entity.getLocation() == null && entity.getLocation().length() < 2
					&& entity.getLocation().length() > 10) {
				this.validate = false;
				throw new InvalidLocation("Invalid Location");
			}
			if (entity.getCreated_By()==null && entity.getCreated_By().length()<3 && entity.getCreated_By().length()<25) {
				this.validate=false;
				throw new InvalidCreateBy("Invalid credit at");
			}
			

		} catch (InvalidfName e) {
			System.out.println(e);
		}
		catch (InvalidEmail e) {
			System.out.println(e);
		}
		catch (InvalidPhoneno e) {
			System.out.println(e);
		}
		catch (InvalidVType e) {
			System.out.println(e);
		}
		catch (InvalidLocation e) {
			System.out.println(e);
		}
		catch (InvalidCreatedAt e) {
			System.out.println(e);
		}
		finally {
			if(manager!=null) {
				manager.close();
			}
		}
		if(validate) {
			auto1.save(entity);
			
		}
		return validate;

	}
}
