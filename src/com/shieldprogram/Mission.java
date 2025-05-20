package com.shieldprogram;

import java.util.ArrayList;
import java.util.List;

public class Mission {
	String missionName;
	String missionDetails;
	String missionStatus;
	List<Avenger> AvengerList= new ArrayList();
	
	public Mission(List<Avenger> avengerList, String missionName, String missionDetails) {
		this.missionName = missionName;
		this.missionDetails = missionDetails;
		this.missionStatus = "Assigned";
		AvengerList = avengerList;
	}
	
	public String getMissionStatus() {
		return missionStatus;
	}

	public void setMissionStatus(String missionStatus) {
		this.missionStatus = missionStatus;
	}

	public void display() {
		System.out.println("Enter Mission Name: " + missionName);
		System.out.println("Mission Details: " + missionDetails);
		System.out.println("Mission Status : " + missionStatus);
		System.out.println("Avenger List: " + AvengerList);
	}
	@Override
	public String toString() {
		return missionName + " - "+missionStatus+ " - "+ AvengerList;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public String getMissionDetails() {
		return missionDetails;
	}

	public void setMissionDetails(String missionDetails) {
		this.missionDetails = missionDetails;
	}

	public List<Avenger> getAvengerList() {
		return AvengerList;
	}

	public void setAvengerList(List<Avenger> avengerList) {
		AvengerList = avengerList;
	}
	
}
