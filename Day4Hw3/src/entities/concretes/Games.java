package entities.concretes;

import entities.abstracts.IEntity;

public class Games implements IEntity{

	private int gameId;
	private String gameName;
	private double gamePrice;
	private String gameDetail;
	
	public Games() {
		
	}

	public Games(int gameId, String gameName, double gamePrice, String gameDetail) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameDetail = gameDetail;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public String getGameDetail() {
		return gameDetail;
	}

	public void setGameDetail(String gameDetail) {
		this.gameDetail = gameDetail;
	}
	
	
}
