package com.xworkz.tour.dao;


import java.util.List;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.tour.entity.TouristEntity;

public interface TouristDAO {
	
	void put(TouristEntity entity);
	void putall(List<TouristEntity> entities);

}
