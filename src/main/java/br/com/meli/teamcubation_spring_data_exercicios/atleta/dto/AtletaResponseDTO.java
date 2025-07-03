package br.com.meli.teamcubation_spring_data_exercicios.atleta.dto;

public class AtletaResponseDTO {
    private String nome;
    private String posicao;

    public AtletaResponseDTO(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public AtletaResponseDTO() {

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
}
