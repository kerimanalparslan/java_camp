package business.concretes;

import business.abstracts.ICampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements ICampaignService {

	// kampanyanýn varlýðýný kontrol et

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignId() + " - " + campaign.getCampaignName() + " kampanyasý eklendi.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + campaign.getCampaignName() + " kampanyasý güncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + campaign.getCampaignName() + " kampanyasý silindi.");

	}

}
