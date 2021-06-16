package business.concretes;

import business.abstracts.ICustomerCheckService;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public  StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
		
	}
	
	//override kendisi gelmedi
	
	@Override
	public void add(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer))
		{
			super.add(customer);
		}
		else 
		{
			System.out.println("Not a valid person");
		}		
		
	}
}
