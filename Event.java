package com.example.myfirstapp;

public class Event {
	private String name, descprition;
	private Date startTime, endTime, startDate, endDate;
	private boolean reminder;
	
//	public void addEvent(){
//		I figure that Events should
//		be stored inside of dates instead.
//	}
	
	public Event(){
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void editEvent(){
//		Change an event's date, start and end time,
//		name, description, etc etc.
	}
	
//	public void deleteEvent(){
//		See before ^^
//	}
	
	public void setReminder(){
		// I think we need SQLite here
	}
}
