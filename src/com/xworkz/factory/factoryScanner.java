package com.xworkz.factory;

import com.xworkz.factory.dao.FactoryDAO;
import com.xworkz.factory.dao.FactoryDAOImpl;
import com.xworkz.factory.entity.FactoryEntity;

public class factoryScanner {

	public static void main(String[] args) {
		FactoryEntity entity=new FactoryEntity("Car manufacture", "04/13/2000", "Lucknow", 1500, 7894, "Private", 9);
		FactoryDAO dao=new FactoryDAOImpl();
		dao.put(entity);
	}

}
