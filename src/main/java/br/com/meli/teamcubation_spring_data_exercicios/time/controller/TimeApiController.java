package br.com.meli.teamcubation_spring_data_exercicios.time.controller;

import br.com.meli.teamcubation_spring_data_exercicios.time.dto.TimeResponseDTO;
import br.com.meli.teamcubation_spring_data_exercicios.time.dto.mapper.TimeResponseMapper;
import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;
import br.com.meli.teamcubation_spring_data_exercicios.time.service.BuscarTimeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/time")
public class TimeApiController {
    private final BuscarTimeService buscarTimeService;

    public TimeApiController(BuscarTimeService buscarTimeService) {
        this.buscarTimeService = buscarTimeService;
    }

    @GetMapping
    public Page<TimeResponseDTO> listar(Pageable pageable) {
        return buscarTimeService.listarTimes(pageable)
                .map(TimeResponseMapper::toTimeResponseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TimeResponseDTO> buscarPorId(@PathVariable Integer id) {
        Time timeRetornado = buscarTimeService.buscarTimePorId(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(TimeResponseMapper.toTimeResponseDTO(timeRetornado));
    }
}
