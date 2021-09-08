package com.digital.innovation.one.project.accesspoint.domain.exception;

public class NegocioException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NegocioException(String message) {
        super(message);
    }
    public NegocioException(String message, Throwable reason) {
        super(message, reason);
    }

}