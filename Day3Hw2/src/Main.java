
public class Main {

	public static void main(String[] args) {

		User user1 = new User(1,"Engin","Demiroğ","engin.demirog@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.enter(user1);

		User user2 = new User(2,"Keriman","Alparslan","keriman.alparslan@gmail.com");
		userManager.enter(user2);
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		Instructor instructor1 = new Instructor("Yazılım","Java&React");
		instructor1.id=1;
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.details(instructor1);
		
		System.out.println("---------------------------------------------------------------------------------------");

		Student student1 = new Student("Kodlama");
		student1.id=2;
		
		StudentManager studentManager = new StudentManager();
		studentManager.courses(student1);
		
	}

}
