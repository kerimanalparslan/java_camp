package business.abstracts;

import entities.concretes.Campaign;

public interface ICampaignService {
	// bilgi ekle
	// bilgi g�ncelle
	// bilgi sil
	
	void add(Campaign campaign);
	
	void update(Campaign campaign);

	void delete(Campaign campaign);

}
