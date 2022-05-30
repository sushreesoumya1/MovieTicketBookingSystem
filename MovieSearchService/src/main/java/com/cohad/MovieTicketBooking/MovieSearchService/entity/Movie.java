package com.cohad.MovieTicketBooking.MovieSearchService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Movie {
	@Id
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
	
	

}
