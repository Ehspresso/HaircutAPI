package com.riley.haircutAPI.exception;

public class ClientRequestException extends RuntimeException{

    public ClientRequestException(String message) {
        super(message);
    }
}
