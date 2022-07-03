package com.judson.project_associacao.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
@Table(name = "palestra")
public class Palestra {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(name = "data_hora")
    private Date dataHora;

    private Integer duracao;

    @OneToMany(mappedBy = "palestra")
    private List<Palestrante> palestrante;

    @JoinColumn(name = "local_id")
    @OneToOne
    private Local local;


    public Palestra(String titulo, Date dataHora, int duracao) {
        this.titulo = titulo;
        this.dataHora = dataHora;
        this.duracao = duracao;
    }

    public Palestra() {
    }
}
