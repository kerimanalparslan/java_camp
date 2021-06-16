package business.abstracts;

import entities.concretes.User;

public interface IUserService {

	void signup(User user);
	void signin(User user, String email, String password);
}
