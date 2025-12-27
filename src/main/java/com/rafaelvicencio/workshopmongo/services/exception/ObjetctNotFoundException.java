package com.rafaelvicencio.workshopmongo.services.exception;

public class ObjetctNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ObjetctNotFoundException(String msg){
        super(msg);
    }
}
