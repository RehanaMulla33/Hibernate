package com.xworkz.airport;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.airport.dao.AirportDAO;

import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.entity.AirportEntity;



public class AirportScanner {

	public static void main(String[] args) {
		
		List<AirportEntity>airportEnt=new ArrayList<AirportEntity>();
		
		airportEnt.add(new AirportEntity("1VA", "Coimbatore", "East", "Pier", 15, 6, 61));
		airportEnt.add(new AirportEntity("2VH", "Gaya Airport", "West", "Satellite_terminal", 12, 6, 72));
		airportEnt.add(new AirportEntity("3VC", "Sardar Vallabhbhai", "North", "other", 13, 6, 64));
		airportEnt.add(new AirportEntity("4VD", "Indira Gandhi", "South", "Pier", 14, 7, 61));
		airportEnt.add(new AirportEntity("5VH", "Lokpriya Gopinath", "East", "Semicircular_terminal", 15, 6, 22));
		airportEnt.add(new AirportEntity("6VM", "Kempegowda", "East", "other", 16, 6, 63));
		airportEnt.add(new AirportEntity("7VVAK", "Hubballi Airport", "East", "Pier", 15, 8, 62));
		airportEnt.add(new AirportEntity("8VABJ", "Mysore Airport", "South", "Semicircular_terminal", 17, 6, 30));
		airportEnt.add(new AirportEntity("9VAB10", "HAL Bangalore ", "East", "Pier", 18, 16, 61));
		airportEnt.add(new AirportEntity("11VABP", "Jakkur Aerodrome", "South", "Pier", 19, 26, 600));
		airportEnt.add(new AirportEntity("12VAGN", "Guwahati", "East", "Semicircular_terminal", 20, 26, 220));
		airportEnt.add(new AirportEntity("13VADN", "Tezpur", "South", "Satellite_terminal", 21, 6, 120));
		airportEnt.add(new AirportEntity("14VAID", "Silchar Airport", "South", "other", 22, 6, 45));
		airportEnt.add(new AirportEntity("15VAJL", "Dimapur Airport", "West", "Pier", 23, 6, 69));
		airportEnt.add(new AirportEntity("16VAJM", "Agartala Airport", "South", "Pier", 24, 6, 33));
		airportEnt.add(new AirportEntity("17VAKE", "Imphal", "East", "Good", 25, 6, 45));
		airportEnt.add(new AirportEntity("18VAKP", "Bathinda Airport	", "West", "Semicircular_terminal", 26, 6, 61));
		airportEnt.add(new AirportEntity("19VAJL", "Sahnewal Airport	", "North", "other", 27, 11, 50));
		airportEnt.add(new AirportEntity("20VALT", "Pathankot Airport	", "East", "Pier", 11, 22, 63));
		airportEnt.add(new AirportEntity("21VANR", "Chandigarh Airport", "South", "Satellite_terminal", 12, 6, 60));
		airportEnt.add(new AirportEntity("22VANP", "Jodhpur Airport", "West", "Pier", 13, 11, 61));
		airportEnt.add(new AirportEntity("23VANR", "Jaisalmer Airport", "East", "other", 14, 16, 60));
		airportEnt.add(new AirportEntity("24VARG", "Kota Airport", "North", "Semicircular_terminal", 18, 22, 66));
		airportEnt.add(new AirportEntity("25VARK", "Kolana", "West", "Pier", 17, 33, 60));
		airportEnt.add(new AirportEntity("26VASD", "Kishangarh", "South", "Semicircular_terminal", 16, 26, 61));
		airportEnt.add(new AirportEntity("27VASL", "Bamrauli", "South", "Semicircular_terminal", 15, 14, 62));
		airportEnt.add(new AirportEntity("28VASU", "Chakeri Airport	", "West", "Pier", 14, 15, 63));
		airportEnt.add(new AirportEntity("29VE89", "Lal Bahadur Shastri ", "South", "Satellite_terminal", 13, 14, 64));
		airportEnt.add(new AirportEntity("30VEAB", "Sarvas Airport", "East", "Semicircular_terminal", 12, 12, 65));
		airportEnt.add(new AirportEntity("31VEAZ", "Hindon", "West", "Semicircular_terminal", 10, 106, 66));
		airportEnt.add(new AirportEntity("32VEAN", "Chakeri", "North", "Satellite_terminal", 18, 22, 67));
		airportEnt.add(new AirportEntity("33VEBA", "Bamrauli", "West", "Pier", 17, 11, 68));
		airportEnt.add(new AirportEntity("34VEBU", "Faizabad", "East", "other", 15, 19, 69));
		airportEnt.add(new AirportEntity("35VEBI", "Lalitpur", "West", "Satellite_terminal", 16, 26, 61));
		airportEnt.add(new AirportEntity("36VEBN", "Jhansi", "South", "Pier", 14, 20, 62));
		airportEnt.add(new AirportEntity("37VEBT", "Gorakhpur", "North", "Pier", 13, 19, 36));
		airportEnt.add(new AirportEntity("38VECA", "Bareilly", "East", "Semicircular_terminal", 12, 18, 23));
		airportEnt.add(new AirportEntity("39VECK", "BR Ambedkar", "West", "Pier", 11, 22, 16));
		airportEnt.add(new AirportEntity("40VECO", "Kushinagar", "North", "other", 10, 23, 26));
		airportEnt.add(new AirportEntity("41VECT", "Salem", "South", "Satellite_terminal", 35, 24, 16));
		airportEnt.add(new AirportEntity("42VEDB", "Madurai", "East", "Pier", 25, 24, 56));
		airportEnt.add(new AirportEntity("43VEDZ", "Warangal", "North", "Satellite_terminal", 15, 25, 16));
		airportEnt.add(new AirportEntity("44VEGK", "Puducherry", "East", "other", 19, 26, 36));
		airportEnt.add(new AirportEntity("45VEIM", "Begumpet", "East", "Satellite_terminal", 15, 17, 66));
		airportEnt.add(new AirportEntity("46VEJH", "Singapore", "North", "Semicircular_terminal", 16, 28, 16));
		airportEnt.add(new AirportEntity("47VEKM", "Raja Zurich", "East", "Semicircular_terminal", 19, 29, 46));
		airportEnt.add(new AirportEntity("48VERK", "Devi AhilyaBai", "North", "Satellite_terminal", 11, 30, 16));
		airportEnt.add(new AirportEntity("49VEKR", "Chennai", "North", "Semicircular_terminal", 15, 18, 26));
		airportEnt.add(new AirportEntity("50VEKM", "Tuticorin", "East", "other", 15, 17, 36));
		airportEnt.add(new AirportEntity("51VELP", "Hosur", "North", "Satellite_terminal", 15, 15, 16));


		AirportDAO dao=new AirportDAOImpl();
		dao.putall(airportEnt);
		
	}
}
