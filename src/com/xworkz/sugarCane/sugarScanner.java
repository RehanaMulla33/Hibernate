package com.xworkz.sugarCane;

import com.xworkz.sugarCane.dao.SugarCaneDAO;
import com.xworkz.sugarCane.dao.SugarCaneDAOImpl;
import com.xworkz.sugarCane.entity.SugarCaneEntity;

public class sugarScanner {

	public static void main(String[] args) {
		SugarCaneEntity entity=new SugarCaneEntity("Autumn", 6785, 38, 789065, "Nort India", "Nuetral soil");
		SugarCaneDAO dao=new SugarCaneDAOImpl();
		dao.put(entity);
		
		

	}

}
