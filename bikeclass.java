//Bike.class
public class Bike {
	private String name, tagNo;
	
	public Bike() {
		name = "unknown";
		tagNo = "unknown";
	}
	public Bike(String name, String tagNo){
		this.name= name ;
		this.tagNo= tagNo ;
		
		
		}
	
	public String getTagNo() {
		return tagNo;
	}
	
	public void setTagNo(String tagNo) {
		this.tagNo = tagNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}