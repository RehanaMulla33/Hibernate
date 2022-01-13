package com.xworkz.biscuit;

import com.xworkz.biscuit.dao.BiscuitDAO;
import com.xworkz.biscuit.dao.BiscuitDAOImpl;
import com.xworkz.biscuit.entity.BiscuitEntity;

public class biscuitScanner {

	public static void main(String[] args) {
		BiscuitEntity entity = new BiscuitEntity(9900, 25, 25, "Creamish", "01/01/2021", "Circle", "ButterScotch");
		BiscuitDAO dao = new BiscuitDAOImpl();
		dao.put(entity);
	}

}
