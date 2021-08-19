package br.com.dio.apivisitante.controller;

import br.com.dio.apivisitante.dto.VisitanteRequestDto;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.with;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Criando minha aplicação com TDD

@ExtendWith(SpringExtension.class)
// Isso me permite subir a aplicação em qualquer porta
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TesteVisitanteController {

    //criando uma porta aleatoria
    @LocalServerPort
    private int port;


    //antes de cada teste crie a porta aleatoria
    @BeforeEach
    void setup (){
        RestAssured.port = port;
    }

    @Test
    void deveEnviarRequisicaoParaCadastrarVisitanteMasRetornaCpfInvalido() {
        var endpoint = "/visitantes";
        var metodo = "POST";

        var cpf = "111111111111";
        var nome = "Visitante da DIO";
        var payload = new VisitanteRequestDto(null, nome);

        var response = with()
                .contentType(ContentType.JSON)
                .body(payload)
                .request(metodo, endpoint)
                .then()
                .extract()
                .response();

        var json = response.jsonPath();

        assertAll("todos os testes",
                () -> assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode()),
                () -> assertNotNull(json.getString("dataHora")),
                () -> assertEquals("cpf inválido ou não informado", json.getString("mensagem"))


        );


    }

    @Test
    void deveEnviarRequisicaoParaCadastrarVisitanteMasRetornaNomeInvalido() {
        var endpoint = "/visitantes";
        var metodo = "POST";

        var cpf = "111111111111";
        var payload = new VisitanteRequestDto(cpf, null);

        var response = with()
                .contentType(ContentType.JSON)
                .body(payload)
                .request(metodo, endpoint)
                .then()
                .extract()
                .response();

        var json = response.jsonPath();

        assertAll("todos os testes",
                () -> assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode()),
                () -> assertNotNull(json.getString("dataHora")),
                () -> assertEquals("nome inválido ou não informado", json.getString("mensagem"))


        );


    }
}
