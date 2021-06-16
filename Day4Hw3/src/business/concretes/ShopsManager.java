package business.concretes;

import business.abstracts.IShopsService;
import entities.concretes.Campaign;
import entities.concretes.Shops;

public class ShopsManager implements IShopsService {

	@Override
	public void add(Shops shop) {
		// normal satýn alým

		System.out.println(shop.getGame().getGameName() + " oyunu " + shop.getPlayer().getFirstName() +  " " + shop.getPlayer().getLastName()
				+ " oyuncusu tarafýndan " + shop.getGame().getGamePrice() + " TL'ye satýn alýndý.");

	}

	public void add(Shops shop, Campaign campaign) {
		// kampanyalý satýn alým

		System.out.println(shop.getGame().getGameName() + " oyunu " + shop.getPlayer().getFirstName() + " " + shop.getPlayer().getLastName()
				+ " oyuncusu tarafýndan " + campaign.getCampaignId() + " kampanya numaralý "
				+ campaign.getDiscountPercent() + " indirimi uygulanarak "
				+ (shop.getGame().getGamePrice()
						- (shop.getGame().getGamePrice() * campaign.getDiscountPercent() / 100))
				+ " TL'ye satýn alýndý.");
	}

}
