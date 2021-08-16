package br.com.pilgraman.matriz.parte03;

/*Matriz 3 dimensões : raramente se utiliza no dia a dia , porem ela aparece , as vezes, para quem trabalha
com jogos*/



public class Aula03Matriz {
    public static void main(String[] args) {
        int[][][] matrizTridimensional = new int[3][3][3];

        for (int i=0; i < matrizTridimensional.length; i++){
            for ( int j=0; j < matrizTridimensional[i].length; j++){
                for ( int k=0; k < matrizTridimensional[i][j].length; k++){
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                    matrizTridimensional[i][j][k] = i + j + k;

                }

            }
        }
        //obs: poderiamos efetuar a soma com as estrturas de for acima, mas prefimos faze-la separadamente
        //por uma questão didatica
        int soma = 0;
        int somaDosPares = 0;
        int somaDosImpares = 0;
        for (int i=0; i < matrizTridimensional.length; i++){
            for (int j= 0; j< matrizTridimensional[i].length; j++){
                for (int k=0; k < matrizTridimensional[i][j].length; k++){
                       soma += matrizTridimensional[i][j][k];

                       if ( matrizTridimensional[i][j][k] % 2 == 0){

                           somaDosPares += matrizTridimensional[i][j][k];
                       }else{
                           somaDosImpares += matrizTridimensional[i][j][k];
                       }

                     }

                }

            }

        System.out.println("A soma total = " + soma);
        System.out.println("A soma dos pares = " + somaDosPares);
        System.out.println("A soma dos impares = " + somaDosImpares);

        }
    }
