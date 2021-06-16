
public class Instructor {
	private String teacherName;
	private String teacherSurname;

	public Instructor() {
		
	}
		
	public Instructor(String teacherName, String teacherSurname) {
		super();
		this.teacherName=teacherName;
		this.teacherSurname=teacherSurname;
		
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSurname() {
		return teacherSurname;
	}

	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}

}
