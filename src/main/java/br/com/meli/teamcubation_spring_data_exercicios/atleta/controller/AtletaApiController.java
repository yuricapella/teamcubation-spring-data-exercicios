package br.com.meli.teamcubation_spring_data_exercicios.atleta.controller;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.AtletaResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.CriarAtletaRequestDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.mapper.AtletaResponseMapper;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.service.BuscarAtletaService;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.service.CriarAtletaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/atleta")
public class AtletaApiController {
    private final BuscarAtletaService buscarAtletaService;
    private final CriarAtletaService criarAtletaService;

    public AtletaApiController(BuscarAtletaService buscarAtletaService, CriarAtletaService criarAtletaService) {
        this.buscarAtletaService = buscarAtletaService;
        this.criarAtletaService = criarAtletaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AtletaResponseDTO> buscarPorId(@PathVariable Integer id) {
        Atleta atletaRetornado = buscarAtletaService.buscarPorId(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(AtletaResponseMapper.toAtletaResponseDTO(atletaRetornado));
    }

    @PostMapping
    public ResponseEntity<AtletaResponseDTO> criar(@RequestBody @Valid CriarAtletaRequestDTO criarAtletaRequestDTO) {
        Atleta atletaCriado = criarAtletaService.criarAtleta(criarAtletaRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(AtletaResponseMapper.toAtletaResponseDTO(atletaCriado));
    }
}
