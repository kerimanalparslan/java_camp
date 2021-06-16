package business.abstracts;

import entities.concretes.Campaign;

public interface ICampaignService {
	// bilgi ekle
	// bilgi güncelle
	// bilgi sil
	
	void add(Campaign campaign);
	
	void update(Campaign campaign);

	void delete(Campaign campaign);

}
