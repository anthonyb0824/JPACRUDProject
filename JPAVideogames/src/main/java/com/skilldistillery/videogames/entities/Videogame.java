package com.skilldistillery.videogames.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Videogame {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	@Column(name="co_op")
	private Boolean coOp;
	
	//TODO: change back to primitive
	private Boolean multiplayer;
	
	@Column(name="esrb_rating")
	private char esrbRating;
	
	private String platform;
	
	@Column(name="release_date")
	private LocalDate releaseDate;
	
	private String developer;
	
	@Column(name = "img_url")
	private String imgUrl;
	
	public Videogame() {
		
	}

	
	public Boolean getCoOp() {
		return coOp;
	}


	public void setCoOp(Boolean coOp) {
		this.coOp = coOp;
	}


	public Boolean getMultiplayer() {
		return multiplayer;
	}


	public void setMultiplayer(Boolean multiplayer) {
		this.multiplayer = multiplayer;
	}


	public char getEsrbRating() {
		return esrbRating;
	}


	public void setEsrbRating(char esrbRating) {
		this.esrbRating = esrbRating;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getDeveloper() {
		return developer;
	}


	public void setDeveloper(String developer) {
		this.developer = developer;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String img_url) {
		this.imgUrl = img_url;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Videogame [id=" + id + ", title=" + title + ", coOp=" + coOp + ", multiplayer=" + multiplayer
				+ ", esrbRating=" + esrbRating + ", platform=" + platform + ", releaseDate=" + releaseDate
				+ ", developer=" + developer + "]";
	}

	
	
	
}
