package com.xworkz.State.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="State_details")
	
	


public class StateEntity {
	@Id
	@Column(name="state_id")
	private int id;
	@Column(name="state_name")
	private String name;
	@Column(name="state_noOfDist")
	private int noOfDist;
	@Column(name="state_capitalCity")
	private String capitalCity;
	
	
	
	public StateEntity() {
		
		// TODO Auto-generated constructor stub
	}

	public StateEntity(int id, String name, int noOfDist, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDist = noOfDist;
		this.capitalCity = capitalCity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfDist() {
		return noOfDist;
	}

	public void setNoOfDist(int noOfDist) {
		this.noOfDist = noOfDist;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfDist=" + noOfDist + ", capitalCity=" + capitalCity
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitalCity, id, name, noOfDist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateEntity other = (StateEntity) obj;
		return Objects.equals(capitalCity, other.capitalCity) && id == other.id && Objects.equals(name, other.name)
				&& noOfDist == other.noOfDist;
	}

	public void setsCapital(String sCapital) {
		this.capitalCity = sCapital;
	}

	public void deleteById(int i) {
		this.id=id;
		
	}

	public void updateById(String string, String string2, int i) {
		this.name=name;
		
	}


	
	
	
	
	

}
