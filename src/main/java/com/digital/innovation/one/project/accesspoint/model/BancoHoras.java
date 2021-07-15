package com.digital.innovation.one.project.accesspoint.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoHoras {

    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class BancoHorasId implements Serializable{
        private Long idBancoHoras;
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;

    private LocalDateTime dataTrabalhada;
    private BigDecimal quantHorasTrabalhadas;
    private BigDecimal saldoHoras;
}
