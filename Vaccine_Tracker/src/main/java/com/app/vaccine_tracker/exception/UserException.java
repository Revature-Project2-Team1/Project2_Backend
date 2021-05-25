package com.app.vaccine_tracker.exception;

import com.app.vaccine_tracker.model.User;

public class UserException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UserException() {
        super();
    }

    public UserException(final String message) {
        super(message);
    }
}
