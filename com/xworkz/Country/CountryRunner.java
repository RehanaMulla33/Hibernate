package com.xworkz.Country;


import com.xworkz.Country.dao.CountryDAO;
import com.xworkz.Country.dao.CountryDAOImpl;
import com.xworkz.Country.entity.CountryEntity;

public class CountryRunner {

	public static void main(String[] args) {
		CountryEntity countryEntity=new CountryEntity(19,"Perugve","South America", "567843");
		CountryEntity countryEntity1=new CountryEntity(92,"Indai","Asia", " 456789");
		CountryEntity countryEntity2=new CountryEntity(53,"Shrilanka","Asia", "5589632");
		CountryEntity countryEntity3=new CountryEntity(74,"USA","South America","89745628");
		
		CountryDAO dao=new CountryDAOImpl();
		
		//dao.create(countryEntity);
		//dao.create(countryEntity1);
		//dao.create(countryEntity2);
		//dao.create(countryEntity3);
		
			//dao.getByName(19);
			//dao.updateById("140000", 4);
			
			dao.deleteById(74);
		}



	}


