package com.xworkz.autoservices.service;

import com.xworkz.autoservices.dao.AutoServicesDAO;
import com.xworkz.autoservices.dao.AutoServicesDAOImpl;
import com.xworkz.autoservices.entity.AutoServicesEntity;

public class ValidateAutoServiceImpl implements ValidateAutoService {
	AutoServicesDAO dao = new AutoServicesDAOImpl();
	boolean valid = true;

	@Override
	public boolean validateAndSave(AutoServicesEntity entity) {
try {

		if (entity.getFName() != null && entity.getFName().length() > 3 && entity.getFName().length()< 20) {
		} else {
			System.out.println("Invalid Name");
			return false;
		}
		if (entity.getEmail() != null && entity.getEmail().length() < 20 && entity.getEmail().endsWith(".com")) {

		} else {
			System.out.println("Invalid Email");
			return false;
		}
		if (entity.getPhoneNo() != null && entity.getPhoneNo().startsWith("91") && entity.getPhoneNo().length()<= 12) {

		} else {
			System.out.println("Invalid Phone No");
			return false;
		}
		if (entity.getVType() != null && entity.getVType().length() > 5) {
		} else {
			System.out.println("Invalid Vehile");
			return false;
		}
		if (entity.getLocation() != null && entity.getLocation().length() > 5) {
		} else {
			System.out.println("Invalid Location");
			return false;
		}
		if (entity.getPassword() != null && entity.getPassword().length() < 15 && entity.getPassword().contains("*")) {

		} else {
			System.out.println("Invalid Password");
			return false;
		}
		if (entity.getCreated_By() != null && entity.getCreated_By().length() > 3
				&& entity.getCreated_By().length() < 20) {

		} else {
			System.out.println("Invalid CreatedBy");
			return false;
		}
		if (entity.getCreated_At() != null) {

		} else {
			System.out.println("Invalid CreatedAt");
			return false;
		}
		if (entity.getUpdated_By() != null && entity.getUpdated_By().length() > 3
				&& entity.getUpdated_By().length() < 20) {

		} else {
			System.out.println("Invalid UpdatedBy");
			return false;
		}
		if (entity.getUpdated_At() != null) {

		} else {
			System.out.println("Invalid UpdatedAt");
			return false;
		}

		if (valid)
			dao.save(entity);
		return true;
} catch (Exception e) {

}	
	
	return false;
}
}
