package simulator;

import java.time.LocalDate;

import adapter.MernisServiceAdapter;
import business.concretes.CampaignManager;
import business.concretes.GamesManager;
import business.concretes.PlayersManager;
import business.concretes.ShopsManager;
import entities.concretes.Campaign;
import entities.concretes.Games;
import entities.concretes.Players;
import entities.concretes.Shops;

public class Main {

	public static void main(String[] args) {

		Players player1 = new Players();

		player1.setId(1);
		player1.setFirstName("Keriman ");
		player1.setLastName("Alparslan");
		player1.setDateOfBirth(LocalDate.of(1997, 1, 1));
		player1.setNationalityId("30535411798");
		
		
		Games game1 = new Games();
		
		game1.setGameId(1);
		game1.setGameName("Minecraft");
		game1.setGameDetail("Video Oyunu");
		game1.setGamePrice(150);
		
		
		Campaign campaign1 = new Campaign();
		
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("Bayram");
		campaign1.setDiscountPercent(20);
		
		Shops shop1 = new Shops();
		
		shop1.setShopId(1);
		shop1.setPlayer(player1);
		shop1.setGame(game1);
		
		
		PlayersManager playerManager = new PlayersManager(new MernisServiceAdapter());
		playerManager.add(player1);

		System.out.println("---------------------------------------------------------------------------------------");

		GamesManager gamesManager = new GamesManager();
		gamesManager.add(game1);
		
		System.out.println("---------------------------------------------------------------------------------------");

		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);

		System.out.println("---------------------------------------------------------------------------------------");

		ShopsManager shopsManager = new ShopsManager();
		shopsManager.add(shop1,campaign1);
		
		
	}

}
