package com.xworkz.Country;

import com.xworkz.Country.dao.CountryDAO;
import com.xworkz.Country.dao.CountryDAOImpl;
import com.xworkz.Country.entity.CountryEntity;

public class CountryRunner {

	public static void main(String[] args) {
		CountryEntity countryEntity=new CountryEntity(1,"Russia","Russsia", 567843);
		CountryEntity countryEntity1=new CountryEntity(2,"Indai","Delhi",  456789);
		CountryEntity countryEntity2=new CountryEntity(3,"UK","Greenland", 5589632);
		CountryEntity countryEntity3=new CountryEntity(4,"USA","Mexico", 89745628);
		
		CountryDAO dao=new CountryDAOImpl();
		
		dao.create(countryEntity);
		dao.create(countryEntity1);
		dao.create(countryEntity2);
		dao.create(countryEntity3);


	}

}
