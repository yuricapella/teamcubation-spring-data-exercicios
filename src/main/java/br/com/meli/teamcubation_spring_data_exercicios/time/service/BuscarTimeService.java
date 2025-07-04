package br.com.meli.teamcubation_spring_data_exercicios.time.service;

import br.com.meli.teamcubation_spring_data_exercicios.time.exception.TimeNaoEncontradoException;
import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;
import br.com.meli.teamcubation_spring_data_exercicios.time.repository.TimeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarTimeService {
    private final TimeRepository timeRepository;

    public BuscarTimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public Time buscarTimePorId(Integer id) {
        Optional<Time> timeOptional = timeRepository.findById(id);
        return timeOptional.orElseThrow(() -> new TimeNaoEncontradoException(id));
    }

    public Page<Time> listarTimes(Pageable pageable) {
        return timeRepository.findAll(pageable);
    }
}
