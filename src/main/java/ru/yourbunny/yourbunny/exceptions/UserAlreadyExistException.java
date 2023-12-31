package ru.yourbunny.yourbunny.exceptions;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String username) {
        super(String.format("User with username '%s' already exist", username));
    }
}
