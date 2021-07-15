package com.digital.innovation.one.project.accesspoint.model;

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
public class JornadaTrabalho {

    @Id
    private Long id;
    private String descricao;
}
