package com.judson.project_associacao.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
@Table(name = "local")
public class Local {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String predio;

    private String sala;

    private Integer capacidade;

    @OneToOne(mappedBy = "local")
    private Palestra palestra;

    public Local(String predio, String sala, Integer capacidade) {
        this.predio = predio;
        this.sala = sala;
        this.capacidade = capacidade;
    }

    public Local() {
    }
}
