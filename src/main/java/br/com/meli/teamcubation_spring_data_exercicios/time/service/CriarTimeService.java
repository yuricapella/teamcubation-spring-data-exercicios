package br.com.meli.teamcubation_spring_data_exercicios.time.service;

import br.com.meli.teamcubation_spring_data_exercicios.time.dto.CriarTimeRequestDTO;
import br.com.meli.teamcubation_spring_data_exercicios.time.dto.mapper.CriarTimeRequestMapper;
import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;
import br.com.meli.teamcubation_spring_data_exercicios.time.repository.TimeRepository;
import org.springframework.stereotype.Service;

@Service
public class CriarTimeService {
    private final TimeRepository timeRepository;

    public CriarTimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public Time criarTime(CriarTimeRequestDTO timeASerCriado) {
        Time timeCriado = CriarTimeRequestMapper.toEntity(timeASerCriado);
        return timeRepository.save(timeCriado);
    }
}
