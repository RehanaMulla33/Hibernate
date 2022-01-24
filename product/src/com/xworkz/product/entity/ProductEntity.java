package com.xworkz.product.entity;

import javax.persistence.Column;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "product")

@NamedQueries({ 
	@NamedQuery (name="getAll", query="select product from ProductEntity product"),
	 @NamedQuery (name="getBypriceGreaterThan", query="select product.price from ProductEntity product where product.price >:cutoffprice"),
	 @NamedQuery (name="getByPriceLesserThan", query="select product.price from ProductEntity product where product.price <:cutoffprice"),
	 @NamedQuery (name="getByNameAndId", query="select product from ProductEntity as product where product.name = :setname and product.id=:setid"),
	 @NamedQuery (name="getTotalName", query="select product.name from ProductEntity as product"),
	 @NamedQuery (name="getMaxPrice", query="select max(product.price) from ProductEntity as product"),
	 @NamedQuery (name="getTotalPrice", query="select sum(product.price) from ProductEntity as product"),
	 @NamedQuery (name="getByNameLike", query="select product from ProductEntity product where product.name like:search"),
	 @NamedQuery (name="getQuantityByName", query="select product.quantity from ProductEntity as product where product.name=:setname"),
	 @NamedQuery (name="getQuantityAndPriceByName", query="select p.quantity,p.price from ProductEntity as p  where p.name=:setname"),
	 @NamedQuery (name="getByBrand", query="select p.brand from ProductEntity as p where p.brand=:setbrand"),
	 @NamedQuery (name="getNameAndPrice", query="select p.name,p.price from ProductEntity p "),
	 @NamedQuery (name="getBrand", query="select p.brand from ProductEntity as p where p.name=:setname"),
	 @NamedQuery (name="getNameAndPriceByBrand", query="select p.name,p.price from ProductEntity p where p.brand=:setbrand"),
	 @NamedQuery (name="getTotalNames", query="select product.name from ProductEntity as product"),
	 @NamedQuery (name="getQuantityAndPriceByNameAndId", query="select p.quantity,p.price from ProductEntity as p where p.name=:setname and p.id=:setid")
	 

})
public class ProductEntity {
	@Id
	@Column(name = "p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_quantity")
	private int quantity;
	@Column(name = "p_brand")
	private String brand;
	@Column(name = "p_price")
	private float price;
	@Column(name = "p_rating")
	private int rating;
	
	
	public ProductEntity(String name, int quantity, String brand, float price, int rating) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
	}
	
	
}


