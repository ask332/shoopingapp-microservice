package com.cartservice.controllers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cartservice.entities.ErrorInfo;
import com.cartservice.exceptions.CustomerNotFoundException;

@RestControllerAdvice
public class CustomerExHandler {
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ErrorInfo> handle404(CustomerNotFoundException ex) {
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setMessage(ex.getMessage());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
	}
}
