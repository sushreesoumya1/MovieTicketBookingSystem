package com.cohad.MovieTicketBooking.CustomerService.dataMembers;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Component
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
	Long id;
	String name;
	String city;
	String lang;
	String theater;
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", city=" + city + ", lang=" + lang + ", theater=" + theater
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	
	

}
