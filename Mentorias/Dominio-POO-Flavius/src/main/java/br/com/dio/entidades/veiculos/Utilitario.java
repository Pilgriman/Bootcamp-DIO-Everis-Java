package br.com.dio.entidades.veiculos;

import br.com.dio.entidades.Veiculo;
//quando o metodo é públic podemos acessá-lo em todo nosso programa
//quando o metodo é protected só podemos acessá-lo dentro do package
//quando o metodo é private se refere ao acesso a essa classe

public class Utilitario extends Veiculo {

    private String descricao;
    private String empresa;
    private String peso;
    private String altura;

    public Utilitario() {

    }

    //atraves dos gets e settes podemos utilizar o conceito de encapsulamento
    //no qual, só tornamos publico o metodo que desejarmos

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}


