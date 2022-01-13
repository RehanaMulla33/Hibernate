package com.xworkz.airport.entity;

import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport_details")


public class AirportEntity {
	@Id
	@Column(name = "airId")
	private int airId;
	@Column(name = "waitArea")
	private int waitArea;
	@Column(name = "deptArea")
	private String departuretArea;
	@Column(name = "environment")
	private String terminalEnv;
	@Column(name = "noAirStand")
	private int noOfAircraftStand;
	@Column(name = "ramp")
	private int ramp;
	@Column(name = "fireStation")
	private int fireStation;

	public AirportEntity() {

		// TODO Auto-generated constructor stub
	}

	public AirportEntity(int airId, int waitArea, String departuretArea, String terminalEnv, int noOfAircraftStand,
			int ramp, int fireStation) {
		super();
		this.airId = airId;
		this.waitArea = waitArea;
		this.departuretArea = departuretArea;
		this.terminalEnv = terminalEnv;
		this.noOfAircraftStand = noOfAircraftStand;
		this.ramp = ramp;
		this.fireStation = fireStation;
	}

	public int getAvailSeats() {
		return airId;
	}

	public void setAvailSeats(int availSeats) {
		this.airId = availSeats;
	}

	public int getWaitArea() {
		return waitArea;
	}

	public void setWaitArea(int waitArea) {
		this.waitArea = waitArea;
	}

	public String getDeparturetArea() {
		return departuretArea;
	}

	public void setDeparturetArea(String departuretArea) {
		this.departuretArea = departuretArea;
	}

	public String getTerminalEnv() {
		return terminalEnv;
	}

	public void setTerminalEnv(String terminalEnv) {
		this.terminalEnv = terminalEnv;
	}

	public int getNoOfAircraftStand() {
		return noOfAircraftStand;
	}

	public void setNoOfAircraftStand(int noOfAircraftStand) {
		this.noOfAircraftStand = noOfAircraftStand;
	}

	public int getRamp() {
		return ramp;
	}

	public void setRamp(int ramp) {
		this.ramp = ramp;
	}

	public int getFireStation() {
		return fireStation;
	}

	public void setFireStation(int fireStation) {
		this.fireStation = fireStation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airId, departuretArea, fireStation, noOfAircraftStand, ramp, terminalEnv, waitArea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirportEntity other = (AirportEntity) obj;
		return airId == other.airId && Objects.equals(departuretArea, other.departuretArea)
				&& fireStation == other.fireStation && noOfAircraftStand == other.noOfAircraftStand
				&& ramp == other.ramp && Objects.equals(terminalEnv, other.terminalEnv) && waitArea == other.waitArea;
	}

	@Override
	public String toString() {
		return "AirportEntity [airId=" + airId + ", waitArea=" + waitArea + ", departuretArea="
				+ departuretArea + ", terminalEnv=" + terminalEnv + ", noOfAircraftStand=" + noOfAircraftStand
				+ ", ramp=" + ramp + ", fireStation=" + fireStation + "]";
	}

}
