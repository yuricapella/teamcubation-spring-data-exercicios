package br.com.meli.teamcubation_spring_data_exercicios.time.dto.mapper;

import br.com.meli.teamcubation_spring_data_exercicios.time.dto.TimeResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;

public class TimeResponseMapper {
    public static TimeResponseDTO toTimeResponseDTO(Time time) {
        TimeResponseDTO timeResponseDTO = new TimeResponseDTO();
        timeResponseDTO.setNome(time.getNome());
        timeResponseDTO.setPais(time.getPais());
        return timeResponseDTO;
    }
}
