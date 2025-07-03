package br.com.meli.teamcubation_spring_data_exercicios.atleta.model;

import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;
import jakarta.persistence.*;

@Entity
@Table(name = "atletas")
public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String posicao;

    @ManyToOne
    @JoinColumn(name = "time_id", nullable = false)
    private Time time;

    public Atleta() {
    }

    public Atleta(String nome, String posicao, Time time) {
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
