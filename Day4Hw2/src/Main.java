import java.time.LocalDate;

import adapter.MernisServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.add(new Customer(1, "KERÝMAN", "ALPARSLAN", LocalDate.of(1997, 9, 13), "30535411798"));
	
	
	}

}