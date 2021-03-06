package business.concretes;

import business.abstracts.ICampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements ICampaignService {

	// kampanyanın varlığını kontrol et

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignId() + " - " + campaign.getCampaignName() + " kampanyası eklendi.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + campaign.getCampaignName() + " kampanyası güncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + campaign.getCampaignName() + " kampanyası silindi.");

	}

}
