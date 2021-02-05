package com.example.demo;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super("Status 400 - BAD_REQUEST. " + msg);
    }
}
