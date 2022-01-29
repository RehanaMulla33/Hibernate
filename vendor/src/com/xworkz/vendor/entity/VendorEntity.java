package com.xworkz.vendor.entity;

import java.time.LocalDateTime;

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

@Entity
@Table(name = "vendor_entity")

@NamedQueries({
		@NamedQuery(name = "findLoginAndPassword", query = "select vendor from VendorEntity as vendor where vendor.loginName=:ln and vendor.password=:pswd"),
		@NamedQuery(name = "findByEmail", query = "select vendor from VendorEntity as vendor where vendor.email=:email"),
		@NamedQuery(name = "updatePasswordByEmail", query = "update VendorEntity  set password= :pass where email= :em")

})

public class VendorEntity {
	@Id
	@Column(name = "v_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	@Column(name = "v_name")
	private String name;
	@Column(name = "v_email")
	private String email;
	@Column(name = "v_loginName")
	private String loginName;
	@Column(name = "v_password")
	private String password;
	@Column(name = "v_address")
	private String address;
	@Column(name = "v_gstNo")
	private String gstNo;
	@Column(name = "v_createdBy")
	private String createdBy;
	@Column(name = "v_createdAt")
	private LocalDateTime createdAt;
	@Column(name = "v_updateBy")
	private String updatedBy;
	@Column(name = "v_updatedAt")
	private LocalDateTime updatedAt;

	public VendorEntity(String name, String email, String loginName, String password, String address, String gstNo,
			String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
		super();
		this.name = name;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
		this.address = address;
		this.gstNo = gstNo;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

}
