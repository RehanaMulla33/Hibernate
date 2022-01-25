package com.xworkz.autoservices.dao;

import java.util.List;

import com.xworkz.autoservices.entity.AutoServicesEntity;

public interface AutoServicesDAO {
	AutoServicesEntity saveAll(List<AutoServicesEntity> entities);
	void save(AutoServicesEntity autoEntity);

}
