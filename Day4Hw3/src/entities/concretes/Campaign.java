package entities.concretes;

import entities.abstracts.IEntity;

public class Campaign implements IEntity{

	private int campaignId;
	private String campaignName;
	private double discountPercent;
	
	public Campaign() {
		
	}

	public Campaign(int campaignId, String campaignName, double discountPercent) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
}
