package br.com.dio;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        //adiciona elementos obs: é o contrario do offer , quando nao adiciona retorna um erro
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peuget")));
        System.out.println(queueCarros);

        //metodo offer retorna um valor booleano false quando não consegue executar
        System.out.println(queueCarros.offer(new Carro("Renault")));

        //metodo peek retorna o primeiro da fila, porem quando ele nao encontra nada retorna nulo
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //metodo poll exclui o primeiro elemento da fila
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        //metodo empty mostra um valor booleano (true ou false)dependendo se a lista esta vazia ou nao
        System.out.println(queueCarros.isEmpty());

        //metodo size mostra o tamanho da lista
        System.out.println(queueCarros.size());

        }


}
