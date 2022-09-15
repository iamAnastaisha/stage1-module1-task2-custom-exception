package com.epam.mjc;

public class StudentException extends IllegalArgumentException{

    public StudentException(String message) {
        super("Could not find student with ID " + message);
    }
}
