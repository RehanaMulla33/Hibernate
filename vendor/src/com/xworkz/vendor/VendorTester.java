package com.xworkz.vendor;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.dao.VendorDAOImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImpl;

public class VendorTester {

	public static void main(String[] args) {
		VendorEntity entity = new VendorEntity("ShwethaMS", "Shwetams@rediffmail.com", "Shwethams", "Newyear@2021",
				"Bangalore Jaya Prakash Nagar", "ARYZH34TRSMKM", "SmithaNadager", LocalDateTime.now(), "Usha Kulakarni",
				LocalDateTime.now());
		VendorDAO dao = new VendorDAOImpl();
		VendorService service = new VendorServiceImpl(dao);
		service.validateAndSave(entity);

	}

}
