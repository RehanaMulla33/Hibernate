package com.xworkz.autoservices.service;

import com.xworkz.autoservices.dao.AutoServicesDAO;

import com.xworkz.autoservices.dao.AutoServicesDAOImpl;
import com.xworkz.autoservices.entity.AutoServicesEntity;

public class ValidateAutoServiceImpl implements ValidateAutoService {
	//AutoServicesDAO dao = new AutoServicesDAOImpl();
	private AutoServicesDAO dao;

	public void AutoServicesDAOImpl(AutoServicesDAO dao) {
		this.dao=dao;
	}
	

	@Override
	public boolean validateAndSave(AutoServicesEntity entity) {
		boolean valid = true;

		if ((entity.getFName() != null 
				&& entity.getFName().length() > 3
				&& entity.getFName().length()< 20)) {
			valid=true;;
		} else {
			System.out.println("Invalid Name");
			valid= false;
			return valid;
		}
		if ((entity.getEmail() != null 
				&& entity.getEmail().length() < 20 
				&& entity.getEmail().endsWith(".com")
				&& entity.getEmail().endsWith(".org")
				&& entity.getEmail().endsWith(".gov")
				&& entity.getEmail().endsWith(".in")
				&& entity.getEmail().endsWith(".edu"))) {
			valid=true;

		} else {
			System.out.println("Invalid Email");
			valid=false;
			return valid;
		}
		if (entity.getPhoneNo() != null 
				&& entity.getPhoneNo().startsWith("91") 
				&& entity.getPhoneNo().length()<= 12) {
			valid=true;
		} else {
			System.out.println("Invalid Phone No");
			valid=false;
			return valid;
		}
		if (entity.getVType() != null && entity.getVType().length() > 5) {
			valid=true;

		} else {
			System.out.println("Invalid Vehile");
			valid=false;
			return valid;
		}
		if (entity.getLocation() != null 
				&& entity.getLocation().length() > 5) {
			valid=true;

		} else {
			System.out.println("Invalid Location");
			valid=false;
		}
		if (entity.getPassword() != null 
				&& entity.getPassword().length() < 15 
				&& entity.getPassword().contains("*")
				&& entity.getPassword().contains("@")
				&& entity.getPassword().contains("&")
				&& entity.getPassword().contains("%")
				&& entity.getPassword().contains("$")) {
			valid=true;


		} else {
			System.out.println("Invalid Password");
			valid=false;
		}
		if (entity.getCreated_By() != null 
				&& entity.getCreated_By().length() > 3
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
		if (entity.getUpdated_By() != null 
				&& entity.getUpdated_By().length() > 3
				&& entity.getUpdated_By().length() < 20) {
			valid=true;

		} else {
			System.out.println("Invalid UpdatedBy");
			valid=false;
			return valid;
		}
		if (entity.getUpdated_At() != null) {

		} else {
			System.out.println("Invalid UpdatedAt");
			return false;
		}
		if ( String.valueOf(entity.getPhoneNo()).length()==10 && entity.getPhoneNo()!=null) {
			valid=true;
			
		}
		else {
			System.out.println("Invalid phone number");
			valid=false;
		}

		if (valid)
			dao.save(entity);
	
		return valid;
}
}
