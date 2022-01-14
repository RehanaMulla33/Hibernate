package com.xworkz.tour.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "touristdetails")


public class TouristEntity {
	@Id
	@Column(name = "tid")
	private int tid;
	@Column(name = "location")
	private String location;
	@Column(name = "seaLevel")
	private String seaLevel;
	@Column(name = "famousfor")
	private String famousFor;
	@Column(name = "season")
	private String season;
	@Column(name = "entryFess")
	private int entryFees;
	
	
	
	
	public TouristEntity() {
		// TODO Auto-generated constructor stub
	}

	public TouristEntity(int tid, String location, String seaLevel, String famousFor, String season, int entryFees) {
		super();
		this.tid = tid;
		this.location = location;
		this.seaLevel = seaLevel;
		this.famousFor = famousFor;
		this.season = season;
		this.entryFees = entryFees;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(String seaLevel) {
		this.seaLevel = seaLevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

	@Override
	public String toString() {
		return "TouristEntity [tid=" + tid + ", location=" + location + ", seaLevel=" + seaLevel + ", famousFor="
				+ famousFor + ", season=" + season + ", entryFees=" + entryFees + "]";
	}


	
	@Override
	public int hashCode() {
		return Objects.hash(entryFees, famousFor, location, seaLevel, season, tid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TouristEntity other = (TouristEntity) obj;
		return entryFees == other.entryFees && Objects.equals(famousFor, other.famousFor)
				&& Objects.equals(location, other.location) && Objects.equals(seaLevel, other.seaLevel)
				&& Objects.equals(season, other.season) && tid == other.tid;
	}
	
	
	
	

}
