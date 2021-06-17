import business.concretes.UserManager;
import core.GoogleManagerAdapter;
import dataAccess.concretes.HipernateUserDao;
import entities.concretes.User;

public class Main {
	
	// ahmetkaanmonun'na ait proje incelendi
	
	public static void main(String[] args) {

		User keriman = new User(1, "Keriman", "Alparslan", "k.alparslan164@gmail.com", "1234567");

		UserManager manager = new UserManager(new HipernateUserDao(), new GoogleManagerAdapter());

		manager.signin(keriman, "k.alparslan164@gmail.com", "1234567");

		manager.signup(keriman);

	}

}
