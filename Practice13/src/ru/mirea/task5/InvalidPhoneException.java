package ru.mirea.task5;

public class InvalidPhoneException extends Exception {
    public InvalidPhoneException() {
    }

    public InvalidPhoneException(String message) {
        super(message);
    }
}
