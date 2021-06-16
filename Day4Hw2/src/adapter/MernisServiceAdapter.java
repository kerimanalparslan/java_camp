package adapter;

import business.abstracts.ICustomerCheckService;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;

		try {

			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());

		} catch (Exception e) {
			
			System.out.println("Not a Valid Person");

		}
		
		return result;
		
	}

}
