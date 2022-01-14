package com.xworkz.medicine.dao;


import java.util.Date;
import java.util.List;

import com.xworkz.medicine.entity.MedicineEntity;

public interface MedicineDAO {
	void put(MedicineEntity entity);

	void putall(List<MedicineEntity> entities);

}
