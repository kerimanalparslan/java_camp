package core;

import entities.concretes.User;

public class GoogleManagerAdapter implements IGoogleLoggerService{

	@Override
	public void add(User user) {
		
		System.out.println("Google ile üye olundu " + user.getFirstName());
	}

}
