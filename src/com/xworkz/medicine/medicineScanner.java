package com.xworkz.medicine;

import com.xworkz.medicine.dao.MedicineDAO;
import com.xworkz.medicine.dao.MedicineDAOImpl;
import com.xworkz.medicine.entity.MedicineEntity;

public class medicineScanner {

	public static void main(String[] args) {
		MedicineEntity entity=new MedicineEntity("DOLO", "01/02/2022", 350, 15, "white", "sipla", 1237);
		MedicineDAO dao=new MedicineDAOImpl();
		dao.put(entity);
	}

}
