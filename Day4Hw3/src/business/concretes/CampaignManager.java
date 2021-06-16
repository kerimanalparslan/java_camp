package business.concretes;

import business.abstracts.ICampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements ICampaignService {

	// kampanyan�n varl���n� kontrol et

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignId() + " - " + campaign.getCampaignName() + " kampanyas� eklendi.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + campaign.getCampaignName() + " kampanyas� g�ncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + campaign.getCampaignName() + " kampanyas� silindi.");

	}

}
