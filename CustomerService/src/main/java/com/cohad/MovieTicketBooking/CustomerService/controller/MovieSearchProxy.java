package com.cohad.MovieTicketBooking.CustomerService.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cohad.MovieTicketBooking.CustomerService.dataMembers.Movie;


@FeignClient(name="MovieSearchService", url="localhost:8081")
public interface MovieSearchProxy {
	
	@GetMapping("/searchMovies/{type}/{value}")
	public List<Movie> getMovieByType(
			@PathVariable String type,
			@PathVariable String value
			);

}
