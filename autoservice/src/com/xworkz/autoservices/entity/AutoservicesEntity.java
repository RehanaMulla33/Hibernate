package com.xworkz.autoservices.entity;

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
	@ToString
	@EqualsAndHashCode

	@Entity
	@Table(name = "autoservice")

	public class AutoservicesEntity {

		@Id
		@Column(name = "a_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
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
		
		public AutoservicesEntity(String fName, String lName, String email, String phoneNo, String vType,
				String location, String password) {
			super();
			this.fName = fName;
			this.lName = lName;
			this.email = email;
			this.phoneNo = phoneNo;
			this.vType = vType;
			this.location = location;
			this.password = password;
		}

		
}
