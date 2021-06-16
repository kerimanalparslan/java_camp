package business.concretes;

import business.abstracts.ICustomerCheckService;
import entities.concretes.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

	
}
