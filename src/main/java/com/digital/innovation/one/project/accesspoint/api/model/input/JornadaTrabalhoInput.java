package com.digital.innovation.one.project.accesspoint.api.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class JornadaTrabalhoInput {

    @NotNull
    private String descricao;
}
