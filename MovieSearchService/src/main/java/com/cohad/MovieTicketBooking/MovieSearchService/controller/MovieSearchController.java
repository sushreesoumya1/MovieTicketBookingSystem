package com.cohad.MovieTicketBooking.MovieSearchService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cohad.MovieTicketBooking.MovieSearchService.entity.Movie;
import com.cohad.MovieTicketBooking.MovieSearchService.service.MovieSearchService;

@RestController
public class MovieSearchController {
	@Autowired
	MovieSearchService service;

	@GetMapping("/searchMovies/{type}/{value}")
	public List<Movie> getMovieByName(
			@PathVariable String type,
			@PathVariable String value
			){
		List<Movie> list = service.getMovieByType(type, value);
		System.out.println(list.toString());
		return list;
	}
	
	@GetMapping("/test")
	public List test() {
		List<Movie> list= new ArrayList();
		list.addAll(service.getMovieByType("city", "C1"));
		List<Movie> copy = list.stream()
				  .collect(Collectors.toList());
		//list=service.getMovieByType("city", "C1");
		//list.add("a");
		return copy;
	}
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<Object> getMovieByName(){
		ResponseEntity<List> entity= new RestTemplate().getForEntity("http://localhost:8081/searchMovies/city/C3", List.class);
		
		ResponseEntity<Movie[]> responseEntity = 
				new RestTemplate().getForEntity("http://localhost:8081/searchMovies/city/C3", Movie[].class);
				//new RestTemplate().getForEntity("http://localhost:8081/searchMovies/city/C3", Object.class);
		Movie[] object = responseEntity.getBody();
		//System.out.println(object.toString());

		//Movie[] movieList= responseEntity.getBody();
		//	System.out.println("o: "+Arrays.toString(movieList));
	return ResponseEntity.ok(object);
		//return testVal;
	}
}
