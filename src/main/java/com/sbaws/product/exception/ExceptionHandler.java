package com.sbaws.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler extends Exception {
    @org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
        return new ResponseEntity<>(new ErrorResponse().builder()
                .errorMessage(productNotFoundException.getMessage())
                .errorCode(productNotFoundException.getErrorCode())
                .build(), HttpStatus.NOT_FOUND);
    }
}
