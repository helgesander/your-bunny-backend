package ru.yourbunny.yourbunny.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProfileErrorResponse {
    private String message;
    private Long timestamp;
}
