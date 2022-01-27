package com.xworkz.autoservices;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.autoservices.dao.AutoServicesDAO;
import com.xworkz.autoservices.dao.AutoServicesDAOImpl;
import com.xworkz.autoservices.entity.AutoServicesEntity;
import com.xworkz.autoservices.service.ValidateAutoService;
import com.xworkz.autoservices.service.ValidateAutoServiceImpl;

public class AutoservicesScanner {

	public static void main(String[] args) {
		List<AutoServicesEntity> entities = new ArrayList<AutoServicesEntity>();

//		entities.add(new AutoServicesEntity("Shweta","Sharma","Shweta_sharma88@gmail.com","919886669214","Suzuki","BTM Layout","Helloone*123","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Mubben","Sharma","mubben.sharma@gmail.com","918123079652","TOYOTO","Banashankari","Ankita*988","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("savita","Desai","Savita@gmail.com","918792510836","AUDI","BTM Layout","Newyear@2021","Manoj*123",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Jogita","Shailaja","Jogita_mr@gmail.com","919481826427","Nissan","BTM Layout","Mrunal_129verma","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Bharat","H","manojhd_56@gmail.com","9186","MINI","BTM Layout","Hegde812988","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));

//		entities.add(new AutoServicesEntity("Prajwal","Smith","ps_smitha@gmail.com","7892166339","SATURN","BTM Layout","PrajwalSmith*92","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Prateek","Goel","goel11prteek@gmail.com","7026745897","SCION","BTM Layout","Goel*1996","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Neha","Solanki","solankiNeha@gmail.com","9686969501","KIA","J P nagar","Solanki.neha","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Shrushti","Tiwari","tiwariJian@gmail.com","6361150052","HYUNDI","Electronic City","Tiwari@shruti","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Paavani","B S","BS.Pawani@gmail.com","8296671748","MERCURY","Silk Board","PaavaniBS99","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		
//		entities.add(new AutoServicesEntity("Namita","Yadav","yadavnami23@gmail.com","7760458170","MAZDA","Jaya Nagar","Yadav1998@","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Shankar","Patil","patil456.shankar@gmail.com","8123220732","INFINITY","Malleshwaram","Patil.shankar44","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Mukti","Gupta","agupta.mukti99@gmail.com","9886330991","HONDA","Dasar Halli","GuptaDas77","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Ankita","Sharma","ankita.sharma@gmail.com","9902672802","FORD","Katriguppe","Sharma.Anku","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//				
//		entities.add(new AutoServicesEntity("Vanshita","P T","pt.vanshi45@gmail.com","7829378786","CHEVROLET","Banashankari","Vanshita@1990","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Suresh","naidu","naidusuresh785@gmail.com","812300145","TVS Jupitor","BTM Layout","Naidu@1972","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Muktiyar","Ahmed","ahmed.mukti765@gmail.com","9532233870","HONDA DIO","Banashankari","Muktiyar@1990","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Rabiya","Hussain","rabi.hussain22@gmail.com","8061914005","Hero Pleasure","BTM Layout","Rabiy.Hs@87","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		entities.add(new AutoServicesEntity("Divya","Bhattacharya","divya.bhatt@gmail.com","6363340480","SUZUKI Access","Banashankari","DivyaBTS.67","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
//		
		// AutoservicesDAO dao=new AutoservicesDAOImpl();

		// dao.saveAll(entities);
		AutoServicesEntity autoEntity1 = new AutoServicesEntity("SuhanaMulla", "T M", "suhmula@Gmail.com",
				"912381289231", "Maruti", "J P nagar", "Robert12*rt", "Rehana", LocalDateTime.now(), "Mulla",
				LocalDateTime.now());

		AutoServicesEntity autoEntity = new AutoServicesEntity("SuhanaMulla", "ss", "suhmula@Gmail.com", "8128923",
				"Ma", "J", "Ro", "", LocalDateTime.now(), "", LocalDateTime.now());
//		AutoServicesDAO dao=new AutoServicesDAOImpl();
//		dao.save(autoEntity);

		ValidateAutoService service = new ValidateAutoServiceImpl();
		service.validateAndSave(autoEntity1);
		service.validateAndSave(autoEntity);

	}

}
