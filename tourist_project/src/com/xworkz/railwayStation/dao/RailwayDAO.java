package com.xworkz.railwayStation.dao;

import java.util.List;

import com.xworkz.railwayStation.entity.RailwayEntity;

public interface RailwayDAO {
	void put(RailwayEntity entity);
	void putall(List<RailwayEntity> entities);

}
