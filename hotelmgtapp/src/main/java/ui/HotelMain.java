package ui;
import entities.Guest;
import service.ServiceDao;
import service.ServiceDaoImpl;
import java.util.*;
public class HotelMain {
	private ServiceDao service=new ServiceDaoImpl();
	public static void main(String args[])
	{
		HotelMain demo=new HotelMain();
		demo.runApp();
	}
	private void runApp() {
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
