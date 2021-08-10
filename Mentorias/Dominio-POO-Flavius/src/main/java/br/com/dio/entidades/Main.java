package br.com.dio.entidades;

import br.com.dio.entidades.veiculos.Carro;
import br.com.dio.entidades.veiculos.Moto;
import br.com.dio.entidades.veiculos.Utilitario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //uma classe deve ser especificada
        //enquanto o objeto deve ser instaciado

        //Utilitario utilitario = new Utilitario();
        //Moto moto = new Moto();
        //Carro carro = new Carro();
        //Estacionamento estacionamento = new Estacionamento(2.00);
        //System.out.println(estacionamento);

        List<Veiculo> veiculoList = new ArrayList<>();

        Veiculo utilitario = new Veiculo();


        utilitario.setTipoVeiculo(TipoVeiculo.UTILITARIO);
        utilitario.setTipoVeiculo(TipoVeiculo.CARRO);
        //System.out.println(utilitario.getTipoVeiculo());

        Estacionamento estacionamento = new Estacionamento();
        veiculoList.add(utilitario);
        estacionamento.setVeiculos(veiculoList);

        System.out.println(estacionamento.getVeiculos().get(0).getTipoVeiculo());


    }
}
