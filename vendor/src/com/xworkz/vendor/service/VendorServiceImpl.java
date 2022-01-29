package com.xworkz.vendor.service;

import org.hibernate.internal.build.AllowSysOut;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {
	private VendorDAO dao;

	public VendorServiceImpl(VendorDAO vdao) {
		this.dao = vdao;

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
		if (entity.getPassword() != null && !(entity.getPassword().isEmpty()) && entity.getPassword().length() >= 8
				&& entity.getPassword().length() >= 25 && (entity.getPassword().contains("*"))
				|| entity.getPassword().contains("@") || entity.getPassword().contains("$")) {
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

	@Override
	public boolean ValidateLoginAndpassword(String loginName, String password) {
		boolean valid = true;
		if (loginName != null && !(loginName.isEmpty()) && loginName.length() >= 8 && loginName.length() <= 25) {
			valid = true;

		} else {
			System.out.println("Invalid Login name");
			valid = false;
			return valid;
		}
		if (password != null && !(password.isEmpty()) && password.length() >= 8 && password.length() <= 20) {
			valid = true;

		} else {
			System.out.println("Invalid password");
			valid = false;
			return valid;

		}
		if (valid) {
			boolean value = dao.findLoginAndPassword(loginName, password);
			System.out.println("login name is matching :" + value);

		}
		return false;

	}

	@Override
	public void validateAndChangePassword(String email, String newPassword) {
		boolean valid = true;
		if (email != null && email.length() >= 8 && !(email.isEmpty()) && email.length() <= 30
				&& ((email.endsWith(".com")) || email.endsWith(".in")) || email.endsWith(".gov")
				|| email.endsWith(".org")) {
			valid = true;
		}

		else {
			System.out.println("Entered email is wrong");
			valid = false;

		}

		if (valid) {
			boolean val = dao.findByEmail(email);
			if (val) {
				System.out.println("valid email");
				dao.updatePasswordByEmail(email, newPassword);
			}

			System.out.println("updated password  :" + val);
		} else {
			System.out.println("Invalid email :" + email);
		}

	}

}
