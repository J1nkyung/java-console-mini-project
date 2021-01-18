package jdbcProject.vo;


public class HouseVO { 
	String memId;
	String houPdate;
	String houLocation;
	
	public HouseVO(){}
	
	public HouseVO(String memId, String houPdate, String houLocation){
		this.memId = memId;
		this.houPdate = houPdate;
		this.houLocation = houLocation;
	}
	
	public HouseVO(String memId, String houPdate){
		this.memId = memId;
		this.houPdate = houPdate;
	}
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getHouPdate() {
		return houPdate;
	}
	public void setHouPdate(String houPdate) {
		this.houPdate = houPdate;
	}
	public String getHouLocation() {
		return houLocation;
	}
	public void setHouLocation(String houLocation) {
		this.houLocation = houLocation;
	}

	@Override
	public String toString() {
		return "[회원ID] " + memId + "  [주소] " + houPdate + "  [거주지] " + houLocation;
	}
	
}
