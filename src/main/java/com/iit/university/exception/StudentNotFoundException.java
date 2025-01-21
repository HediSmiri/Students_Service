package com.iit.university.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(Long id) {
        super("Student with ID " + id + " could not be found");
    }
}
