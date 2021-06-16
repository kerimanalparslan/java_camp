package business.concretes;

import business.abstracts.IGamesService;
import entities.concretes.Games;

public class GamesManager implements IGamesService {

	// oyunun varl���n� kontrol et

	@Override
	public void add(Games games) {
		System.out.println(games.getGameName() + " - " + games.getGameDetail() + " oyunu eklendi.");
	}

	@Override
	public void update(Games games) {
		System.out.println(games.getGameName() + " - " + games.getGameDetail() + " oyunu g�ncellendi.");

	}

	@Override
	public void delete(Games games) {
		System.out.println(games.getGameName() + " - " + games.getGameDetail() + " oyunu silindi.");

	}

}
