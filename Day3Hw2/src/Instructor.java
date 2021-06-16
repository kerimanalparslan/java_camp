
public class Instructor extends User{
	
	String field;
	String detail;
	
	public  Instructor() {
		
	}
	
	public Instructor(String field, String detail) {
		super();
		this.field = field;
		this.detail = detail;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
