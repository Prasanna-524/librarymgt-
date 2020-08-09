package assignmentrainee;
import java.util.*;

import inheritance.BusinessCustomer;
import weektwo.Student;
public class TraineeMain {
	Map<Integer,Trainee> map=new HashMap<>();
	Set<Trainee> set1=new HashSet<>();
	Set<Trainee> set2=new HashSet<>();
	public static void main(String[] args) {
		TraineeMain demo = new TraineeMain();
		demo.runApp();
	}

	private void runApp() {
		Trainee trainee1=new CTrainee(101,"chinni",2);
		Trainee trainee2=new CTrainee(102,"chinna",3);
		Trainee trainee3=new CTrainee(103,"sweety",4);
		Trainee trainee4=new ETrainee(104,"ammu","laptop");
		Trainee trainee5=new ETrainee(105,"sonu","smartphone");
		Trainee trainee6=new ETrainee(106,"sri","mi phone");
		map.put(trainee1.getId(), trainee1);
		map.put(trainee2.getId(), trainee2);
		map.put(trainee3.getId(), trainee3);
		map.put(trainee4.getId(), trainee4);
		map.put(trainee5.getId(), trainee5);
		map.put(trainee6.getId(), trainee6);
		for (Trainee trainee : map.values()) {
            Trainee map = (Trainee) trainee;
            boolean isCs= map instanceof CTrainee;
            if (isCs) {
                set1.add((CTrainee)map);
            } else {
                set2.add((ETrainee) map);
            }
        }
		for(Trainee cseset:set1)
        {
            int id=cseset.getId();
            String name=cseset.getName();
            int language=cseset.getLanguage();
            System.out.println(" id"+id+ "name"+name+" languages"+language);
        }
		for(Trainee eceset:set2)
        {
            int id=eceset.getId();
            String name=eceset.getName();
            String deviceused=eceset.getDeviceUsed();
            System.out.println(" id"+id+ "The name="+name+"device" +deviceused);
        }	
				
	}
	
}
