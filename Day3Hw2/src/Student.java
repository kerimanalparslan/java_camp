
public class Student extends User{
	
	String ders;

	public Student() {

	}
	public Student(String ders) {
		super();
		this.ders = ders;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}
	
}
