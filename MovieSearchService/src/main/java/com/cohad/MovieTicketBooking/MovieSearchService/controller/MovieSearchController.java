package com.cohad.MovieTicketBooking.MovieSearchService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cohad.MovieTicketBooking.MovieSearchService.entity.Movie;
import com.cohad.MovieTicketBooking.MovieSearchService.service.MovieSearchService;

@RestController
public class MovieSearchController {
	@Autowired
	MovieSearchService service;

	@GetMapping("/searchMovies/{type}/{value}")
	public ResponseEntity<String> getMovieByName(
			@PathVariable String type,
			@PathVariable String value
			){
		List<Movie> list = new ArrayList();
		list=service.getMovieByType(type, value);
		System.out.println(list.toString());
		return ResponseEntity.ok().body(service.getMovieByType(type, value).toString());
				//(service.getMovieByType(type, value));
	}
}
