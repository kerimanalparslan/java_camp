package business.concretes;

import business.abstracts.IPlayersCheckService;
import entities.concretes.Players;

public class PlayerCheckManager implements IPlayersCheckService {

	@Override
	public boolean checkIfRealPerson(Players player) {
		// true or false?
		return true;
	}

}
