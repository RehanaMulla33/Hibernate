package com.xworkz.medicine;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.medicine.dao.MedicineDAO;

import com.xworkz.medicine.dao.MedicineDAOImpl;
import com.xworkz.medicine.entity.MedicineEntity;

public class medicineScanner {

	public static void main(String[] args) {
		//MedicineEntity entity=new MedicineEntity("DOLO", "01/02/2022", 350, 15, "white", "sipla", 1237);
		
		List<MedicineEntity>medicineEnt=new ArrayList<MedicineEntity>();
		
		medicineEnt.add(new MedicineEntity("prednisone", "01/02/2022", 350, 15, "white", "sipla", 1237));
		medicineEnt.add(new MedicineEntity("Phenergan", "01/02/2023", 352, 45, "Orange", "Himalaya", 6784));
		medicineEnt.add(new MedicineEntity("Fixon", "01/03/2022", 389, 500, "Blue", "Sheeetal", 3456));
		medicineEnt.add(new MedicineEntity("Fluoritop", "01/04/2022", 600, 452, "Orange", "Ullas", 8907));
		medicineEnt.add(new MedicineEntity("Adderal", "01/04/2022", 350, 500, "white", "Sun Pharma.", 4563));
		medicineEnt.add(new MedicineEntity("Allegra", "01/05/2022", 500, 250, "Green", "Divi's Laboratories Ltd", 7898));
		medicineEnt.add(new MedicineEntity("Ramipril", "01/06/2022", 892, 500, "Blue", "Piramal", 5673));
		medicineEnt.add(new MedicineEntity("Reclast", "01/07/2022", 562, 15, "white", "Torrent", 456));
		medicineEnt.add(new MedicineEntity("Relafen", "01/08/2022", 400, 500, "Green", "Cadila Healthcare Ltd", 5896));
		medicineEnt.add(new MedicineEntity("Requip", "01/09/2022", 600, 15, "Orange", "Apollo Hospitals", 4879));
		medicineEnt.add(new MedicineEntity("Azithromycin", "01/10/2022", 500, 15, "Green", "sipla", 2356));
		medicineEnt.add(new MedicineEntity("Amlodipine", "01/11/2022", 350, 15, "Blue", "GALDERMA", 2589));
		medicineEnt.add(new MedicineEntity("Adderall", "01/12/2022", 780, 250, "Orange", "BIOPHAR", 1254));
		medicineEnt.add(new MedicineEntity("Acetaminophen", "11/02/2024", 350, 15, "white", "sipla", 0123));
		medicineEnt.add(new MedicineEntity("Lotus", "11/01/2021", 780, 250, "Green", "sipla", 4598));
		medicineEnt.add(new MedicineEntity("Metformin", "21/02/2022", 350, 15, "Orange", "GALDERMA", 7854));
		medicineEnt.add(new MedicineEntity("Metoprolol", "28/03/2023", 350, 500, "white", "GALDERMA", 4785));
		medicineEnt.add(new MedicineEntity("Omeprazole", "01/03/2024", 350, 250, "Orange", "GALDERMA", 1478));
		medicineEnt.add(new MedicineEntity("Simvastatin", "02/04/2022", 780, 500, "white", "CUBIT", 654));
		medicineEnt.add(new MedicineEntity("Amoxicillin", "03/05/2022", 568, 250, "Green", "ALNA", 9874));
		medicineEnt.add(new MedicineEntity("Losartan", "05/06/2021", 300, 500, "white", "sipla", 9654));
		medicineEnt.add(new MedicineEntity("Ativan", "06/07/2022", 100, 15, "Green", "sipla", 7452));
		medicineEnt.add(new MedicineEntity("Albuterol", "07/08/2023", 200, 250, "white", "ZEEON", 1237));
		medicineEnt.add(new MedicineEntity("Levothyroxine", "08/09/2024", 900, 250, "Orange", "sipla", 1203));
		medicineEnt.add(new MedicineEntity("prednisone", "09/10/2021", 678, 500, "Pink", "CYCLONES P", 9658));
		medicineEnt.add(new MedicineEntity("Phenergan", "10/12/2022", 455, 250, "white", "ONEXIM-AZ", 1234));
		medicineEnt.add(new MedicineEntity("Kenalog", "11/10/2023", 990, 250, "Blue", "sipla", 7840));
		medicineEnt.add(new MedicineEntity("Cutivate", "21/09/2024", 350, 15, "white", "CYCLONES-TH", 1237));
		medicineEnt.add(new MedicineEntity("Promethegan", "11/08/2022", 350, 15, "Orange", "sipla", 5623));
		medicineEnt.add(new MedicineEntity("Phenadoz", "30/07/2022", 350, 500, "white", "DICLONES", 1023));
		medicineEnt.add(new MedicineEntity("Clobex", "01/06/2022", 350, 500, "Orange", "NEMPAR", 1458));
		medicineEnt.add(new MedicineEntity("Temovate", "19/05/2022", 780, 250, "white", "sipla", 1237));
		medicineEnt.add(new MedicineEntity("gliclazide", "19/04/2022", 350, 500, "white", "ONEXIM-200", 8956));
		medicineEnt.add(new MedicineEntity("Glucovance", "21/03/2022", 350, 250, "Orange", "DICLON", 0012));
		medicineEnt.add(new MedicineEntity("Avandaryl", "16/02/2022", 800, 500, "Pink", "Coast", 789));
		medicineEnt.add(new MedicineEntity("Glucotrol", "02/02/2022", 350, 250, "Pink", "sipla", 36589));
		medicineEnt.add(new MedicineEntity("Duetact", "01/02/2022", 350, 250, "white", "BIOPHAR", 4587));
		
		MedicineDAO dao=new MedicineDAOImpl();
		dao.putall(medicineEnt);
	
	}

}
