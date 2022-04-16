package com.skilldistillery.videogames.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Videogame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	@Column(name="co_op")
	private String coOp;
	
	//TODO: change back to primitive
	private String multiplayer;
	
	@Column(name="esrb_rating")
	private String esrbRating;
	
	private String platform;
	
	@Column(name="release_date")
	private Date releaseDate;
	
	private String developer;
	
	private String img_url;
	
	public Videogame() {
		
	}

	
	public String getCoOp() {
		return coOp;
	}


	public void setCoOp(String coOp) {
		this.coOp = coOp;
	}


	public String getMultiplayer() {
		return multiplayer;
	}


	public void setMultiplayer(String multiplayer) {
		this.multiplayer = multiplayer;
	}


	public String getEsrbRating() {
		return esrbRating;
	}


	public void setEsrbRating(String esrbRating) {
		this.esrbRating = esrbRating;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public Date getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getDeveloper() {
		return developer;
	}


	public void setDeveloper(String developer) {
		this.developer = developer;
	}


	public String getImg_url() {
		return img_url;
	}


	public void setImg_url(String img_url) {
		this.img_url = img_url;
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
				+ ", developer=" + developer + ", img_url=" + img_url + "]";
	}

	
	
	
}
