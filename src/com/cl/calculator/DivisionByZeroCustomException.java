package com.cl.calculator;

public class DivisionByZeroCustomException extends Exception{
    public DivisionByZeroCustomException(String message){
        super(message);
    }
}
