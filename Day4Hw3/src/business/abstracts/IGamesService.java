package business.abstracts;

import entities.concretes.Games;

public interface IGamesService {
	// bilgi ekle
	// bilgi g�ncelle
	// bilgi sil

	void add(Games games);

	void update(Games games);

	void delete(Games games);
}
