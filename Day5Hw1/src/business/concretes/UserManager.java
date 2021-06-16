package business.concretes;

import business.abstracts.IUserService;
import core.IGoogleLoggerService;
import dataAccess.abstracts.IUserDao;
import entities.concretes.User;

public class UserManager implements IUserService {

	private IUserDao userDao;
	private IGoogleLoggerService googleLoggerService;

	public UserManager(IUserDao userDao, IGoogleLoggerService googleLoggerService) {
		super();
		this.userDao = userDao;
		this.googleLoggerService = googleLoggerService;
	}

	String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

	@Override
	public void signup(User user) {

		if ((user.getPassword().length() > 6) && user.geteMail().matches(regex)
				&& !(userDao.getAllMail().contains(user.geteMail())) && user.getFirstName().length() >= 2
				&& user.getLastName().length() >= 2) {

			System.out.println("Üyeliðiniz baþarýyla tamamlanmýþtýr.");
			this.userDao.add(user);
			this.googleLoggerService.add(user);

		} else {

			System.out.println("Üyelik oluþturulamadý.");

		}

	}

	@Override
	public void signin(User user, String email, String password) {
		if (email == user.geteMail() && password == user.getPassword()) {

			System.out.println("Giriþ yapýlmýþtýr.");

		} else {

			System.out.println("Giriþ baþarýsýz.");

		}
	}

}
