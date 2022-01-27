package com.xworkz.registration.service;

import com.xworkz.registration.dao.RegisterDAO;
import com.xworkz.registration.entity.RegisterEntity;

public class RegisterServiceImpl implements RegisterService {
	private RegisterDAO dao;

	public RegisterServiceImpl(RegisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(RegisterEntity entity) {
		boolean value = true;
		if (entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() >= 6
				&& entity.getName().length() <= 25) {
			value = true;

		} else {
			System.out.println("Inavlid Username");
			value = false;
			return value;

		}
		if (entity.getEmail() != null && entity.getEmail().length() > 8 && entity.getEmail().length() < 25
				&& (entity.getEmail().endsWith(".com") || entity.getEmail().endsWith(".in")
						|| entity.getEmail().endsWith(".gov") || entity.getEmail().endsWith("edu")
						|| entity.getEmail().endsWith(".org"))) {
			value = true;

		} else {
			System.out.println("Inavlid Email");
			value = false;
			return value;
		}
		if (entity.getPassword() != null && entity.getPassword().length() > 8 && entity.getPassword().length() < 36
				&& (entity.getPassword().contains("*") || entity.getPassword().contains("&")
						|| entity.getPassword().contains("$") || entity.getPassword().contains("@"))) {
			value = true;
		} else {
			System.out.println("Inavlid password");
			value = false;
			return value;
		}
		if (entity.getCity() != null && !(entity.getCity().isEmpty()) && entity.getCity().length() > 3
				&& entity.getCity().length() < 56) {
			value = true;

		} else {
			System.out.println("Inavlid City");
			value = false;
			return value;
		}
		if (entity.getCountry() != null && entity.getCountry().length() >= 3 && entity.getCountry().length() <= 56) {
			value = true;
		} else {
			System.out.println("Inavlid City");
			value = false;
			return value;
		}
		if (entity.getMobileno() != 0 && String.valueOf(entity.getMobileno()).length() == 10) {
			value = true;

		} else {
			System.out.println("Inavlid Mobile number");
			value = false;
			return value;

		}

		if (value) {

			dao.save(entity);

		}

		return value;

	}
}
