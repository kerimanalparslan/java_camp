
public class Main {

	public static void main(String[] args) {
			
			Courses course1 = new Courses("Yaz�l�m Geli�tirici Yeti�tirme Kamp�",0,"(C# + ANGULAR)");
			Instructor teacher1 = new Instructor(" Engin", " Demiro�");
			
			Courses course2 = new Courses();
			course2.setCourseName("Yaz�l�m Geli�tirici Yeti�tirme Kamp�2");
			course2.setDetail("(JAVA + REACT)");
			course2.setPrice(0);
			
			Instructor teacher2 = new Instructor();
			teacher2.setTeacherName(" Engin");
			teacher2.setTeacherSurname("Demiro�");
			
			System.out.println(course1.getCourseName()+ " " + " " +course1.getPrice()+" " +
			course1.getDetail() + teacher1.getTeacherName() + " " + teacher1.getTeacherSurname());
			
			System.out.println(course2.getCourseName()+" " +" " +course2.getPrice()+" " +
			course2.getDetail()+ teacher2.getTeacherName() + " " + teacher2.getTeacherSurname());
			
			System.out.println("**************************************************************");
			
			CourseManager courseManager =  new CourseManager();
			courseManager.addToCart(course1);
			courseManager.addToCart(course2);
		
		
	}

}
