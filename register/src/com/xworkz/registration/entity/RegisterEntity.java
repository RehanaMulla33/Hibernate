package com.xworkz.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor

@Entity
@Table(name = "register_entity")

public class RegisterEntity {
	@Id
	@Column(name = "ir_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "r_name")
	private String name;
	@Column(name = "r_email")
	private String email;
	@Column(name = "r_password")
	private String password;
	@Column(name = "r_city")
	private String city;
	@Column(name = "r_country")
	private String country;
	@Column(name = "r_mobileno")
	private long mobileno;
	@Column(name = "r_indiancitizen")
	private boolean indainCititzen;

	public RegisterEntity(String name, String email, String password, String city, String country, long mobileno,
			boolean indainCititzen) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.mobileno = mobileno;
		this.indainCititzen = indainCititzen;
	}

}
