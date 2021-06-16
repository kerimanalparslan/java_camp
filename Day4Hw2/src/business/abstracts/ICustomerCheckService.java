package business.abstracts;

import entities.concretes.Customer;

public interface ICustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);
	
}
