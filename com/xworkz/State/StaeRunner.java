package com.xworkz.State;

import com.xworkz.State.dao.StateDAO;
import com.xworkz.State.dao.StateDAOImpl;
import com.xworkz.State.entity.StateEntity;

public class StaeRunner {

	public static void main(String[] args) {
		StateEntity stateEntity=new StateEntity(8,"Karnataka",28,"Bengaluru");
		StateEntity stateEntity1=new StateEntity(9,"Goa",5,"Panaji");

		StateEntity stateEntity2=new StateEntity(10,"Telangana",25,"Hyderabad");

		
		StateDAO dao= new StateDAOImpl();
		
		//dao.create(stateEntity);
		//dao.create(stateEntity1);
		//dao.create(stateEntity2);
		
			//stateDAO.getbyNameAndid("Karnataka", 1);

		
		stateEntity.updateById("Karnataka", "Mysore", 8);
		
		stateEntity.deleteById(1);

		

	}

}
