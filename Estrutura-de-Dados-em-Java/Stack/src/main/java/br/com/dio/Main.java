package br.com.dio;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarrros = new Stack<>();

        //metodo push chama os elementos da lista, setando o ultimo colocado
        // como o topo da pilha

        stackCarrros.push(new Carro("Ford"));
        stackCarrros.push(new Carro("Chevrolet"));
        stackCarrros.push(new Carro("Volkswagen"));

        System.out.println(stackCarrros);

        //metodo pop retira quem esta no topo da pilha
        System.out.println(stackCarrros.pop());

        System.out.println(stackCarrros);

        //metodo peek só mostra quem esta no topo da pilha , mas nao retira dados algum
        System.out.println(stackCarrros.peek());

        //metodo empty verifica se a stack esta vazia passando um valor booleano
        System.out.println(stackCarrros.empty());

    }
}
