package br.com.dio.apivisitante.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//cria os getters e setters, toString, iqualsHashCode de forma "automatizada"
@Data
@NoArgsConstructor
@AllArgsConstructor
//o builder me permite construir o meu objeto progressivamente
@Builder
public class VisitanteRequestDto {

    private String cpf;
    private String nome;

}
