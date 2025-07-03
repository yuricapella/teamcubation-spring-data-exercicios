package br.com.meli.teamcubation_spring_data_exercicios.atleta.exception;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.controller.AtletaApiController;
import br.com.meli.teamcubation_spring_data_exercicios.global_exception.ErroPadrao;
import br.com.meli.teamcubation_spring_data_exercicios.global_exception.ErroCodigo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice(assignableTypes = AtletaApiController.class)
public class AtletaApiExceptionHandler {

    @ExceptionHandler({AtletaNaoEncontradoException.class})
    public ResponseEntity<ErroPadrao> handlerAtletaNaoEncontradoException(AtletaNaoEncontradoException ex) {
        ErroPadrao erroPadrao = new ErroPadrao();
        erroPadrao.setCodigoErro(ErroCodigo.ATLETA_NAO_ENCONTRADO.name());
        erroPadrao.setDataHora(LocalDateTime.now());
        erroPadrao.setMensagem(ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(erroPadrao);
    }
}
