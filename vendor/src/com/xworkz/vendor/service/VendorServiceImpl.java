package com.xworkz.vendor.service;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {
	private VendorDAO dao;

	public VendorServiceImpl(VendorDAO dao) {
		this.dao = dao;

	}

	@Override
	public boolean validateAndSave(VendorEntity entity) {
		boolean valid = true;
		if (entity.getName() != null && entity.getName().length() >= 6 && entity.getName().length() <= 25
				&& !(entity.getName().isEmpty())) {
			valid = true;

		} else {
			System.out.println("Invalid user name");
			valid = false;
			return valid;
		}
		if (entity.getEmail() != null && !(entity.getEmail().isEmpty()) && entity.getEmail().contains("@")
				&& entity.getEmail().endsWith(".com") || entity.getEmail().endsWith(".in")
				|| entity.getEmail().endsWith(".org") || entity.getEmail().endsWith(".gov")) {
			valid = true;
		} else {
			System.out.println("Invalid Email");
			valid = false;
			return valid;
		}
		if (entity.getLoginName() != null && entity.getLoginName().length() >= 8
				&& entity.getLoginName().length() <= 12) {
			valid = true;
		} else {
			System.out.println("Invalid Login Name");
			valid = false;
			return valid;
		}
		if (entity.getPassword() != null) {
			valid = true;
		} else {
			System.out.println("Invalid password");
			valid = false;
			return valid;
		}
		if (entity.getAddress() != null && entity.getAddress().length() >= 12 && entity.getAddress().length() <= 100
				&& !(entity.getAddress().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Invalid Address");
			valid = false;
			return valid;
		}
		if (entity.getGstNo().length() > 12 && entity.getGstNo().length() <= 15) {
			valid = true;
		} else {

			System.out.println("Invalid GST");
			valid = false;
			return valid;
		}
		if (entity.getCreatedAt() != null) {
			valid = true;
		} else {
			System.out.println("Invalid Created By");
			valid = false;
			return valid;
		}
		if (valid)
			dao.save(entity);

		return false;
	}

}
