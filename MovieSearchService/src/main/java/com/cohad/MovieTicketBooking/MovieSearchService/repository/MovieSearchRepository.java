package com.cohad.MovieTicketBooking.MovieSearchService.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cohad.MovieTicketBooking.MovieSearchService.entity.Movie;

@Repository
public interface MovieSearchRepository extends CrudRepository<Movie, Long>{
	public List<Movie> getMoviesByCity(String city);
	public List<Movie> getMoviesByTheater(String theater);
	public List<Movie> getMoviesByLang(String lang);
	public List<Movie> getMoviesByName(String name);

}
