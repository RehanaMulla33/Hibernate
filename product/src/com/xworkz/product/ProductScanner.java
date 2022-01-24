package com.xworkz.product;

import java.util.ArrayList;
import java.util.List;


import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class ProductScanner {

	public static void main(String[] args) {
//	ProductEntity prodEntity=new ProductEntity("Ullas Agarabatti",100,"Ullas",(float) 2000.00,4);
//		ProductDAO dao= new ProductDAOImpl();
//		dao.save(prodEntity);
//		
		
		List<ProductEntity> entities=new ArrayList<ProductEntity>();
		
		entities.add(new ProductEntity("Nivea",10,"Hindustan Ltd",2500,5));
		entities.add(new ProductEntity("JK Tyre",6,"Mahindra Ltd",100000,5));
		entities.add(new ProductEntity("Fitness Gear",1,"Techno Medicals Ltd",250,3));
		entities.add(new ProductEntity("Fogg",5,"Lakme",2300,4));
		entities.add(new ProductEntity("Lenscart",10,"Biocare Ltd",4000,4));
		
		entities.add(new ProductEntity("MaxFresh",15,"Hindustan Ltd",1800,5));
		entities.add(new ProductEntity("Colgate",20,"Hindustan Ltd",2700,3));
		entities.add(new ProductEntity("Dettol",30,"Hindustan Ltd",3500,5));
		entities.add(new ProductEntity("Helmet",2,"Vega Crux Ltd",5000,4));
		entities.add(new ProductEntity("Ashwagandha",30,"Himalaya Ltd",2900,4));
		
		entities.add(new ProductEntity("Green Herbs",10,"Oziva Ltd",2500,5));
		entities.add(new ProductEntity("Harpic",10,"Hindustan Ltd",5080,5));
		entities.add(new ProductEntity("Loreal Paris",5,"Hindustan Ltd",2500,5));
		entities.add(new ProductEntity("Watch",3,"Boat storm ",2500,5));
				
		entities.add(new ProductEntity("Tablets ",1,"Samsung Ltd",20000,4));
		entities.add(new ProductEntity("HeadPhone",16,"Redmi ",25000,5));
		entities.add(new ProductEntity("Sports Shoes ",10,"Puma ",28000,5));
		entities.add(new ProductEntity("Refrigerator",5,"Haier Digital ",126580,5));
		entities.add(new ProductEntity("Smart phone",10,"Oppo ",25900,5));
		
//		ProductDAO dao=new ProductDAOImpl();
//		dao.saveAll(entities);


		
	
		}
}
