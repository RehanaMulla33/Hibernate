package com.xworkz.airport;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.entity.AirportEntity;

public class AirportScanner {

	public static void main(String[] args) {
		AirportEntity entity=new AirportEntity(112320, 2346, "East", "Good", 15, 6, 6);
		AirportDAO dao=new AirportDAOImpl();
		dao.put(entity);
	}
}
