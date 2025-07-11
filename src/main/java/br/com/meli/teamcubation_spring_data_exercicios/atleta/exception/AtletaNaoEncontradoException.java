package br.com.meli.teamcubation_spring_data_exercicios.atleta.exception;

public class AtletaNaoEncontradoException extends Exception {
    public AtletaNaoEncontradoException(String message) {
        super(message);
    }

    public AtletaNaoEncontradoException(Integer id) {
        super("Atleta com id "+ id + " não encontrado");
    }
}
