package com.example.errorexceptions.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {
    @ExceptionHandler(A)
    public String arithmeticError(Exception ex, Model model) {
        return "error/arithmetic";
    }
}
