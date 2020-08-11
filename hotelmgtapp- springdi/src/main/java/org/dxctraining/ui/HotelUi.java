package org.dxctraining.ui;

import java.util.*;

import javax.annotation.PostConstruct;

import org.dxctraining.entities.Guest;
import org.dxctraining.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelUi {
	@Autowired
	private ServiceDao service;

	@PostConstruct
	public void run() {
		
		
			Guest guest1=new Guest("JR24","Chinni");
			Guest guest2=new Guest("JR25","Chinna");
			Guest guest3=new Guest("JR26","siri");
			Guest guest4=new Guest("JR19","ammu");
			Guest guest5=new Guest("JR01","srilu");
			service.Register(guest1);
			service.Register(guest2);
			service.Register(guest3);
			service.Register(guest4);
			service.Register(guest5);
			display();
			
		}
		private void display() {
			List<Guest> list=service.displayAll();
			for(Guest guest:list) {
				guestdisplay(guest);
			}
			
		}
		private void guestdisplay(Guest guest) {
			String id=guest.getId();
			String name=guest.getName();
	        System.out.println("Name " +name+ "Id " +id);
			
		}
}