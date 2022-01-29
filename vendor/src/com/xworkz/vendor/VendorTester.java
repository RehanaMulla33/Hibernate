package com.xworkz.vendor;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.dao.VendorDAOImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImpl;

public class VendorTester {

	public static void main(String[] args) {
//		VendorEntity entity = new VendorEntity("ShwethaMS", "Shwetams@rediffmail.com", "Shwethams", "Newyear@2021",
//				"Bangalore Jaya Prakash Nagar", "ARYZH34TRSMKM", "SmithaNadager", LocalDateTime.now(), "Usha Kulakarni",
//				LocalDateTime.now());

//		VendorEntity entity1 = new VendorEntity("RehanaMS", "rehanas@rediffmail.com", "Rehanna123", "HappyNewyear@2021",
//				"Bangalore Banashankari Nagar", "ARYZH34TRSMKM", "UshaNadager", LocalDateTime.now(), "Usha Kulakarni",
//				LocalDateTime.now());
//		
//		VendorEntity entity2 = new VendorEntity("NetraP Subbalakshmi", "netrasubbalakshmi@gmail.com", "Netralaks453", "Welcome*20222",
//				"Bangalore electronic city", "YZH3786fRSMKM", "UshaNadager", LocalDateTime.now(), "Usha Kulakarni",
//				LocalDateTime.now());

		VendorDAO dao = new VendorDAOImpl();
		VendorService service = new VendorServiceImpl(dao);
//		dao.save(entity);
//		dao.save(entity1);
		// dao.save(entity2);

		 //service.ValidateLoginAndpassword("Rehanna123","HappyNewyear@2021");

		service.validateAndChangePassword("netrasubbalakshmi@gmail.com", "Manufactures@123");

		// boolean valid=service.validateAndChangePassword("Rehanna123",
		// "Rehana@123*ms");

	}

}
