package assignmentrainee;
public class Trainee {

	private int id;
	private String name;
	public Trainee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	int getId(){
		return id;
		}
		void setId(int id){
		id=id;
		}
		String getName(){
		return name;
		}
		void setName(String name){
		name=name;
		}
		public int hashCode()
		{
			return id;
		}
		public boolean equals(Object arg) {
			if(this==arg) {
				return true;
			}
			
		   if(arg==null || !(arg instanceof Trainee) ) {
				return false;
		   }
			
		    Trainee that=(Trainee)arg;	
			boolean isequal=this.id==that.id;
			return isequal;
		
		}
		public int getLanguage() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		}

	
	

