package com.digital.innovation.one.project.accesspoint.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class JornadaTrabalho {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
