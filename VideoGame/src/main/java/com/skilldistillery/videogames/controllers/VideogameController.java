package com.skilldistillery.videogames.controllers;

import java.text.ParseException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.videogames.data.VideogameDAO;
import com.skilldistillery.videogames.entities.Videogame;

@Controller
public class VideogameController {

	@Autowired
	private VideogameDAO dao;

	@RequestMapping(path = { "/", "index.do" })
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(path = "create.do")
	public String create() {
		return "create";
	}

	@RequestMapping(path = "delete.do")
	public String delete() {
		return "delete";
	}

	@RequestMapping(path = "results.do")
	public String results(@RequestParam int id, Model model) {
		Videogame temp = dao.findById(id);
		model.addAttribute("game", temp);
		return "results";
	}

	@RequestMapping(path = "update.do")
	public String update() {
		return "update";
	}

	@RequestMapping(path = "findById.do")
	public String findById() {
		return "findById";
	}

	@RequestMapping(path = "new.do", method = RequestMethod.POST)
	public String newVideoGame(@RequestParam("title") String title, @RequestParam("coOp") Boolean coOp,
			@RequestParam("multiPlayer") Boolean multi, @RequestParam("esrbRating") char rating,
			@RequestParam("platform") String platform, @RequestParam("releaseDate") String releaseDate,
			@RequestParam("developer") String developer, @RequestParam("imgUrl") String imgUrl,

			Model model) throws ParseException {
		Videogame temp = new Videogame();
		LocalDate date = LocalDate.parse(releaseDate);
		temp.setTitle(title);
		temp.setCoOp(coOp);
		temp.setMultiplayer(multi);
		temp.setEsrbRating(rating);
		temp.setPlatform(platform);
		temp.setReleaseDate(date);
		temp.setDeveloper(developer);
		temp.setImgUrl(imgUrl);

		Videogame newGame = dao.create(temp);

		model.addAttribute("game", newGame);

		return "results";

	}

	@RequestMapping(path = "deleteById.do", method = RequestMethod.POST)
	public String delete(@RequestParam("id") int id, Model model) {
		boolean wasDeleted = dao.delete(id);

		model.addAttribute("wasDeleted", wasDeleted);

		return "index";

	}

	@RequestMapping(path = "updateById.do", method = RequestMethod.POST)
	public String update(@RequestParam("id") int id,@RequestParam("title") String title, @RequestParam("coOp") Boolean coOp,
			@RequestParam("multiPlayer") Boolean multi, @RequestParam("esrbRating") char rating,
			@RequestParam("platform") String platform, @RequestParam("releaseDate") String releaseDate,
			@RequestParam("developer") String developer, @RequestParam("imgUrl") String imgUrl,
			Model model) {
		// creating the updated video game
		Videogame vg = dao.findById(id);
		LocalDate date = LocalDate.parse(releaseDate);
		vg.setTitle(title);
		vg.setCoOp(coOp);
		vg.setMultiplayer(multi);
		vg.setEsrbRating(rating);
		vg.setPlatform(platform);
		vg.setReleaseDate(date);
		vg.setDeveloper(developer);
		vg.setImgUrl(imgUrl);

		Videogame isupdated = dao.update(vg.getId(), vg);
		model.addAttribute("updatedGame", isupdated);

		return "index";
	}

}
