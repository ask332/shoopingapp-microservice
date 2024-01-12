package com.item.controllers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.item.entities.ErrorInfo;
import com.item.exceptions.ItemNotFoundException;

@RestControllerAdvice
public class ItemExHandler {
	@ExceptionHandler(ItemNotFoundException.class)
	public ResponseEntity<ErrorInfo> handle404(ItemNotFoundException ex) {
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setMessage(ex.getMessage());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
	}

}
