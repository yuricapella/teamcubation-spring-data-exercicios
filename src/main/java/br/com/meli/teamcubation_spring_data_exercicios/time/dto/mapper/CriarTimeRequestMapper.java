package br.com.meli.teamcubation_spring_data_exercicios.time.dto.mapper;

import br.com.meli.teamcubation_spring_data_exercicios.time.dto.CriarTimeRequestDTO;
import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;

public class CriarTimeRequestMapper {
    public static Time toEntity(CriarTimeRequestDTO timeRequestDTO) {
        Time time = new Time();
        time.setNome(timeRequestDTO.getNome());
        time.setPais(timeRequestDTO.getPais());
        return time;
    }
}
