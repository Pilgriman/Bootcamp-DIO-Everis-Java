package br.com.dio.apivisitante.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visitantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Visitante {
    @Id
    private String id;
    private String cpf;
    private String nome;
}
