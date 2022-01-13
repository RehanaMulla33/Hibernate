package com.xworkz.tour;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristRunner {

	public static void main(String[] args) {
		TouristEntity entity=new TouristEntity(1122, "KanyaKumari", "800","Tea/Coffee/Culture", "Winter", 2000);
		TouristDAO dao=new TouristDAOImpl();
		dao.put(entity);

	}

}
