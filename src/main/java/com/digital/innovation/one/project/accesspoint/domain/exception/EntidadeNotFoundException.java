package com.digital.innovation.one.project.accesspoint.domain.exception;

public abstract class EntidadeNotFoundException extends NegocioException {

    private static final long serialVersionUID = 1L;

    public EntidadeNotFoundException(String message) {
        super(message);
    }
}
