package adapter;

import business.abstracts.IPlayersCheckService;
import entities.concretes.Players;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayersCheckService {

	@Override
	public boolean checkIfRealPerson(Players player) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;

		try {

			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getDateOfBirth().getYear());


		} catch (Exception e) {

			System.out.println("Üye bilgileri hatalý.");

		}

		return result;
	}

}
