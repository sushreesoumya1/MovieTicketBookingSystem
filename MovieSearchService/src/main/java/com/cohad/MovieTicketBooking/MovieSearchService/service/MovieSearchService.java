package com.cohad.MovieTicketBooking.MovieSearchService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cohad.MovieTicketBooking.MovieSearchService.entity.Movie;
import com.cohad.MovieTicketBooking.MovieSearchService.exception.MovieSearchException;
import com.cohad.MovieTicketBooking.MovieSearchService.repository.MovieSearchRepository;

@Component
public class MovieSearchService {
	@Autowired
	MovieSearchRepository movieSearchRepo;
	
	public List<Movie> getMovieByType(String type, String value) {
		switch(type) {
		case("name"):
			return movieSearchRepo.getMoviesByName(value);
		case("city"):
			return movieSearchRepo.getMoviesByCity(value);
		case("lang"):
			return movieSearchRepo.getMoviesByLang(value);
		case("theater"):
			return movieSearchRepo.getMoviesByTheater(value);
		default:
			throw new MovieSearchException();
		}
	}

}
