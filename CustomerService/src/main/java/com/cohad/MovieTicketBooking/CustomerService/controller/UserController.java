package com.cohad.MovieTicketBooking.CustomerService.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cohad.MovieTicketBooking.CustomerService.dataMembers.Movie;

@RestController
public class UserController {
	@Autowired
	MovieSearchProxy proxy;
	
	@GetMapping("/searchMovies")
	public ResponseEntity<List<String>> searchMovies(){
		List<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//add hyperlinks
		return ResponseEntity.ok(list);
	}
	
	
	@GetMapping("/searchMovies/{type}/{city}")
	public ResponseEntity<Object> searchMoviebyCity(
			@PathVariable String type,
			@PathVariable String city
			){
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("city",city);
		map.put("type",type);
		ResponseEntity<Object> responseEntity = 
				new RestTemplate().getForEntity("http://localhost:8081/searchMovies/{type}/{city}", Object.class,map);
		Object object = responseEntity.getBody();
		System.out.println(object.toString());

		return ResponseEntity.ok(object);
	}
	
	@GetMapping("/searchMovies-feign/{type}/{city}")
	public ResponseEntity<Object> searchMoviebyCity1(
			@PathVariable String type,
			@PathVariable String city
			){
		
		Object object = proxy.getMovieByType(type, city);
		System.out.println(object.toString());

		return ResponseEntity.ok(object);
	}
	
	
	@GetMapping("/searchMovies/lang/{lang}")
	public ResponseEntity<String> searchMoviebyLang(){
		return ResponseEntity.ok("C");
	}
}
