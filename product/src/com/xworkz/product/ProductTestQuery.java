package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class ProductTestQuery {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOImpl();
		// System.out.println(dao.getBypriceGreaterThan(1000f));
		// System.out.println(dao.getBypriceGreaterThan(1000f).size());
		// System.out.println(dao.getByPriceLesserThan(500));
		// System.out.println(dao.getByPriceLesserThan(1000).size());
		// System.out.println(dao.getNameAndPrice());
		// System.out.println(dao.getByNameandId("Nivea",2));
		// System.out.println(dao.getTotalName());
		// System.out.println(dao.getTotalName().size());
		// System.out.println(dao.getMaxPrice());
		// System.out.println(dao.getQuantityByName("Dettol"));
		// System.out.println(dao.getNameAndPriceByBrand("Biocare Ltd"));
		// System.out.println(dao.getQuantityAndpriceByNameAndId("Fogg", 5));
		// System.out.println(dao.getQuantityAndpriceByName("Colgate"));
		// System.out.println(dao.getBrand("Watch"));

		//System.out.println(dao.getTotalPrice());

		 //System.out.println(dao.getByBrand("Ullas"));

		System.out.println(dao.getByNameLike("De"));

	}

}
