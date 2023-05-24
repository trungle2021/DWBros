package com.app.dwbros.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@EqualsAndHashCode(callSuper = true)
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Data
public class ResourceNotFoundException extends RuntimeException{
    private String resource;
    private String field;
    private String value;
    private String message;

    public ResourceNotFoundException(String resource,String field,String value) {
        super(resource + " not found with " + field + " : " + value);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
