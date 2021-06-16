
public class Courses {
	private String courseName;
	private double price;
	private String detail;

	public Courses() {
			
	}
		
	public Courses(String courseName, double price,String detail) {
		super();
		this.courseName=courseName;
		this.detail=detail;
		this.price=price;	
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	


}
