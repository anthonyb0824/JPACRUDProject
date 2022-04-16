package com.skilldistillery.videogames.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.videogames.data.VideogameDAO;

@Controller
public class VideogameController {
	
	@Autowired
	private VideogameDAO dao;

	@RequestMapping(path= {"/","index.do"})
	public String index(Model model) {
		model.addAttribute("DEBUG", dao.findById(1));
		return "index";
	}
	
	@RequestMapping(path="create.do")
	public String create() {
		return"create";
	}
	
	@RequestMapping(path="delete.do")
	public String delete() {
		return "delete";
	}
	
	@RequestMapping(path="results.do")
	public String results() {
		return "results";
	}
	
	@RequestMapping(path="update.do")
	public String update() {
		return "update";
	}
	
	@RequestMapping(path="findById.do")
	public String findById() {
		return "findById";
	}
}
