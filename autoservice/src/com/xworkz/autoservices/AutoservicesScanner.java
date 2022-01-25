package com.xworkz.autoservices;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;
import com.xworkz.autoservices.dao.AutoservicesDAO;
import com.xworkz.autoservices.dao.AutoservicesDAOImpl;
import com.xworkz.autoservices.entity.AutoservicesEntity;
import com.xworkz.autoservices.service.ValidateAutoservice;
import com.xworkz.autoservices.service.ValidateAutoserviceImpl;

public class AutoservicesScanner {

	public static void main(String[] args) {
List<AutoservicesEntity> entities=new ArrayList<AutoservicesEntity>();
		
		entities.add(new AutoservicesEntity("Manoj","Sharma","manoj_sharma88@gmail.com","9886669214","Suzuki","BTM Layout","Helloone*123","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Ankita","Sharma","ankita.sharma@gmail.com","8123079652","TOYOTO","Banashankari","Ankita*988","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Santosh","Desai","desaisantu@gmail.com","8792510836","AUDI","BTM Layout","Newyear@2021","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Mrunal","Verma","verma_mr@gmail.com","9481826427","Nissan","BTM Layout","Mrunal_129verma","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Manoj","Hegade","manojhd_56@gmail.com","8660981304","MINI","BTM Layout","Hegde@1988","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		
		entities.add(new AutoservicesEntity("Prajwal","Smith","ps_smitha@gmail.com","7892166339","SATURN","BTM Layout","PrajwalSmith*92","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Prateek","Goel","goel11prteek@gmail.com","7026745897","SCION","BTM Layout","Goel*1996","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Neha","Solanki","solankiNeha@gmail.com","9686969501","KIA","J P nagar","Solanki.neha","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Shrushti","Tiwari","tiwariJian@gmail.com","6361150052","HYUNDI","Electronic City","Tiwari@shruti","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Paavani","B S","BS.Pawani@gmail.com","8296671748","MERCURY","Silk Board","PaavaniBS99","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		
		entities.add(new AutoservicesEntity("Namita","Yadav","yadavnami23@gmail.com","7760458170","MAZDA","Jaya Nagar","Yadav1998@","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Shankar","Patil","patil456.shankar@gmail.com","8123220732","INFINITY","Malleshwaram","Patil.shankar44","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Mukti","Gupta","agupta.mukti99@gmail.com","9886330991","HONDA","Dasar Halli","GuptaDas77","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Ankita","Sharma","ankita.sharma@gmail.com","9902672802","FORD","Katriguppe","Sharma.Anku","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
				
		entities.add(new AutoservicesEntity("Vanshita","P T","pt.vanshi45@gmail.com","7829378786","CHEVROLET","Banashankari","Vanshita@1990","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Suresh","naidu","naidusuresh785@gmail.com","812300145","TVS Jupitor","BTM Layout","Naidu@1972","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Muktiyar","Ahmed","ahmed.mukti765@gmail.com","9532233870","HONDA DIO","Banashankari","Muktiyar@1990","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Rabiya","Hussain","rabi.hussain22@gmail.com","8061914005","Hero Pleasure","BTM Layout","Rabiy.Hs@87","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		entities.add(new AutoservicesEntity("Divya","Bhattacharya","divya.bhatt@gmail.com","6363340480","SUZUKI Access","Banashankari","DivyaBTS.67","Manoj",LocalDateTime.now(),"RehanaMulla",LocalDateTime.now()));
		
		//AutoservicesDAO dao=new AutoservicesDAOImpl();

		//dao.saveAll(entities);
		
		AutoservicesEntity autoEntity=new AutoservicesEntity("","T","","8128923","Ma","J","Ro","",LocalDateTime.now(),"",LocalDateTime.now());
//		AutoservicesDAO dao=new AutoservicesDAOImpl();
//		dao.save(autoEntity);
//		
		ValidateAutoservice service=new ValidateAutoserviceImpl();
		service.validateAndSave(autoEntity);
		


	}

}
