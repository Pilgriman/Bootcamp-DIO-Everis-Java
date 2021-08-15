package br.com.pilgriman;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero:");

        int num = scanner.nextInt();

        System.out.println("Entre com um limete:");

        int max = scanner.nextInt();
/*o break aqui é utilizado para sair do loop-for, pois quando o primeiro valor divisivel por 7 é encontrado
ele sai do loop-for*/
        /*for (int i = num; i <= max;i++){
            if (i % 7 == 0){
                System.out.println("O valor de i: " + i);
                break;
            }
        }*/
//********************************************************
         Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero:");

        int num = scanner.nextInt();

        System.out.println("Entre com um limete:");

        int max = scanner.nextInt();
// o continue fará o contrario do exemplo acima, ou seja, ele ignorará toda vez que aparecer um múltiplo de 7
// o continue é mais utilizado quando trabalhamos um for dentro de outro for.
//Dessa forma, podemos indicar a direção do continue para o for mais externo, por exemplo.
        for (int i = num; i <= max;i++){
            if (i % 7 == 0){
                continue;

            }
            System.out.println("O valor de i: " + i);
        }

    }

}
