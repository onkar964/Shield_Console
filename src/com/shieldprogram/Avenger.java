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

	public String getAvengerName() {
		return avengerName;
	}

	public void setAvengerName(String avengerName) {
		this.avengerName = avengerName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getAbilities() {
		return abilities;
	}

	public void setAbilities(String abilities) {
		this.abilities = abilities;
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
		return "Avenger [avengerName=" + avengerName + ", personName=" + personName + ", abilities=" + abilities
				+ ", missionAssigned=" + missionAssigned + ", missionCompleted=" + missionCompleted + "]";
	}
	

}
