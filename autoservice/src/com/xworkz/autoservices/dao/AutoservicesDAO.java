package com.xworkz.autoservices.dao;

import java.util.List;

import com.xworkz.autoservices.entity.AutoservicesEntity;



public interface AutoservicesDAO {
	AutoservicesEntity saveAll(List<AutoservicesEntity> entities);

}
