package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface IUserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	List <String> getAllMail();
	

}
