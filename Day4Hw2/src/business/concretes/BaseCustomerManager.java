package business.concretes;

import business.abstracts.ICustomerService;
import entities.concretes.Customer;

public class BaseCustomerManager implements ICustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Saved to Database : " + customer.getFirstName() + " " + customer.getLastName());
	}

}
