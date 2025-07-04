package br.com.meli.teamcubation_spring_data_exercicios.atleta.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AtletaTimeResponseDTO {
    @JsonProperty("JOGADOR")
    private String nomeAtleta;
    @JsonProperty("TIME")
    private String nomeTime;

    public AtletaTimeResponseDTO(String nomeAtleta, String nomeTime) {
        this.nomeAtleta = nomeAtleta;
        this.nomeTime = nomeTime;
    }

    public AtletaTimeResponseDTO() {
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
}
