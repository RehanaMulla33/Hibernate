package com.xworkz.City.entity;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "city_details")

public class CityEntity {
	@Id
	@Column(name = "city_id")
	private int id;
	@Column(name = "city_name")
	private String name;
	@Column(name = "city_population")
	private String population;
	@Column(name = "city_famousFor")
	private String famousfor;
	@Column(name = "city_coronaZone")
	private String coronazone;
	
	

	public CityEntity() {
		
	}

	public CityEntity(int id, String name, String population, String famousfor, String coronazone) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousfor = famousfor;
		this.coronazone = coronazone;
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

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getFamousfor() {
		return famousfor;
	}

	public void setFamousfor(String famousfor) {
		this.famousfor = famousfor;
	}

	public String getCoronazone() {
		return coronazone;
	}

	public void setCoronazone(String coronazone) {
		this.coronazone = coronazone;
	}

	@Override
	public String toString() {
		return "CompanyEntity [id=" + id + ", name=" + name + ", population=" + population + ", famousfor=" + famousfor
				+ ", coronazone=" + coronazone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityEntity other = (CityEntity) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
