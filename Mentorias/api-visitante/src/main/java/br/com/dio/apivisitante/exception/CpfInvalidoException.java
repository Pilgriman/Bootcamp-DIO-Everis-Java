package br.com.dio.apivisitante.exception;

public class CpfInvalidoException extends RuntimeException{
    public CpfInvalidoException() {
        super("cpf invalido ou informado");
    }
}
