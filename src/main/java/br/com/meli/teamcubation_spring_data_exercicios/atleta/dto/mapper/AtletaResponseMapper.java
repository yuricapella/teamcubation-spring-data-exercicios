package br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.mapper;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.AtletaResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;

public class AtletaResponseMapper {
    public static AtletaResponseDTO toAtletaResponseDTO(Atleta atleta) {
        AtletaResponseDTO atletaResponseDTO = new AtletaResponseDTO();
        atletaResponseDTO.setNome(atleta.getNome());
        atletaResponseDTO.setPosicao(atleta.getPosicao());
        return atletaResponseDTO;
    }
}
