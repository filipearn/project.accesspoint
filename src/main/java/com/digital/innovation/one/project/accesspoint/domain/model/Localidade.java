package com.digital.innovation.one.project.accesspoint.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Localidade {
    @Id
    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
