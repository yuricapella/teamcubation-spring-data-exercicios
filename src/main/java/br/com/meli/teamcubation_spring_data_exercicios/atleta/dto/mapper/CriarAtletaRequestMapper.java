package br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.mapper;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.CriarAtletaRequestDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;

public class CriarAtletaRequestMapper {
    public static Atleta toEntity(CriarAtletaRequestDTO atletaRequestDTO, Time time) {
        Atleta atleta = new Atleta();
        atleta.setNome(atletaRequestDTO.getNome());
        atleta.setPosicao(atletaRequestDTO.getPosicao());
        atleta.setTime(time);
        return atleta;
    }
}
