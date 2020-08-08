package assignmentrainee;

public class CTrainee extends Trainee {
	int language;
	public CTrainee(int id, String name,int language) {
		super(id, name);
		this.language=language;
	}

	public int getLanguage(){
		return language;
		}
		public void setLanguage(int language){
			language=language;
		}	

}
