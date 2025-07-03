package br.com.meli.teamcubation_spring_data_exercicios.atleta.service;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.exception.AtletaNaoEncontradoException;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.repository.AtletaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarAtletaService {
    private final AtletaRepository atletaRepository;

    public BuscarAtletaService(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }

    public Atleta buscarPorId(Integer id) {
        Optional<Atleta> atletaOptional = atletaRepository.findById(id);
        return atletaOptional.orElseThrow(() -> new AtletaNaoEncontradoException(id));
    }
}
