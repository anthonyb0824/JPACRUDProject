package com.skilldistillery.videogames.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.videogames.entities.Videogame;

@Service
@Transactional
public class VideogameDAOImpl implements VideogameDAO {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAVideogames");

	@PersistenceContext
	private EntityManager em;

	@Override
	public Videogame findById(int id) {
		return em.find(Videogame.class, id);
	}

	@Override
	public boolean delete(int id) {
		boolean removeSuccessful = false;
		em = emf.createEntityManager();
		try {
			Videogame managed = em.find(Videogame.class, id);
			if(managed != null) {
				em.remove(managed);
				removeSuccessful = !em.contains(managed);
			}
			
			return removeSuccessful;
		}catch (Exception e) {
			System.out.println(e);
			return removeSuccessful;
		}finally {
			em.close();
		}
	}

	@Override
	public Videogame update(int id, Videogame updatedGame) {
		em = emf.createEntityManager();
		Videogame managed = em.find(Videogame.class, id);
		managed.setTitle(updatedGame.getTitle());
		managed.setCoOp(updatedGame.getCoOp());
		managed.setMultiplayer(updatedGame.getMultiplayer());
		managed.setEsrbRating(updatedGame.getEsrbRating());
		managed.setPlatform(updatedGame.getPlatform());
		managed.setReleaseDate(updatedGame.getReleaseDate());
		managed.setDeveloper(updatedGame.getDeveloper());
		managed.setImg_url(updatedGame.getImg_url());
		
		em.close();
		return managed;
	}

	@Override
	public Videogame create(Videogame game) {
		em = emf.createEntityManager();
		
		em.persist(game);
		em.close();
		return game;
	}

}