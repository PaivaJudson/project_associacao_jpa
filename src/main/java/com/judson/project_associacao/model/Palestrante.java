package com.judson.project_associacao.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
@Table(name = "palestrante")
public class Palestrante {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(name = "mini_biografia")
    private String miniBiografia;

    @JoinColumn(name = "palestra_id")
    @ManyToOne
    private Palestra palestra;

    public Palestrante(String nome, String miniBiografia) {
        this.nome = nome;
        this.miniBiografia = miniBiografia;
    }

    public Palestrante() {
    }
}
