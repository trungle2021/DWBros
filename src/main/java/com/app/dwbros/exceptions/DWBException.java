package com.app.dwbros.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
@Data
public class DWBException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public DWBException(HttpStatus status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }
}
