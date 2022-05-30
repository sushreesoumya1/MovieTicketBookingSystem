package com.cohad.MovieTicketBooking.CustomerService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/searchMovies")
	public ResponseEntity<List<String>> searchMovies(){
		List<String> list= new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//add hyperlinks
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/searchMovies/name/{name}")
	public ResponseEntity<String> searchMoviebyName(@PathVariable String name){
		return ResponseEntity.ok(name);
	}
	
	@GetMapping("/searchMovies/city/{city}")
	public ResponseEntity<String> searchMoviebyCity(){
		return ResponseEntity.ok("B");
	}
	@GetMapping("/searchMovies/lang/{lang}")
	public ResponseEntity<String> searchMoviebyLang(){
		return ResponseEntity.ok("C");
	}
}
