package br.com.dio.apivisitante.controller;


import br.com.dio.apivisitante.dto.VisitanteRequestDto;
import br.com.dio.apivisitante.entity.Visitante;
import br.com.dio.apivisitante.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService service;



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visitante criar(@RequestBody VisitanteRequestDto dto) {
        //atraves do service , crio minhas regras de negocio
        return service.criar(dto);
    }
}
