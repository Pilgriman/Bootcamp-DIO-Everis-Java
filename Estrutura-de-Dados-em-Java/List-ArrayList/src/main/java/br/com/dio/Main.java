package br.com.dio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Gol"));


        System.out.println(listCarros.contains(new Carro("Chevrolet")));
        System.out.println(listCarros.get(3));

        System.out.println(listCarros.indexOf(new Carro("Gol")));

        System.out.println(listCarros.remove(new Carro("Ford")));
        System.out.println(listCarros);


    }
}
