package com.xworkz.City;

import com.xworkz.City.dao.CityDAO;
import com.xworkz.City.dao.CityDAOImpl;
import com.xworkz.City.entity.CityEntity;

public class CityTester {

	public static void main(String[] args) {
		CityEntity cityentity = new CityEntity(1, "Hubli", "80000", "Commercial", "Or");
		CityEntity cityentity1 = new CityEntity(2, "Dharwad", "32564664", "DharwadPedha", "Li");
		CityEntity cityentity2 = new CityEntity(3, "Davanger", "122654", "Dosa", "ba");
		CityEntity cityentity3 = new CityEntity(4, "Mysore", "426564", "Palace ", "Pa");
		CityEntity cityentity4 = new CityEntity(5, "Tumkuru", "526564", "HMT Watch", "Tu");

		CityDAO dao = new CityDAOImpl();

		//dao.create(cityentity);
		//dao.create(cityentity1);
		//dao.create(cityentity2);
		//dao.create(cityentity3);
		//dao.create(cityentity4);
		
		dao.deleteById(4);


	}

}
