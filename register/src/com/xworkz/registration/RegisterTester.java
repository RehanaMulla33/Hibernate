package com.xworkz.registration;

import com.xworkz.registration.dao.RegisterDAO;
import com.xworkz.registration.dao.RegisterDAOImpl;
import com.xworkz.registration.entity.RegisterEntity;
import com.xworkz.registration.service.RegisterService;
import com.xworkz.registration.service.RegisterServiceImpl;

public class RegisterTester {

	public static void main(String[] args) {
		RegisterEntity entity=new RegisterEntity("Samiksha", "Samiksh@gmail.com", "Samiksha&123", "Hubli","India" , 8123079652L, true);
		RegisterDAO dao=new RegisterDAOImpl();
		RegisterService service=new RegisterServiceImpl(dao);
		service.validateAndSave(entity);
		
		
	

		

	}

}
