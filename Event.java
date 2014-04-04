package com.example.myfirstapp;

public class Event {
	private String name, descprition;
	private Date startTime, endTime, startDate, endDate;
	private boolean reminder;
	
//	public void addEvent(){
//		Hey guys, I figure that Events should
//		be stored inside of dates. Let me know
//		if you disagree.
//	}
	
	public Event(){
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void editEvent(){
		
	}
	
//	public void deleteEvent(){
//		See before ^^
//	}
	
	public void setReminder(){
		// I think we need SQLite here
	}
}
