package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristRunner {

	public static void main(String[] args) {
		//TouristEntity entity=new TouristEntity(1122, "KanyaKumari", "800","Tea/Coffee/Culture", "Winter", 2000);
		
		List<TouristEntity>touristEnt=new ArrayList<TouristEntity>();
			
		touristEnt.add(new TouristEntity(1122, "Kaziranga National Park", "800","Tea/Coffee/Culture", "Winter", 400));
		touristEnt.add(new TouristEntity(1222, "Nathula Pass, Sikkim", "1100","Bengal Tigers", "Winter", 500));
		touristEnt.add(new TouristEntity(1322, "Nohkalikai Falls", "800","Dainthlen Waterfall", "Summer", 500));
		touristEnt.add(new TouristEntity(1422, "Tawang Monastery", "1100","Tea/Coffee/Culture", "Winter", 600));
		touristEnt.add(new TouristEntity(1522, "Ziro Valley", "800","Meghna Cave Temple", "autumn", 600))
		;
		touristEnt.add(new TouristEntity(1622, "Goechala", "800","Khecheopalri Lake", "Rainy", 800));
		touristEnt.add(new TouristEntity(1722, "Cherrapunji", "1100","Dainthlen Waterfall", "Summer", 600));
		touristEnt.add(new TouristEntity(1822, "Mawsynram", "800","Mawshun Cave", "autumn", 900));
		touristEnt.add(new TouristEntity(1922, "Mawlynnong", "1100","Kanchenjunga Fall", "Rainy", 2000));
		touristEnt.add(new TouristEntity(2022, "Gangtok", "800","Zoological Park", "Summer", 1000));
		
		touristEnt.add(new TouristEntity(2122, "Pelling", "2000","Auniati Satra", "autumn", 1000));
		touristEnt.add(new TouristEntity(2222, "Majuli", "1300","Khanikar Park", "Winter", 1500));
		touristEnt.add(new TouristEntity(2322, "Dibrugarh", "1300","mountaineering", "Winter", 2000));
		touristEnt.add(new TouristEntity(2422, "Tsomgo Lake", "800","Butterfly Museum", "Rainy", 600));
		touristEnt.add(new TouristEntity(2522, "Gorichen Peak", "700","Chittagong Hills", "Summer", 1000));
		
		touristEnt.add(new TouristEntity(2622, "Shillong", "800","Triple Falls", "autumn", 200));
		touristEnt.add(new TouristEntity(2722, "Agartala", "1300","Shilloi Lake", "Winter", 800));
		touristEnt.add(new TouristEntity(2822, "Dimapur", "800","Thangjing Temple", "autumn", 1000));
		touristEnt.add(new TouristEntity(2922, "Kohima", "1500","Touphema Village", "Winter", 700));
		touristEnt.add(new TouristEntity(3022, "Imphal", "800","Keibul Lamjao National Park", "Rainy", 900));
		
		touristEnt.add(new TouristEntity(3122, "Aizawl", "800","Durtlang Hills", "Summer", 700));
		touristEnt.add(new TouristEntity(3222, "Lunglei", "1300","Thorangtlang Wildlife", "Winter", 1000));
		touristEnt.add(new TouristEntity(3322, "Guwahati", "800","Kamakhya Temple", "Winter", 1000));
		touristEnt.add(new TouristEntity(3422, "Roing", "1500","Wildlife/Culture", "Winter", 900));
		touristEnt.add(new TouristEntity(3522, "darjaling", "800","Royal Bengal tigers", "Rainy", 900));
		
		touristEnt.add(new TouristEntity(3622, "Howrah BridgeJ", "1300","Bridge", "Summer", 900));
		touristEnt.add(new TouristEntity(3722, "Jorasanko Thakurbari", "800","Park", "Winter", 1000));
		touristEnt.add(new TouristEntity(3822, "MuseumVictoria", "800","National Museum", "autumn", 600));
		touristEnt.add(new TouristEntity(3922, "Bikaner", "700","Lake", "Rainy", 800));
		touristEnt.add(new TouristEntity(8822, "Nashik", "1300","Tea/Coffee/Culture", "Summer", 700));
		
		touristEnt.add(new TouristEntity(4022, "harishchandragad", "800","Coffee/Culture", "Winter", 900));
		touristEnt.add(new TouristEntity(4122, "coimbatore", "800","Tea/Coffee/Culture", "Winter", 1000));
		touristEnt.add(new TouristEntity(87222, "uttarakhand", "1400","Temple", "Rainy", 1000));
		touristEnt.add(new TouristEntity(4322, "Mandarmani", "800","banana boat rides", "Summer", 2000));
		touristEnt.add(new TouristEntity(4422, "Bishnupur", "800","TempleRadha", "Winter", 1000));
		touristEnt.add(new TouristEntity(4522, "Sunderbans", "1400","Sundarban Tiger ", "Winter", 700));
		
		touristEnt.add(new TouristEntity(4622, "Digha", "1300","BeachShankarpur", "Rainy", 900));
		touristEnt.add(new TouristEntity(4722, "Radhanagar Beach", "800","beech/Culture", "Summer", 600));
		touristEnt.add(new TouristEntity(4822, "GoaPuri", "800","beach", "Winter", 400));
		touristEnt.add(new TouristEntity(4922, "Ranthambore", "1400","National Park ", "autumn", 300));
		touristEnt.add(new TouristEntity(5022, "Jaipur", "2000","Jal Mahal ", "Rainy", 400));
		
		touristEnt.add(new TouristEntity(5122, "Jodhpur", "1400","cultural wealth", "Summer", 500));
		touristEnt.add(new TouristEntity(5222, "Alwar", "2000","Government Museum", "Winter", 700));
		touristEnt.add(new TouristEntity(5322, "Ajmer and Pushkar", "2000","Ajmer Shareef", "Rainy", 500));
		touristEnt.add(new TouristEntity(5422, "Bundi", "1300","Taragarh Fort", "Summer", 700));
		touristEnt.add(new TouristEntity(5522, "Bharatpur", "800","Gol bagh Palace", "Winter", 2000));
		
		touristEnt.add(new TouristEntity(5622, "Kota", "2000","TKansua Temple", "autumn", 2000));
		touristEnt.add(new TouristEntity(5722, "Mount Abu", "1400","Achalgarh Fort", "Rainy", 500));
		touristEnt.add(new TouristEntity(5822, "Udaipur", "800","Culture", "Winter", 500));
		touristEnt.add(new TouristEntity(5922, "Shekhawati", "1300","Bagore ki Haveli", "autumn", 700));
		touristEnt.add(new TouristEntity(6022, "Virat Nagar", "800","Nawalgarh", "Winter", 2000));
		
		touristEnt.add(new TouristEntity(6122, "Kumbhalgarh", "2000","Vedi Temple", "Winter", 700));
		touristEnt.add(new TouristEntity(6222, "Sariska", "800","Jaisamand Lake", "Rainy", 400));
		touristEnt.add(new TouristEntity(6322, "Chittorgarh", "2000","Padmini Palace", "Summer", 400));
		touristEnt.add(new TouristEntity(6422, "Ranakpur", "1300","Jain Temples", "Winter", 2000));
		touristEnt.add(new TouristEntity(6522, "Bishnoi", "2000","culture", "Rainy", 2000));
		
		touristEnt.add(new TouristEntity(6622, "Taj Mahal", "800","Mumtaz Mahal", "Summer", 2000));
		touristEnt.add(new TouristEntity(6722, "Agra Fort", "1400","Jahangir Palace", "Winter", 700));
		touristEnt.add(new TouristEntity(6822, "Fatehpur Sikri", "800","Tea", "autumn", 400));
		touristEnt.add(new TouristEntity(6922, "Wildlife SOS", "800","Wildlife", "Rainy", 500));
		touristEnt.add(new TouristEntity(7022, "Mecca Masjid", "1300","Tea", "Summer", 800));
		
		touristEnt.add(new TouristEntity(7122, "Elephanta Caves", "800","Sculptures", "autumn", 800));
		touristEnt.add(new TouristEntity(7122, "Gateway of India", "2000","Architecture", "Winter", 700));
		touristEnt.add(new TouristEntity(7322, "Marine Drive", "800","Sunset", "Rainy", 500));
		touristEnt.add(new TouristEntity(7422, "Chhatrapati Shivaji", "1300","Gothic Architecture", "Summer", 500));
		touristEnt.add(new TouristEntity(7522, "Haji Ali Shrine", "1400","Dargah", "Winter", 700));
		
		touristEnt.add(new TouristEntity(7622, "Siddhivinayak Temple", "800","Worship", "autumn", 2000));
		touristEnt.add(new TouristEntity(7722, "Lady of the Mount", "1400","Church", "Rainy", 800));
		touristEnt.add(new TouristEntity(7822, "Flora Fountain", "1300","Ornamental architecture", "Summer", 700));
		touristEnt.add(new TouristEntity(7922, "Bhau Daji", "800","History", "Winter", 2000));
		touristEnt.add(new TouristEntity(8022, "Fort Bassein", "1400","Nature", "autumn", 500));
		touristEnt.add(new TouristEntity(8122, "Warangal", "1100","forests", "Rainy", 700));
		
		touristEnt.add(new TouristEntity(8222, "Medak", "800","brahminy duck", "Summer", 900));
		touristEnt.add(new TouristEntity(8322, "Sangareddy", "1300","museum", "autumn", 800));
		touristEnt.add(new TouristEntity(8422, "Nizamabad", "800","Nizamabad Fort", "Winter", 900));
		touristEnt.add(new TouristEntity(8522, "Ramagundam", "1400","Ramagundam Dam", "Rainy", 800));
		touristEnt.add(new TouristEntity(8622, "Karimnagar", "1100","Manthani Temple", "Summer", 500));
		
		touristEnt.add(new TouristEntity(8722, "Khammam", "800","Lakaram Lake", "autumn", 900));
		touristEnt.add(new TouristEntity(8822, "Mahbubnagar", "1300","The Tiger Wilds Jungle", "Winter", 2000));
		touristEnt.add(new TouristEntity(8922, "Adilabad", "800","Wildlife", "Rainy", 800));
		touristEnt.add(new TouristEntity(9022, "Nalgonda", "1400","Sagar Dam", "Summer", 900));
		touristEnt.add(new TouristEntity(9122, "Rangareddy", "1100","Lord Shiva devotees", "autumn", 800));
		
		touristEnt.add(new TouristEntity(9222, "Sircilla", "1300","Rajeswara Swamy Temple", "Winter", 900));
		touristEnt.add(new TouristEntity(9322, "Pondicherry", "800","Matrimandir", "Rainy", 500));
		touristEnt.add(new TouristEntity(9422, "Mudumalai", "1400","Nilgiri Hills", "Summer", 2000));
		touristEnt.add(new TouristEntity(9522, "Rameswaram", "800","lord Rama", "Winter", 900));
		touristEnt.add(new TouristEntity(9622, "Madurai", "800","Meenakshi temple", "autumn", 2000));
		touristEnt.add(new TouristEntity(9722, "Dhanushkodi", "1300","Adam’s bridge", "Rainy", 900));

		
		TouristDAO dao=new TouristDAOImpl();
		
		dao.putall(touristEnt);
	

	}

}
