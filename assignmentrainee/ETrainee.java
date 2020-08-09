package assignmentrainee;

public class ETrainee extends Trainee {
	String deviceused;
	public ETrainee(int id, String name,String deviceused) {
		super(id, name);
		this.deviceused=deviceused;
	}

	public String getDeviceUsed(){
		return deviceused;
		}
		public void setDeviceUsed(String deviceused){
		deviceused=deviceused;
		}	


}
