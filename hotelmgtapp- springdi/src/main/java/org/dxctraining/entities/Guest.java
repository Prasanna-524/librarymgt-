package org.dxctraining.entities;

import java.util.*;

public class Guest {
	 private String name;
	    private String id;
	    public Guest(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			id = id;
		}
		public int hashCode()
		{
			int hash=id.hashCode();
			return hash;
		}
		public boolean equals(Object arg) {
			if(this==arg) {
				return true;
			}
			
		   if(arg==null || !(arg instanceof Guest) ) {
				return false;
		   }
			
		    Guest that=(Guest)arg;	
			boolean isequal=this.id.equals(that.id);
			return isequal;
		}
}