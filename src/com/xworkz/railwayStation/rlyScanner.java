package com.xworkz.railwayStation;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.railwayStation.dao.RailwayDAO;
import com.xworkz.railwayStation.dao.RailwayDAOImpl;
import com.xworkz.railwayStation.entity.RailwayEntity;
import com.xworkz.tour.entity.TouristEntity;

public class rlyScanner {

	public static void main(String[] args) {
		//RailwayEntity entity=new RailwayEntity("Hubli-", 8, 4, 10, 5, 4, 10);
		
		List<RailwayEntity>rlyEntities=new ArrayList<RailwayEntity>();
		
		rlyEntities.add(new RailwayEntity("Hassan", 8, 4, 10, 6, 4, 8));
		rlyEntities.add(new RailwayEntity("Thanjavur junction-", 6, 4, 10, 5, 4, 3));
		rlyEntities.add(new RailwayEntity("KSR Bangalore", 8, 3, 6, 7, 4, 2));
		rlyEntities.add(new RailwayEntity("Katpadi-", 7, 4, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Coimbatore-", 6, 3, 7, 4, 4, 4));
		rlyEntities.add(new RailwayEntity("Mangalore-Jn", 6, 4, 10, 4, 4, 3));

		rlyEntities.add(new RailwayEntity("Salem-", 8, 4, 10, 6, 4, 8));
		rlyEntities.add(new RailwayEntity("Kumbakonam-", 6, 3, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Dindigul-", 5, 4, 8, 7, 4, 10));
		rlyEntities.add(new RailwayEntity("Palakkad-", 6, 3, 8, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Kozhikode-", 7, 4, 10, 4, 4, 10));
		rlyEntities.add(new RailwayEntity("Shoranur-", 4, 4, 10, 5, 4, 10));

		rlyEntities.add(new RailwayEntity("Ottapalam-", 8, 4, 10, 5, 4, 7));
		rlyEntities.add(new RailwayEntity("Viluppuram-", 7, 3, 10, 5, 4, 7));
		rlyEntities.add(new RailwayEntity("Ernakulam-", 6, 4, 8, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Alappuzha-", 5, 4, 10, 5, 4, 8));
		rlyEntities.add(new RailwayEntity("Kottayam-", 4, 2, 8, 5, 4, 4));
		rlyEntities.add(new RailwayEntity("Madurai-", 7, 4, 10, 5, 4, 10));

		rlyEntities.add(new RailwayEntity("Thiruvananthapuram-", 8, 4, 10, 5, 4, 4));
		rlyEntities.add(new RailwayEntity("Trivandrum-", 7, 3, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Tambaram-", 6, 4, 10, 4, 4, 7));
		rlyEntities.add(new RailwayEntity("Davanger-", 4, 2, 8, 5, 4, 5));
		rlyEntities.add(new RailwayEntity("Puratchi Thalaivar-", 4, 4, 10, 6, 4, 10));
		rlyEntities.add(new RailwayEntity("Abhayapuri Asam", 5, 3, 8, 7, 4, 6));

		rlyEntities.add(new RailwayEntity("Howrah-", 7, 4, 10, 5, 4,6));
		rlyEntities.add(new RailwayEntity("Sealdah-", 8, 3, 8, 6, 4, 5));
		rlyEntities.add(new RailwayEntity("Asansol-", 6, 3, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Hubli-", 6, 4, 8, 5, 4, 8));
		rlyEntities.add(new RailwayEntity("Durgapur-", 5, 2, 10, 3, 4, 10));
		rlyEntities.add(new RailwayEntity("Jasidih-", 4, 4, 10, 5, 4, 8));

		rlyEntities.add(new RailwayEntity("Andal-", 9, 4, 10, 7, 3, 10));
		rlyEntities.add(new RailwayEntity("Madhupur-", 8, 4, 8, 5, 3, 7));
		rlyEntities.add(new RailwayEntity("Raniganj-", 7, 3, 10, 9, 4, 8));
		rlyEntities.add(new RailwayEntity("Baidyanathdham-", 6, 4, 8, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Deoghar-", 6, 4, 10, 4, 2, 8));
		rlyEntities.add(new RailwayEntity("Basukinath-", 5, 2, 8, 5, 4, 10));
		

		rlyEntities.add(new RailwayEntity("Barakar-", 5, 4, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Chittaranjan-", 6, 4, 8  , 5, 4, 8));
		rlyEntities.add(new RailwayEntity("Giridih-", 8, 3, 8, 5, 3, 10));
		rlyEntities.add(new RailwayEntity("Kulti-", 7, 4, 10, 4, 2, 5));
		rlyEntities.add(new RailwayEntity("Kumardhubi-", 4, 2, 10, 2, 4, 10));
		rlyEntities.add(new RailwayEntity("Mankar-", 6, 4, 8, 7, 4, 4));
		

		rlyEntities.add(new RailwayEntity("Panagarh-", 8, 4, 10, 6, 3, 10));
		rlyEntities.add(new RailwayEntity("Pandaveswar-", 9, 2, 10, 5, 3, 8));
		rlyEntities.add(new RailwayEntity("Simultala-", 10, 4, 8, 6, 4, 10));
		rlyEntities.add(new RailwayEntity("Sitarampur-", 10, 3, 10, 5, 2, 8));
		rlyEntities.add(new RailwayEntity("Siuri-", 9, 4, 10, 5, 2, 10));
		rlyEntities.add(new RailwayEntity("Ukhra-", 7, 3, 8, 5, 4, 8));
		

		rlyEntities.add(new RailwayEntity("Vidasagar-", 9, 4, 10, 6, 2, 10));
		rlyEntities.add(new RailwayEntity("Dumka-", 8, 3, 8, 5, 2, 10));
		rlyEntities.add(new RailwayEntity("Jamtara-", 6, 4, 8, 5, 4, 7));
		rlyEntities.add(new RailwayEntity("Baraboni-", 7, 4, 10, 7, 2, 10));
		rlyEntities.add(new RailwayEntity("Barachak-", 6, 3, 8, 5, 4, 6));
		rlyEntities.add(new RailwayEntity("Bhimgarh-", 7, 4, 10, 4, 2, 5));
		

		rlyEntities.add(new RailwayEntity("Chandan-", 8, 4, 10, 6, 2, 4));
		rlyEntities.add(new RailwayEntity("Chinpai", 4, 2, 10, 5, 3, 10));
		rlyEntities.add(new RailwayEntity("Chotta ambona", 5, 4, 10, 5, 4, 7));
		rlyEntities.add(new RailwayEntity("Dubrajpur-", 6, 3, 8, 6, 3, 10));
		rlyEntities.add(new RailwayEntity("Galsi-", 5, 4, 10, 5, 4, 8));
		rlyEntities.add(new RailwayEntity("Ghormara-", 7, 2, 8, 5, 2, 10));
		

		rlyEntities.add(new RailwayEntity("Jagdishpur-", 8, 4, 10, 6, 4, 6));
		rlyEntities.add(new RailwayEntity("Kalubathan-", 4, 2, 8, 5, 2, 10));
		rlyEntities.add(new RailwayEntity("Kumrabad-", 5, 4, 10, 7, 4, 10));
		rlyEntities.add(new RailwayEntity("Kalipahari-", 6, 4, 10, 5, 2, 8));
		rlyEntities.add(new RailwayEntity("Kajora gram-", 7, 3, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Madankata-", 6, 3, 8, 7, 2, 8));
		

		rlyEntities.add(new RailwayEntity("Maheshmunda-", 9, 4, 10, 6, 4, 10));
		rlyEntities.add(new RailwayEntity("Mathurapur-", 8, 3, 10, 5, 3, 5));
		rlyEntities.add(new RailwayEntity("Mugma-", 7, 2, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Panchra-", 6, 4, 10, 6, 3, 7));
		rlyEntities.add(new RailwayEntity("Paraj-", 6, 2, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Rajbandh-", 8, 4, 10, 6, 2, 7));
		

		rlyEntities.add(new RailwayEntity("Sonachara-", 5, 4, 10, 5, 4, 10));
		rlyEntities.add(new RailwayEntity("Salanpur-", 5, 2, 10, 5, 4, 8));
		rlyEntities.add(new RailwayEntity("Shankurpur-", 8, 4, 10, 4, 3, 10));
		rlyEntities.add(new RailwayEntity("Waria-", 9, 4, 10, 5, 4, 8));
		rlyEntities.add(new RailwayEntity("Kasitanr-", 8, 2, 10, 5, 4, 2));
		rlyEntities.add(new RailwayEntity("Arjun Nagar-", 10, 4, 10, 4, 2, 4));
		
		

				RailwayDAO dao= new RailwayDAOImpl();
				dao.putall(rlyEntities);
		
	}

}
