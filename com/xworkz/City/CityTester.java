package com.xworkz.City;

import com.xworkz.City.dao.CityDAO;
import com.xworkz.City.dao.CityDAOImpl;
import com.xworkz.City.entity.CityEntity;

public class CityTester {

	public static void main(String[] args) {
		CityEntity cityentity = new CityEntity(15, "Hubli", "80000", "Commercial", "Orange");
		CityEntity cityentity1 = new CityEntity(22, "Dharwad", "32564664", "DharwadPedha", "Green");
		CityEntity cityentity2 = new CityEntity(32, "Davanger", "122654", "Dosa", "yellow");
		CityEntity cityentity3 = new CityEntity(44, "Mysore", "426564", "Palace ", "White");
		CityEntity cityentity4 = new CityEntity(57, "Tumkuru", "526564", "HMT Watch", "Orange");

		CityDAO dao = new CityDAOImpl();

		//dao.create(cityentity);
		//dao.create(cityentity1);
		//dao.create(cityentity2);
		//dao.create(cityentity3);
		//dao.create(cityentity4);
		
		//dao.getById(2);
		
			//dao.updateById("Hubli", 20);


		
		dao.deleteById(22);


	}

}
