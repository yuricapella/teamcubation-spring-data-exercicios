package br.com.meli.teamcubation_spring_data_exercicios.time.service;

import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;
import br.com.meli.teamcubation_spring_data_exercicios.time.repository.TimeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class BuscarTimeService {
    private final TimeRepository timeRepository;

    public BuscarTimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public Time buscarTimePorId(Integer id) {
        Optional<Time> timeOptional = timeRepository.findById(id);
        return timeOptional.orElseThrow
                (() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Time com id "+ id + " não encontrado"));
    }

    public Page<Time> listarTimes(Pageable pageable) {
        return timeRepository.findAll(pageable);
    }
}
