package com.example.demo;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super("Status 401 - UNAUTHORIZED " + msg);
    }
}
