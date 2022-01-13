package com.xworkz.railwayStation.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "rlystation_details")
public class RailwayEntity {
	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "RailTcktCounters")
	private int noOfTicketCounters;
	@Column(name = "airId")
	private int waitingRoom;
	@Column(name = "platform")
	private int noOfPlatforms;
	@Column(name = "carpark")
	private int carParks;
	@Column(name = "restraunt")
	private int norestraunt;
	@Column(name = "halt")
	private int noOfhalt;
	
	public RailwayEntity() {
		
		// TODO Auto-generated constructor stub
	}

	public RailwayEntity(String name, int noOfTicketCounters, int noWaitingRooms, int noOfPlatforms, int carParks,
			int norestraunt, int noOfhalt) {
		super();
		this.name = name;
		this.noOfTicketCounters = noOfTicketCounters;
		this.waitingRoom = noWaitingRooms;
		this.noOfPlatforms = noOfPlatforms;
		this.carParks = carParks;
		this.norestraunt = norestraunt;
		this.noOfhalt = noOfhalt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfTicketCounters() {
		return noOfTicketCounters;
	}

	public void setNoOfTicketCounters(int noOfTicketCounters) {
		this.noOfTicketCounters = noOfTicketCounters;
	}

	public int getNoWaitingRooms() {
		return waitingRoom;
	}

	public void setNoWaitingRooms(int noWaitingRooms) {
		this.waitingRoom = noWaitingRooms;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public int getCarParks() {
		return carParks;
	}

	public void setCarParks(int carParks) {
		this.carParks = carParks;
	}

	public int getNorestraunt() {
		return norestraunt;
	}

	public void setNorestraunt(int norestraunt) {
		this.norestraunt = norestraunt;
	}

	public int getNoOfhalt() {
		return noOfhalt;
	}

	public void setNoOfhalt(int noOfhalt) {
		this.noOfhalt = noOfhalt;
	}

	@Override
	public String toString() {
		return "RailwayEntity [name=" + name + ", noOfTicketCounters=" + noOfTicketCounters + ", noWaitingRooms="
				+ waitingRoom + ", noOfPlatforms=" + noOfPlatforms + ", carParks=" + carParks + ", norestraunt="
				+ norestraunt + ", noOfhalt=" + noOfhalt + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(carParks, name, noOfPlatforms, noOfTicketCounters, noOfhalt, waitingRoom, norestraunt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RailwayEntity other = (RailwayEntity) obj;
		return carParks == other.carParks && Objects.equals(name, other.name) && noOfPlatforms == other.noOfPlatforms
				&& noOfTicketCounters == other.noOfTicketCounters && noOfhalt == other.noOfhalt
				&& waitingRoom == other.waitingRoom && norestraunt == other.norestraunt;
	}
}
