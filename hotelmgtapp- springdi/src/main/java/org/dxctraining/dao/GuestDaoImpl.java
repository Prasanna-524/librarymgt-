package org.dxctraining.dao;
import org.dxctraining.dao.GuestDao;
import org.dxctraining.entities.Guest;
import java.util.*;

import org.springframework.stereotype.Repository;

import org.dxctraining.exceptions.GuestNotFoundException;
@Repository
public class GuestDaoImpl implements GuestDao{
	private Map<String,Guest> map=new HashMap<>();

	@Override
	public void Register(Guest guest) {
		String id=guest.getId();
		String name=guest.getName();
		map.put(id,guest);
		guest.setId(id);
		//guest.setName(name);
	}

	@Override
	public Guest findbyId(String id) {
		Guest gid=map.get(id);
		if(gid==null)
		{
			throw new GuestNotFoundException("guest not found");
		}
		return gid;
	}

	@Override
	public void removeId(String id) {
		map.remove(id);
		
	}
	public List<Guest> displayAll() {
		Collection<Guest> collection=map.values();
		List<Guest> list=new ArrayList<>();
		for(Guest guest:collection)
		{
		    list.add(guest);
		}
		return list;
		    }
		
	}	


