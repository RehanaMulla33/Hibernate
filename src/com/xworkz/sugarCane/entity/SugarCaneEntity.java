package com.xworkz.sugarCane.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sugarcane_details")

public class SugarCaneEntity {
	@Id
	@Column(name = "seasonYield")
	private String seasonYield;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "temp")
	private int temp;
	@Column(name = "price")
	private int price;
	@Column(name = "place")
	private String place;
	@Column(name = "soilType")
	private String soilType;

	public SugarCaneEntity() {

		// TODO Auto-generated constructor stub
	}

	public SugarCaneEntity(String seasonYield, int quantity, int temp, int price, String place, String soilType) {
		super();
		this.seasonYield = seasonYield;
		this.quantity = quantity;
		this.temp = temp;
		this.price = price;
		this.place = place;
		this.soilType = soilType;
	}

	public String getSeasonYield() {
		return seasonYield;
	}

	public void setSeasonYield(String seasonYield) {
		this.seasonYield = seasonYield;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSoilType() {
		return soilType;
	}

	public void setSoilType(String soilType) {
		this.soilType = soilType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(place, price, quantity, seasonYield, soilType, temp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SugarCaneEntity other = (SugarCaneEntity) obj;
		return Objects.equals(place, other.place) && price == other.price && quantity == other.quantity
				&& Objects.equals(seasonYield, other.seasonYield) && Objects.equals(soilType, other.soilType)
				&& temp == other.temp;
	}

	@Override
	public String toString() {
		return "SugarCaneEntity [seasonYield=" + seasonYield + ", quantity=" + quantity + ", temp=" + temp + ", price="
				+ price + ", place=" + place + ", soilType=" + soilType + "]";
	}

}
