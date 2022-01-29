package com.xworkz.vendor.dao;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorDAO {
	void save(VendorEntity entity);

	boolean findLoginAndPassword(String loginName, String password);

	boolean findByEmail(String email);

	void updatePasswordByEmail(String email, String pwd);

}
