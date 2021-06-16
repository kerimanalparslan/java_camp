package business.abstracts;

import entities.concretes.Players;

public interface IPlayersService {

	// bilgi ekle
	// bilgi güncelle
	// bilgi sil

	void add(Players player);

	void update(Players player);

	void delete(Players player);

}
