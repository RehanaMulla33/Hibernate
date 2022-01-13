package com.xworkz.railwayStation;

import com.xworkz.railwayStation.dao.RailwayDAO;
import com.xworkz.railwayStation.dao.RailwayDAOImpl;
import com.xworkz.railwayStation.entity.RailwayEntity;

public class rlyScanner {

	public static void main(String[] args) {
		RailwayEntity entity=new RailwayEntity("Hubli-", 8, 4, 10, 5, 4, 10);
		RailwayDAO dao= new RailwayDAOImpl();
		dao.put(entity);
	}

}
