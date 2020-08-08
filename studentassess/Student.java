package weektwo;
import java.util.*;
public class Student {
	    private int age;
		private String rollno;
		public Student(String rollno,int age)
		{
			
			this.rollno=rollno;
			this.age=age;
		}
	    int getAge(){
		return age;
		}
		void setAge(int age){
		age=age;
		}
		String getRollno(){
		return rollno;
		}
		void setRollno(String rollArg){
		rollno=rollArg;
		}
		public int hashCode()
		{
			int hash=rollno.hashCode();
			return hash;
		}
		public boolean equals(Object arg) {
			if(this==arg) {
				return true;
			}
			
		   if(arg==null || !(arg instanceof Student) ) {
				return false;
		   }
			
		    Student that=(Student)arg;	
			boolean isequal=this.rollno.equals(that.age);
			return isequal;
		}
}
	

