package org.dxctraining.dao;
import java.util.*;
import org.dxctraining.entities.*;;
public interface GuestDao {
	public void Register(Guest guest);
	public Guest findbyId(String id);
	public void removeId(String id);
	public List<Guest> displayAll();

}
