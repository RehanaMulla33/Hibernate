package com.xworkz.Company;

import com.xworkz.Company.dao.CompanyDAO;
import com.xworkz.Company.dao.CompanyDAOImpl;
import com.xworkz.Company.entity.CompanyEntity;

public class CompanyRunner {

	public static void main(String[] args) {
		//CompanyEntity companyEntity = new CompanyEntity(1, "xworkz", "IT", "MNC", "www.abc");
		//CompanyEntity companyEntity1 = new CompanyEntity(3, "microsoft", "mnc", "software", "www.microsoft.com");
		CompanyEntity companyEntity2 = new CompanyEntity(4, "flipkart", "e-commerece", "service", "www.flipkart.com");

		CompanyDAO dao = new CompanyDAOImpl();

		//dao.create(companyEntity1);
		//dao.create(companyEntity2);


		dao.updateById("tata", 1);

	}

}
