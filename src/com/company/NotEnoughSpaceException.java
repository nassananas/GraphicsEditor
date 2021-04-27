package com.company;

public class NotEnoughSpaceException extends Exception{
    private String message;
    @Override
    public String getMessage() {
        return message;
    }
    public NotEnoughSpaceException(String message){
        this.message = message + " не может быть помещен на холст";
    }


}
