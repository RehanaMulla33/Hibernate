package com.xworkz.State;

import com.xworkz.State.dao.StateDAO;

import com.xworkz.State.dao.StateDAOImpl;
import com.xworkz.State.entity.StateEntity;

public class StaeRunner {

	public static void main(String[] args) {
		StateEntity stateEntity=new StateEntity(18,"Uttar Pradesh",28,"Lucknow");
		StateEntity stateEntity1=new StateEntity(19,"Punjab",5,"Bhatinda");
		StateEntity stateEntity2=new StateEntity(20,"Tamil Nadu",25,"Chennai");

		
		StateDAO dao= new StateDAOImpl();
		
		//dao.create(stateEntity);
		//dao.create(stateEntity1);
		//dao.create(stateEntity2);
		
			//dao.getbyNameAndid("Karnataka", 8);

		
		dao.updateById("Karnataka", "Mysore", 8);
		
		//dao.deleteById(9);

		

	}

}
