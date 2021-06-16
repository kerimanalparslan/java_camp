package business.concretes;

import business.abstracts.IShopsService;
import entities.concretes.Campaign;
import entities.concretes.Shops;

public class ShopsManager implements IShopsService {

	@Override
	public void add(Shops shop) {
		// normal sat�n al�m

		System.out.println(shop.getGame().getGameName() + " oyunu " + shop.getPlayer().getFirstName() +  " " + shop.getPlayer().getLastName()
				+ " oyuncusu taraf�ndan " + shop.getGame().getGamePrice() + " TL'ye sat�n al�nd�.");

	}

	public void add(Shops shop, Campaign campaign) {
		// kampanyal� sat�n al�m

		System.out.println(shop.getGame().getGameName() + " oyunu " + shop.getPlayer().getFirstName() + " " + shop.getPlayer().getLastName()
				+ " oyuncusu taraf�ndan " + campaign.getCampaignId() + " kampanya numaral� "
				+ campaign.getDiscountPercent() + " indirimi uygulanarak "
				+ (shop.getGame().getGamePrice()
						- (shop.getGame().getGamePrice() * campaign.getDiscountPercent() / 100))
				+ " TL'ye sat�n al�nd�.");
	}

}
