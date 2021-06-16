package entities.concretes;

import entities.abstracts.IEntity;

public class Shops implements IEntity {

	private int shopId;
	private Games game;
	private Players player;
	
	public Shops () {
		
	}

	public Shops(int shopId, Games game, Players player) {
		super();
		this.shopId = shopId;
		this.game = game;
		this.player = player;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public Games getGame() {
		return game;
	}

	public void setGame(Games game) {
		this.game = game;
	}

	public Players getPlayer() {
		return player;
	}

	public void setPlayer(Players player) {
		this.player = player;
	}
	
	
}
