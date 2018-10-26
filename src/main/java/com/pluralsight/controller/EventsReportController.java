package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.model.Event;

@RestController
public class EventsReportController {

	
	
	@RequestMapping("/events")
	public List<Event> getEvents() {
		List<Event> events = new ArrayList<>();
		events.add(createEvent("Java User Group"));
		events.add(createEvent("Angula User Group"));
		return events;
	}

	private Event createEvent(String name) {
		Event event = new Event();
		event.setName(name);
		return event;
	}
}
