package com.xworkz.airport.dao;

import java.util.List;

import com.xworkz.airport.entity.AirportEntity;

public interface AirportDAO {
	void put(AirportEntity entity);
	void putall(List<AirportEntity> entities);

}
