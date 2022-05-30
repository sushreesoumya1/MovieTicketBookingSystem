package com.cohad.MovieTicketBooking.MovieSearchService.exception;

import org.springframework.stereotype.Component;

@Component
public class MovieSearchException extends RuntimeException {
	
	public MovieSearchException() {
        super();
    }
}
