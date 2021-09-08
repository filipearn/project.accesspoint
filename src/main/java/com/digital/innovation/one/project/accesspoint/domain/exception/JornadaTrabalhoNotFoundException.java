package com.digital.innovation.one.project.accesspoint.domain.exception;

public class JornadaTrabalhoNotFoundException extends EntidadeNotFoundException {
    private static final long serialVersionUID = 1L;

    public JornadaTrabalhoNotFoundException(String message) {
        super(message);
    }

    public JornadaTrabalhoNotFoundException(Long id) {
        this(String.format("Jornada de trabalho com o id %d não foi encontrada!", id));
    }
}
