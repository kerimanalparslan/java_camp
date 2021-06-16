package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IUserDao;
import entities.concretes.User;

public class HipernateUserDao implements IUserDao{

	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		
		System.out.println("Hibernate ile üye olundu " + user.getFirstName());
		users.add(user);

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getAllMail() {

		List<String> emails = new ArrayList<String>();
		
		for(User user:users) {

			emails.add(user.geteMail());
			
			
			
		}
		
		return emails;
	}

}
