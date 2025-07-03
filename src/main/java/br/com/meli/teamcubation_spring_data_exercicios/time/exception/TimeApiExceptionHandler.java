package br.com.meli.teamcubation_spring_data_exercicios.time.exception;

import br.com.meli.teamcubation_spring_data_exercicios.global_exception.ErroCodigo;
import br.com.meli.teamcubation_spring_data_exercicios.global_exception.ErroPadrao;
import br.com.meli.teamcubation_spring_data_exercicios.time.controller.TimeApiController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice(assignableTypes = TimeApiController.class)
public class TimeApiExceptionHandler {

    @ExceptionHandler({TimeNaoEncontradoException.class})
    public ResponseEntity<ErroPadrao> handlerTimeNaoEncontradoException(TimeNaoEncontradoException ex) {
        ErroPadrao erroPadrao = new ErroPadrao();
        erroPadrao.setCodigoErro(ErroCodigo.TIME_NAO_ENCONTRADO.name());
        erroPadrao.setDataHora(LocalDateTime.now());
        erroPadrao.setMensagem(ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(erroPadrao);
    }
}
