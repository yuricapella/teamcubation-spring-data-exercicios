package br.com.meli.teamcubation_spring_data_exercicios.atleta.service;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.AtletaTimeResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.repository.AtletaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BuscarAtletaTimeService {
    private final AtletaRepository atletaRepository;

    public BuscarAtletaTimeService(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }

    public Page<AtletaTimeResponseDTO> listarNomesDeAtletasETimes(Pageable pageable){
        return atletaRepository.findAll(pageable)
                .map(atleta -> new AtletaTimeResponseDTO(atleta.getNome(), atleta.getTime().getNome()));
    }
}



