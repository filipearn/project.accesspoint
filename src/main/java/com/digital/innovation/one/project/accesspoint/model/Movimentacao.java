package com.digital.innovation.one.project.accesspoint.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Movimentacao {

    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;

    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;

    @ManyToOne
    private Ocorrencia ocorrencia;

    @ManyToOne
    private Calendario calendario;


}
