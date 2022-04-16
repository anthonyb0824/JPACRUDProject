package com.skilldistillery.videogames.data;

import com.skilldistillery.videogames.entities.Videogame;

public interface VideogameDAO {
	Videogame findById(int id);
	boolean delete(int id);
	Videogame update(int id, Videogame game);
	Videogame create(Videogame game);
	

}
