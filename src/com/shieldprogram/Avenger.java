package com.shieldprogram;

public class Avenger {
	String avengerName;
	String personName;
	String abilities;
	int missionAssigned;
	int missionCompleted;

	public Avenger(String avengerName, String personName, String abilities) {
		this.avengerName = avengerName;
		this.personName = personName;
		this.abilities = abilities;
		this.missionAssigned = 0;
		this.missionCompleted = 0;
	}

	public int getMissionAssigned() {
		return missionAssigned;
	}

	public void setMissionAssigned(int missionAssigned) {
		this.missionAssigned = missionAssigned;
	}

	public int getMissionCompleted() {
		return missionCompleted;
	}

	public void setMissionCompleted(int missionCompleted) {
		this.missionCompleted = missionCompleted;
	}

	public void display() {
		System.out.println("Enter Avenger Name: " + avengerName);
		System.out.println("Person Name: " + personName);
		System.out.println("Abilities: " + abilities);
		System.out.println("Mission Assigned: " + missionAssigned);
		System.out.println("Mission Completed: " + missionCompleted);
		System.out.println();
	}

	@Override
	public String toString() {
		return avengerName;
	}
	

}
