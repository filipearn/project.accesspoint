package com.digital.innovation.one.project.accesspoint.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Ocorrencia {
    @Id
    private Long id;

    private String nome;
    private String descricao;

}
