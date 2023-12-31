package ru.yourbunny.yourbunny.exceptions;

import lombok.Data;

import java.util.Date;

@Data
public class ApplicationErrorResponse {
    private int status;
    private String message;
    private Date timestamp;

    public ApplicationErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }
}
