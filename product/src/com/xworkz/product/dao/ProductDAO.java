package com.xworkz.product.dao;

import java.util.List;
import com.xworkz.product.entity.ProductEntity;

public interface ProductDAO {
	
	void save(ProductEntity prodEntity);
	ProductEntity saveAll(List<ProductEntity> entities);
	List<ProductEntity> getAll();
	
	List<ProductEntity> getBypriceGreaterThan(float price);
	List<ProductEntity> getByPriceLesserThan(float price);
	ProductEntity getByNameandId(String name,int id);
	
	List<String> getTotalName();
	float getMaxPrice();
	float getTotalPrice();
	
	String getByNameLike(String like);
	Object getQuantityByName(String name);
	
	Object[] getQuantityAndpriceByName(String name);
	Object[] getQuantityAndpriceByNameAndId(String name,int id);
	String getByBrand(String brand);
	
	String getBrand(String name);
	List<Object[]>getNameAndPrice();
	Object[] getNameAndPriceByBrand(String brand);

}
