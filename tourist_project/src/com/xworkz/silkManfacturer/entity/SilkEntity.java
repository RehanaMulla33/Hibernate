package com.xworkz.silkManfacturer.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "silkmnf_details")


public class SilkEntity {
	@Id
	@Column(name = "country")
	private String country;
	@Column(name = "typeOfSilk")
	private String typeOfSilk;
	@Column(name = "washTemp")
	private float washTemp;
	@Column(name = "usedIn")
	private String usedIn;
	@Column(name = "threadCount")
	private int threadCount;
	@Column(name = "composition")
	private String composition;
	@Column(name = "cost")
	private int cost;
	
	
	public SilkEntity() {
		
		// TODO Auto-generated constructor stub
	}


	public SilkEntity(String country, String typeOfSilk, float washTemp, String usedIn, int threadCount,
			String composition, int cost) {
		super();
		this.country = country;
		this.typeOfSilk = typeOfSilk;
		this.washTemp = washTemp;
		this.usedIn = usedIn;
		this.threadCount = threadCount;
		this.composition = composition;
		this.cost = cost;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getTypeOfSilk() {
		return typeOfSilk;
	}


	public void setTypeOfSilk(String typeOfSilk) {
		this.typeOfSilk = typeOfSilk;
	}


	public float getWashTemp() {
		return washTemp;
	}


	public void setWashTemp(float washTemp) {
		this.washTemp = washTemp;
	}


	public String getUsedIn() {
		return usedIn;
	}


	public void setUsedIn(String usedIn) {
		this.usedIn = usedIn;
	}


	public int getThreadCount() {
		return threadCount;
	}


	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}


	public String getComposition() {
		return composition;
	}


	public void setComposition(String composition) {
		this.composition = composition;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	@Override
	public int hashCode() {
		return Objects.hash(composition, cost, country, threadCount, typeOfSilk, usedIn, washTemp);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SilkEntity other = (SilkEntity) obj;
		return Objects.equals(composition, other.composition) && cost == other.cost
				&& Objects.equals(country, other.country) && threadCount == other.threadCount
				&& Objects.equals(typeOfSilk, other.typeOfSilk) && Objects.equals(usedIn, other.usedIn)
				&& Float.floatToIntBits(washTemp) == Float.floatToIntBits(other.washTemp);
	}


	@Override
	public String toString() {
		return "SilkEntity [country=" + country + ", typeOfSilk=" + typeOfSilk + ", washTemp=" + washTemp + ", usedIn="
				+ usedIn + ", threadCount=" + threadCount + ", composition=" + composition + ", cost=" + cost + "]";
	}
	
	
	
	


}
