package com.xworkz.Patient.dao;

import com.xworkz.Patient.Entity.PatientEntity;

public interface PatientDAO {
	void create(PatientEntity entity2);
	default PatientEntity getById(int id) {
		return null;}
	
	
	
	default void updateById (String p_Name,int p_age,int id) {
		
		
	}
	default void deleteById(int id) {}


}
