package br.com.dio.apivisitante.validation;

import br.com.dio.apivisitante.dto.VisitanteRequestDto;
import br.com.dio.apivisitante.exception.CpfInvalidoException;
import br.com.dio.apivisitante.exception.NomeInvalidoException;

import java.util.Optional;
import java.util.function.Predicate;

public class VisitanteValidation {

    private VisitanteValidation(){}

    public static void validarCriacaoDoVisitante(VisitanteRequestDto dto) {
        Optional.ofNullable(dto.getCpf()).filter(Predicate.not(String::isEmpty)).orElseThrow(CpfInvalidoException::new);
        Optional.ofNullable(dto.getNome()).filter(Predicate.not(String::isEmpty)).orElseThrow(NomeInvalidoException::new);
    }
}
