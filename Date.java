package com.example.myfirstapp;

// What's up JDP? Here is a little work I did on the Event and Date classes. We'll discuss all changes on Sunday?
// I'm going to try to do some more work this weekend, but I will mostly just try to learn how to work with the SDK.

public class Date {
	private int numberOfEvents;
	Event[] todaysEvents = new Event[50];
	//50 events to begin with
	
	
	public void getListOfEvents(){
		// I don't know what we want here
	}
	
	public void addEvent(){
		todaysEvents[numberOfEvents] = new Event();
		numberOfEvents++;
	}
	
	public void deleteEvent(int location){
		todaysEvents[location] = null;
	}
	
	public Event getEvent(int location){
		return todaysEvents[location];
	}
	
	public void displayListOfEvents(){
		for (int i = 0; i < numberOfEvents; i++){
			todaysEvents[i].getName();
		}
	}
	
	
//	public void displayEvents(){
//		Same as displayListOFEvents()?
//	}
}
