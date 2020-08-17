package com.dxctraining.consoleapp.entities;
public class Author  {
	    private int id;
	    private String name;

	    public Author(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public int hashCode()
		{
			return id;
		}
		public boolean equals(Object arg) {
			if(this==arg) {
				return true;
			}
			
		   if(arg==null || !(arg instanceof Author) ) {
				return false;
		   }
			
		    Author that=(Author)arg;	
			boolean isequal=this.id==that.id;
			return isequal;
		}
	}

