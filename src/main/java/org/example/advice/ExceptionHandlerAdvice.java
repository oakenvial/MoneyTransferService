package org.example.advice;

import org.example.exception.InvalidData;
import org.example.exception.NoSuchCardNumber;
import org.example.exception.NotEnoughMoney;
import org.example.model.Post400Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(NoSuchCardNumber.class)
    public ResponseEntity<Post400Response> noSuchCardNumberExceptionHandler(NoSuchCardNumber e) {
        Post400Response response = new Post400Response();
        response.setId(1);
        response.setMessage(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidData.class)
    public ResponseEntity<Post400Response> invalidDataExceptionHandler(InvalidData e) {
        Post400Response response = new Post400Response();
        response.setId(1);
        response.setMessage(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotEnoughMoney.class)
    public ResponseEntity<Post400Response> notEnoughMoneyExceptionHandler(NotEnoughMoney e) {
        Post400Response response = new Post400Response();
        response.setId(1);
        response.setMessage(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
