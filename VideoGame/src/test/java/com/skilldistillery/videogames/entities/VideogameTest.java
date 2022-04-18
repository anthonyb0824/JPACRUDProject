package com.skilldistillery.videogames.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideogameTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Videogame game;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAVideogames");
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		game = em.find(Videogame.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@Test
	void test() {
//	SELECT * FROM videogame WHERE id = 1;
//	+----+-------------------+-------+-------------+--------------+---------------------+----------------------------------------------------------------------+-------------+-------------+
//	| id | title             | co_op | platform    | release_date | developer           | img_url                                                              | multiplayer | esrb_rating |
//	+----+-------------------+-------+-------------+--------------+---------------------+----------------------------------------------------------------------+-------------+-------------+
//	|  1 | Ghost Of Tsushima | True  | Playstation | 2020-07-17   | Sucker Punch Studio | https://upload.wikimedia.org/wikipedia/en/b/b6/Ghost_of_Tsushima.jpg | True        | M           |
//	+----+-------------------+-------+-------------+--------------+---------------------+----------------------------------------------------------------------+-------------+-------------+
		LocalDate date = LocalDate.of(2020, 07, 17);
		assertNotNull(game);
		assertEquals("Ghost Of Tsushima", game.getTitle());
		assertEquals(true,game.getCoOp());
		assertEquals("Playstation",game.getPlatform());
		assertEquals(date,game.getReleaseDate());
		assertEquals("Sucker Punch Studio",game.getDeveloper());
		assertEquals("Sucker Punch Studio",game.getDeveloper());
		assertEquals("https://upload.wikimedia.org/wikipedia/en/b/b6/Ghost_of_Tsushima.jpg",game.getImgUrl());
		assertEquals(true,game.getMultiplayer());
		assertEquals('M',game.getEsrbRating());
		
	}

}
