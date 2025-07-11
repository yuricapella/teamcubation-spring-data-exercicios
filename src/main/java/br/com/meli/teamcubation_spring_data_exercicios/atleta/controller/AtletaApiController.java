package br.com.meli.teamcubation_spring_data_exercicios.atleta.controller;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.AtletaResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.AtletaTimeResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.CriarAtletaRequestDTO;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.dto.mapper.AtletaResponseMapper;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.exception.AtletaNaoEncontradoException;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.service.BuscarAtletaService;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.service.BuscarAtletaTimeService;
import br.com.meli.teamcubation_spring_data_exercicios.atleta.service.CriarAtletaService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/atleta")
public class AtletaApiController {
    private final BuscarAtletaService buscarAtletaService;
    private final BuscarAtletaTimeService buscarAtletaTimeService;
    private final CriarAtletaService criarAtletaService;

    public AtletaApiController(BuscarAtletaService buscarAtletaService, BuscarAtletaTimeService buscarAtletaTimeService, CriarAtletaService criarAtletaService) {
        this.buscarAtletaService = buscarAtletaService;
        this.buscarAtletaTimeService = buscarAtletaTimeService;
        this.criarAtletaService = criarAtletaService;
    }

    @GetMapping
    public Page<AtletaResponseDTO> listar(Pageable pageable) {
        return buscarAtletaService.listarAtletas(pageable)
                .map(AtletaResponseMapper::toAtletaResponseDTO);
    }

    @GetMapping("/time")
    public Page<AtletaTimeResponseDTO> listarNomesDeAtletasETimes(Pageable pageable) {
        return buscarAtletaTimeService.listarNomesDeAtletasETimes(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AtletaResponseDTO> buscarPorId(@PathVariable Integer id) throws AtletaNaoEncontradoException {
        Atleta atletaRetornado = buscarAtletaService.buscarPorId(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(AtletaResponseMapper.toAtletaResponseDTO(atletaRetornado));
    }

    @GetMapping("/posicao")
    public Page<AtletaResponseDTO> buscarPorPosicao(
            @RequestParam String posicao, Pageable pageable) {

        return buscarAtletaService.listarPorPosicao(posicao, pageable)
                .map(AtletaResponseMapper::toAtletaResponseDTO);
    }

    @PostMapping
    public ResponseEntity<AtletaResponseDTO> criar(@RequestBody @Valid CriarAtletaRequestDTO criarAtletaRequestDTO) {
        Atleta atletaCriado = criarAtletaService.criarAtleta(criarAtletaRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(AtletaResponseMapper.toAtletaResponseDTO(atletaCriado));
    }
}
