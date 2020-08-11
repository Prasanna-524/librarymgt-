package org.dxctraining.service;
import org.dxctraining.entities.Guest;
import org.dxctraining.dao.GuestDao;
import org.dxctraining.dao.GuestDaoImpl;
import org.dxctraining.exceptions.IdNotFoundException;
import java.util.*;

public class ServiceDaoImpl implements ServiceDao {
	private GuestDao dao=new GuestDaoImpl();

	@Override
	public void Register(Guest guest) {
	  dao.Register(guest);
		
	}

	@Override
	public Guest findbyId(String id) {
		checkId(id);
		Guest guest=dao.findbyId(id);
		return guest;
	}

	@Override
	public void removeId(String id) {
		checkId(id);
		dao.removeId(id);
		
	}

	private void checkId(String id) {
		if(id==null) {
			throw new IdNotFoundException("id not found");
		}
		
	}

	@Override
	public List<Guest> displayAll() {
		List<Guest> glist=dao.displayAll();
		return glist;
		
	}	
}
