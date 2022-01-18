package com.xworkz.factory.entity;
import java.util.Date;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "factory_details")


public class FactoryEntity {
@Id
@Column(name = "specialized")
private String specialized;
@Column(name = "estDate")
private String estDate;
@Column(name = "branch")
private  String branch;
@Column(name = "noemployees")
private int employees;
@Column(name = "income")
private  long income;
@Column(name = "sector")
private String sector;
@Column(name = "workHours")
private int workHours;

public FactoryEntity() {
	
	// TODO Auto-generated constructor stub
}

public FactoryEntity(String specialized, String estDate, String branch, int employees, long income, String sector,
		int workHours) {
	super();
	this.specialized = specialized;
	this.estDate = estDate;
	this.branch = branch;
	this.employees = employees;
	this.income = income;
	this.sector = sector;
	this.workHours = workHours;
}

public String getSpecialized() {
	return specialized;
}

public void setSpecialized(String specialized) {
	this.specialized = specialized;
}

public String getEstDate() {
	return estDate;
}

public void setEstDate(String estDate) {
	this.estDate = estDate;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public int getEmployees() {
	return employees;
}

public void setEmployees(int employees) {
	this.employees = employees;
}

public long getIncome() {
	return income;
}

public void setIncome(long income) {
	this.income = income;
}

public String getSector() {
	return sector;
}

public void setSector(String sector) {
	this.sector = sector;
}

public int getWorkHours() {
	return workHours;
}

public void setWorkHours(int workHours) {
	this.workHours = workHours;
}

@Override
public int hashCode() {
	return Objects.hash(branch, employees, estDate, income, sector, specialized, workHours);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FactoryEntity other = (FactoryEntity) obj;
	return Objects.equals(branch, other.branch) && employees == other.employees
			&& Objects.equals(estDate, other.estDate) && income == other.income && Objects.equals(sector, other.sector)
			&& Objects.equals(specialized, other.specialized) && workHours == other.workHours;
}

@Override
public String toString() {
	return "FactoryEntity [specialized=" + specialized + ", estDate=" + estDate + ", branch=" + branch + ", employees="
			+ employees + ", income=" + income + ", sector=" + sector + ", workHours=" + workHours + "]";
}





}
