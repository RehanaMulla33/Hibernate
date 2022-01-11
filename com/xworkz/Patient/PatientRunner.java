package com.xworkz.Patient;

import com.xworkz.Patient.Entity.PatientEntity;

import com.xworkz.Patient.dao.PatientDAO;
import com.xworkz.Patient.dao.PatientDAOImpl;

public class PatientRunner {

	public static void main(String[] args) {
		PatientEntity patientEntity=new PatientEntity(1,"Sara",20,"Karnataka","negetive");
		PatientEntity patientEntity1=new PatientEntity(2,"Suhana",24,"Karnataka","negetive");
		PatientEntity patientEntity2=new PatientEntity(3,"Sana",22,"Karnataka","Positive");
		
		PatientDAO dao =new PatientDAOImpl();
		
		dao.create(patientEntity);
		dao.create(patientEntity1);
		dao.create(patientEntity2);
	}

}
