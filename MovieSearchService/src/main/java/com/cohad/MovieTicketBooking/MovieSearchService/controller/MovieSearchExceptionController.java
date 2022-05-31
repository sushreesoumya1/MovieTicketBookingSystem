/*
 * package com.cohad.MovieTicketBooking.MovieSearchService.controller;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.ResponseStatus; import
 * org.springframework.web.bind.annotation.RestControllerAdvice;
 * 
 * import com.cohad.MovieTicketBooking.MovieSearchService.exception.
 * MovieSearchException;
 * 
 * @RestControllerAdvice public class MovieSearchExceptionController {
 * 
 * @ExceptionHandler(MovieSearchException.class)
 * 
 * @ResponseStatus(code = HttpStatus.NOT_FOUND)
 * 
 * @ResponseBody public String handleNoRecordFoundException(){ return
 * "Movie Not Found"; }
 * 
 * }
 */