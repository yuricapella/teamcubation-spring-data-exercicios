package br.com.meli.teamcubation_spring_data_exercicios.atleta.service;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.CriarAtletaRequestDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.mapper.CriarAtletaRequestMapper;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.repository.AtletaRepository;
import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;
import br.com.meli.teamcubation_spring_data_exercicios.time.service.BuscarTimeService;
import org.springframework.stereotype.Service;

@Service
public class CriarAtletaService {
    private final AtletaRepository atletaRepository;
    private final BuscarTimeService buscarTimeService;

    public CriarAtletaService(AtletaRepository atletaRepository, BuscarTimeService buscarTimeService) {
        this.atletaRepository = atletaRepository;
        this.buscarTimeService = buscarTimeService;
    }

    public Atleta criarAtleta(CriarAtletaRequestDTO atletaASerCriado) {
        Time time = buscarTimeService.buscarTimePorId(atletaASerCriado.getTimeId());
        Atleta atletaCriado = CriarAtletaRequestMapper.toEntity(atletaASerCriado, time);
        return atletaRepository.save(atletaCriado);
    }
}
