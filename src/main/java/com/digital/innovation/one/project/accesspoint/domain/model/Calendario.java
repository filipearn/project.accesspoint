package com.digital.innovation.one.project.accesspoint.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Calendario {

    @Id
    private Long id;

    @ManyToOne
    private TipoData tipo;

    private String descricao;
    private LocalDateTime dataEspecial;

}
