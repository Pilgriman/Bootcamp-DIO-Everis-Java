package br.com.dio.apivisitante.service;

import br.com.dio.apivisitante.dto.VisitanteRequestDto;
import br.com.dio.apivisitante.entity.Visitante;
import br.com.dio.apivisitante.repository.VisitanteRepository;
import br.com.dio.apivisitante.validation.VisitanteValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VisitanteService {

    private  final VisitanteRepository repository;

    public Visitante criar(VisitanteRequestDto dto) {
        VisitanteValidation.validarCriacaoDoVisitante(dto);

        var id = UUID.randomUUID().toString();
        var visitante = new Visitante(id, dto.getCpf(), dto.getNome());

        return repository.save(visitante);
    }
}
