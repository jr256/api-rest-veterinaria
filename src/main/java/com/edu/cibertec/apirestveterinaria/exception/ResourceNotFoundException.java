package com.edu.cibertec.apirestveterinaria.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){
        super(message);
    }
}
