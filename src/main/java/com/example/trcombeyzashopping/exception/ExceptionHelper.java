package com.example.trcombeyzashopping.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Timestamp;


@ControllerAdvice
public class ExceptionHelper {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHelper.class);

    @ExceptionHandler(value = { EmptyResultDataAccessException.class })
    public ResponseEntity<Object> handleInvalidInputException(EmptyResultDataAccessException ex) {
        logger.error("Id is not valid ",ex.getMessage());
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String info = ts +  "\n"+ ex.getMessage();
        return new ResponseEntity(info, HttpStatus.BAD_REQUEST);
    }



}
