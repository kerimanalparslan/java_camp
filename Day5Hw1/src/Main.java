import business.concretes.UserManager;
import core.GoogleManagerAdapter;
import dataAccess.concretes.HipernateUserDao;
import entities.concretes.User;

public class Main {
	
	// ahmetkaanmonun'na ait proje incelendi
	
	public static void main(String[] args) {

		User kaan = new User(1, "Kaan", "M�n�n", "ahmetkaan.monun@outlook.com", "1234567");

		User ahmet = new User(2, "Ahmet", "M�n�nu", "ahmetkaan.monun@outlook.com", "12345678");

		UserManager manager = new UserManager(new HipernateUserDao(), new GoogleManagerAdapter());

		manager.signin(kaan, "ahmetkaanmonun@outlook.com", "1234567");

		manager.signup(kaan);

		manager.signup(ahmet);
	}

}
