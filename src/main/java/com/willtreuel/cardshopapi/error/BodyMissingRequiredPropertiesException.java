package com.willtreuel.cardshopapi.error;

public class BodyMissingRequiredPropertiesException extends RuntimeException {
    public BodyMissingRequiredPropertiesException(String msg){
        super(msg);
    }
}
