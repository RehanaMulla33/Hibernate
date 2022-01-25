package com.xworkz.autoservices.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "autoservice")

public class AutoServicesEntity {

	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	@Column(name = "a_name")
	private String fName;
	@Column(name = "a_lName")
	private String lName;
	@Column(name = "a_email")
	private String email;
	@Column(name = "a_phoneNo")
	private String phoneNo;
	@Column(name = "a_vType")
	private String vType;
	@Column(name = "a_location")
	private String location;
	@Column(name = "a_password")
	private String password;
	@Column(name = "a_createdBy")
	private String created_By;
	@Column(name = "a_createdAt")
	private LocalDateTime created_At;
	@Column(name = "a_updatedBy")
	private String updated_By;
	@Column(name = "a_updatedAt")
	private LocalDateTime updated_At;

	public AutoServicesEntity(String fName, String lName, String email, String phoneNo, String vType, String location,
			String password, String created_By, LocalDateTime created_At, String updated_By, LocalDateTime updated_At) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.vType = vType;
		this.location = location;
		this.password = password;
		this.created_By = created_By;
		this.created_At = created_At;
		this.updated_By = updated_By;
		this.updated_At = updated_At;
	}

}
