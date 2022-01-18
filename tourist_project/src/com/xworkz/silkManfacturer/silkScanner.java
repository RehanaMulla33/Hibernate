package com.xworkz.silkManfacturer;

import com.xworkz.silkManfacturer.dao.SilkDAO;
import com.xworkz.silkManfacturer.dao.SilkDAOImpl;
import com.xworkz.silkManfacturer.entity.SilkEntity;

public class silkScanner {

	public static void main(String[] args) {
		SilkEntity entity=new SilkEntity("China","Banarasee" , 20, "Fabric", 600, "Fibroin", 25000);
		SilkDAO dao=new SilkDAOImpl();
		dao.put(entity);
	}

}
