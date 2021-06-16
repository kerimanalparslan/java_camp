package business.concretes;

import business.abstracts.IPlayersCheckService;
import business.abstracts.IPlayersService;
import entities.concretes.Players;

public class PlayersManager implements IPlayersService {

	IPlayersCheckService playerCheckService;

	public PlayersManager(IPlayersCheckService playersCheckService) {

		this.playerCheckService = playersCheckService;

	}

	// oyuncunun varlýðýný kontrol et

	@Override
	public void add(Players player) {

		if (playerCheckService.checkIfRealPerson(player)) {

			System.out.println(
					player.getId() + " - " + player.getFirstName() + player.getLastName() + " oyuncusu eklendi.");

		} else {
			System.out.println("Üye Bilgileri Hatalý");
		}

	}

	@Override
	public void update(Players player) {
		
		if (playerCheckService.checkIfRealPerson(player)) {

			System.out.println(
					player.getId() + " - " + player.getFirstName() + player.getLastName() + " oyuncusu güncellendi.");

		} else {
			System.out.println("Üye Bilgileri Hatalý");
		}

	}

	@Override
	public void delete(Players player) {

		System.out
				.println(player.getId() + " - " + player.getFirstName() + player.getLastName() + " oyuncusu silindi.");

	}

}
