package br.com.meli.teamcubation_spring_data_exercicios.time.dto;

public class TimeResponseDTO {
    private String nome;
    private String pais;

    public TimeResponseDTO(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public TimeResponseDTO() {

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
}