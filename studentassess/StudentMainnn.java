package weektwo;
import java.util.*;

public class StudentMainnn{
	Map<String,Student> student=new HashMap<>();
	Set<Student> set1=new HashSet<>();
	Set<Student> set2=new HashSet<>();
	List<String> list=new ArrayList<>();
	public static void main(String args[]) {
		StudentMain demo=new StudentMain();
		demo.runapp();
	}

	private void runapp() {
		Student student1=new Student("JR24",20);
		student.put("JR24",student1);
		Student student2=new Student("JR22",21);
		student.put("JR22",student2);
		Student student3=new Student("JR26",24);
		student.put("JR26",student3);
		Student student4=new Student("JR19",23);
		student.put("JR19",student4);
		Set<String> keys = student.keySet();
		for(String k:keys) {
			Student evenodd= student.get(k);
			if(evenodd.getAge()%2==0) {
				set1.add(evenodd);
			
			else {
				set2.add(evenodd);
			}
			list.add(evenodd.getRollno());
		}
		displayAll();
	}
	private void displayAll() {
		for(Student trainee:set1) {
			System.out.println("rollno"+trainee.getRollno()+"age"+trainee.getAge());
		}
		for(Student trainee:set2) {
			System.out.println("roll no"+trainee.getRollno()+"age"+trainee.getAge());
		}
		for(String tarinee:list) {
			System.out.println(tarinee);
	}	
		
	}

}