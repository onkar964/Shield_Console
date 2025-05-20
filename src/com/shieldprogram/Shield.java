package com.shieldprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Shield {
	static Map<String, Avenger> avengers = new HashMap<>();
	static Map<String, Mission> missions = new HashMap<String, Mission>();
	static Scanner ScanOption = new Scanner(System.in);

	public static void checkMissions() {
		if(missions.isEmpty()) {
			System.out.println("No Mission has been assigned to an Avenger.");
		}else {
			System.out.println("Mission Name \t|Status\t|Avengers");
			missions.values().forEach(mission->System.out.println(mission));
		}
	}
	public static void assignMission() {
		System.out.println("Enter 2 Avengers Name from below list");
		for(String key : avengers.keySet()) {System.out.print(key+", ");}	
		System.out.println();
		ScanOption.nextLine();
		String name1= ScanOption.nextLine();
		String name2= ScanOption.nextLine();
		System.out.println("Enter Mission Name: ");
		String name3= ScanOption.nextLine();
		System.out.println("Enter Mission Details: ");
		String name4= ScanOption.nextLine();
		List<Avenger>al=new ArrayList<>();
		if(avengers.containsKey(name1)) {
			if(avengers.get(name1).getMissionAssigned()==1) {
				System.out.println(avengers.get(name1)+" is on mission");
			}else {
				avengers.get(name1).setMissionAssigned(1);
				al.add(avengers.get(name1));
			}	
		}
		if(avengers.containsKey(name2)) {
			if(avengers.get(name2).getMissionAssigned()>=1) {
				System.out.println(avengers.get(name2)+" is on mission");
			}else {
				avengers.get(name2).setMissionAssigned(1);
				al.add(avengers.get(name2));
			}	
		}
		
		missions.put(name3, new Mission(al, name3, name4));
		System.out.println();
		System.out.println("Mission has been assigned.");
		System.out.println("Email notification sent and/or");
		System.out.println("SMS notification sent.\n");
	}
	public static void checkMissionDetails() {
		System.out.println("Enter mission name");
		ScanOption.nextLine();
		String missionName= ScanOption.nextLine();
		Mission mission = missions.get(missionName);
		if(mission !=null) { mission.display();}
		else{System.out.println("Mission not found...");}
	}
	public static void checkAvengerDetails() {
		System.out.println("Enter avenger name");
		ScanOption.nextLine();
		String avengerName=ScanOption.nextLine();
		Avenger av =avengers.get(avengerName);
		if(av!=null) {
			av.display();
		}else {
			System.out.println("Avenger not found..");
		}
	}
	public static void updateMissionSstatus() {
		System.out.println("Enter mission name");
		ScanOption.nextLine();
		String missionName = ScanOption.nextLine();
		Mission ms = missions.get(missionName);
		if(ms!=null) {
			System.out.println("Enter mission Status");
			String missionStatus = ScanOption.nextLine();
			ms.setMissionStatus(missionStatus);
			
			System.out.println("Mission completed Email and Sms are sent ");
		}
	}
	public static void listAvengers() {
		for(Avenger av:avengers.values()) {
			av.display();
		}
	}
	public static void assignAvengerToMission() {
		System.out.println("Enter avenger name");
		String avengerName=ScanOption.nextLine();
		Avenger av=avengers.get(avengerName);
		if(av!=null) {
			if(av.getMissionAssigned()>=1) {
				System.out.println("Already on mission");
			}
		}else {
			System.out.println("Avenger not found");
		}
	}


	public static void main(String[] args) {
		
		
		avengers.put("Iron Man", new Avenger("Iron Man", "Tony Stark", "Highly Intelligent, Genius Inventor, Powered Suit of Armor"));
        avengers.put("Captain America", new Avenger("Captain America", "Steve Rogers", "Super Soldier Serum, Enhanced Strength & Agility, Vibranium Shield"));
        avengers.put("Thor", new Avenger("Thor", "Thor Odinson", "God of Thunder, Mjolnir/Worthiness, Immense Strength, Flight"));
        avengers.put("Hulk", new Avenger("Hulk", "Bruce Banner", "Superhuman Strength, Durability, Regeneration, Anger Transformation"));
        avengers.put("Black Widow", new Avenger("Black Widow", "Natasha Romanoff", "Master Spy, Martial Arts Expert, Acrobat, Weapons Proficiency"));
        avengers.put("Hawkeye", new Avenger("Hawkeye", "Clint Barton", "Master Archer, Exceptional Reflexes, Tactical Expertise"));
        avengers.put("Scarlet Witch", new Avenger("Scarlet Witch", "Wanda Maximoff", "Chaos Magic, Telekinesis, Reality Manipulation, Energy Blasts"));
        avengers.put("Vision", new Avenger("Vision", "Vision", "Density Control, Flight, Energy Beams, Superhuman Intelligence"));
        avengers.put("Spider-Man", new Avenger("Spider-Man", "Peter Parker", "Wall-Crawling, Spider-Sense, Super Agility & Strength, Web-Slinging"));

        
        System.out.println("===========-----S.H.I.L.D-----===========");
        System.out.println("Welcome to Captain Fury. (Note: Below interface is for Captain Fury)");
        System.out.println("1. Check the missions");
        System.out.println("2. Assign mission to Avengers");
        System.out.println("3. Check mission’s details");
        System.out.println("4. Check Avenger’s details");
        System.out.println("5. Update Mission’s status");
        System.out.println("6. List Avengers");
        System.out.println("7. Assign avenger to mission.");
        System.out.println("8. Exit");
        
        while(true) {
        System.out.println("Enter the option");
        int option= ScanOption.nextInt();
        switch(option){
        	case 1:
        		checkMissions();
        		break;
        	case 2:
        		
        		assignMission();

        		break;
        	case 3:
        		checkMissionDetails();
        		break;
        	case 4:
        		checkAvengerDetails();
        		break;
        	case 5:
        		updateMissionSstatus();
        		break;
        	case 6:
        		listAvengers();
        		break;
        	case 7:
        		assignAvengerToMission();
        		break;
        	case 8:
        		System.exit(0);
        }
        	
        	
        	
        }
        
        
	}
}
