package br.com.meli.teamcubation_spring_data_exercicios.time.model;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "times")
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String pais;

    private LocalDateTime fundacao;

    @OneToMany(mappedBy = "time", cascade = CascadeType.ALL)
    private List<Atleta> atleta;

    public Time() {
        this.fundacao = LocalDateTime.now();
    }

    public Time(String nome, String pais, List<Atleta> atleta) {
        this.nome = nome;
        this.pais = pais;
        this.atleta = atleta;
        this.fundacao = LocalDateTime.now();
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDateTime getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDateTime fundacao) {
        this.fundacao = fundacao;
    }

    public List<Atleta> getAtleta() {
        return atleta;
    }

    public void setAtleta(List<Atleta> atleta) {
        this.atleta = atleta;
    }
}
