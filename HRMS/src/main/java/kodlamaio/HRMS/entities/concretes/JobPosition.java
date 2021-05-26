package kodlamaio.HRMS.entities.concretes;

public class JobPosition {
	private int id;
	private String positionName;
	
	public JobPosition(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	

}
