package business.abstracts;

import entities.concretes.Players;

public interface IPlayersCheckService {
	
	boolean checkIfRealPerson(Players player);

}
