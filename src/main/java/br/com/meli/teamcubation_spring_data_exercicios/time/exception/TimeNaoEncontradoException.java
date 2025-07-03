package br.com.meli.teamcubation_spring_data_exercicios.time.exception;

public class TimeNaoEncontradoException extends RuntimeException {
    public TimeNaoEncontradoException(String message) {
        super(message);
    }

    public TimeNaoEncontradoException(Integer id) {
        super("Time com id "+ id + " não encontrado");
    }
}
