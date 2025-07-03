package br.com.meli.teamcubation_spring_data_exercicios.atleta.controller;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.AtletaResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.mapper.AtletaResponseMapper;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.service.BuscarAtletaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/atleta")
public class AtletaApiController {
    BuscarAtletaService buscarAtletaService;

    public AtletaApiController(BuscarAtletaService buscarAtletaService) {
        this.buscarAtletaService = buscarAtletaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AtletaResponseDTO> buscarPorId(@PathVariable Integer id) {
        Atleta atletaRetornado = buscarAtletaService.buscarPorId(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(AtletaResponseMapper.toAtletaResponseDTO(atletaRetornado));
    }
}
