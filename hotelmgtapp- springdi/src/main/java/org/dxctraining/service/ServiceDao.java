package org.dxctraining.service;
import java.util.*;
import org.dxctraining.entities.Guest;

public interface ServiceDao{
	public void Register(Guest guest);
	public Guest findbyId(String id);
	public void removeId(String id);
	public List<Guest> displayAll();
}
