package br.com.matriz.parte04;

import java.util.Scanner;

// No mundo corporativo, se utiliza mais o conceito de vetores ou de vetores dentro de vetores
public class ArraysIrregulares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o numero de pessoas que serão entrevistadas: ");
        int numEntrevistados = scanner.nextInt();

            //matriz de strings
        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++){

            System.out.println("Entre com a quantidade de filhos : ");

            int qtdFilhos = scanner.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for ( int j = 0; j < nomesFilhos[i].length; j++){

                System.out.println("Digite o nome do filho " + (j+1));
                nomesFilhos[i][j] = scanner.next();

            }

        }

        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j=0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }

        }

    }
}

