package com.xworkz.biscuit.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "biscuit_details")


public class BiscuitEntity {
	@Id
	@Column(name = "biscuitId")
	private int id;
	@Column(name = "price")
	private  int price;
	@Column(name = "weight")
	private float weight;
	@Column(name = "color")
	private String color;
	@Column(name = "mfgdate")
	private String mfgDate;
	@Column(name = "shape")
	private String shape;
	@Column(name = "aroma")
	private String aroma;

	
	public BiscuitEntity() {
		
		// TODO Auto-generated constructor stub
	}

	public BiscuitEntity(int id, int price, float weight, String color, String mfgDate, String shape,
			String aroma) {
		super();
		this.id = id;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.mfgDate = mfgDate;
		this.shape = shape;
		this.aroma = aroma;
	}

	public int getId() {
		return id;
	}

	public void setType(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	@Override
	public String toString() {
		return "BiscuitEntity [id=" + id + ", price=" + price + ", weight=" + weight + ", color=" + color
				+ ", mfgDate=" + mfgDate + ", shape=" + shape + ", aroma=" + aroma + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aroma, color, mfgDate, price, shape, id, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BiscuitEntity other = (BiscuitEntity) obj;
		return Objects.equals(aroma, other.aroma) && Objects.equals(color, other.color)
				&& Objects.equals(mfgDate, other.mfgDate) && price == other.price && Objects.equals(shape, other.shape)
				&& Objects.equals(id, other.id)
				&& Float.floatToIntBits(weight) == Float.floatToIntBits(other.weight);
	}
}
