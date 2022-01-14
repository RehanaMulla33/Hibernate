package com.xworkz.medicine.entity;

import java.util.Date;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "medicine_details")

public class MedicineEntity {
	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "expdate")
	private String  expdate;
	@Column(name = "cost")
	private int cost;
	@Column(name = "quantity")
	private float quantity;
	@Column(name = "color")
	private String color;
	@Column(name = "lab")
	private String laboratories;
	@Column(name = "batchno")
	private int batchNo;
	
	public MedicineEntity() {
		// TODO Auto-generated constructor stub
	}

	public MedicineEntity(String name, String expdate, int cost, float quantity, String color, String laboratories,
			int batchNo) {
		super();
		this.name = name;
		this.expdate = expdate;
		this.cost = cost;
		this.quantity = quantity;
		this.color = color;
		this.laboratories = laboratories;
		this.batchNo = batchNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpDate() {
		return expdate;
	}

	public void setExpDate(String expDate) {
		this.expdate = expdate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLaboratories() {
		return laboratories;
	}

	public void setLaboratories(String laboratories) {
		this.laboratories = laboratories;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	@Override
	public String toString() {
		return "MedicineEntity [name=" + name + ", expdate=" + expdate + ", cost=" + cost + ", quantity=" + quantity
				+ ", color=" + color + ", laboratories=" + laboratories + ", batchNo=" + batchNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(batchNo, color, cost, expdate, laboratories, name, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicineEntity other = (MedicineEntity) obj;
		return batchNo == other.batchNo && Objects.equals(color, other.color) && cost == other.cost
				&& Objects.equals(expdate, other.expdate) && Objects.equals(laboratories, other.laboratories)
				&& Objects.equals(name, other.name)
				&& Float.floatToIntBits(quantity) == Float.floatToIntBits(other.quantity);
	}
	
}
