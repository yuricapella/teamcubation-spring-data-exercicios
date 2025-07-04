package br.com.meli.teamcubation_spring_data_exercicios.atleta.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CriarAtletaRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 255, message = "O nome deve ter no máximo 255 caracteres")
    private String nome;

    @NotBlank(message = "A posição é obrigatória")
    @Size(max = 255, message = "A posição deve ter no máximo 255 caracteres")
    private String posicao;

    @NotNull(message = "O timeId é obrigatório")
    @Positive(message = "O timeId deve ser um número positivo maior que zero")
    private Integer timeId;

    public CriarAtletaRequestDTO(String nome, String posicao, Integer timeId) {
        this.nome = nome;
        this.posicao = posicao;
        this.timeId = timeId;
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

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }
}
