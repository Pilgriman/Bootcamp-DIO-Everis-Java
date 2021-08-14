package br.com.pilgriman;

import java.util.Scanner;

public class IfElse {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Entre com sua idade:");

        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("é maior de idade");
        }else{
            System.out.println("Não é maior de idade");
        }*/
//************************************************************************
       System.out.println("Entre com o valor do produto:");
        double produto = scan.nextDouble();
        if (produto <= 10){
            System.out.println("Produto barato");
        }else if (produto < 10 && produto <15){
            System.out.println("Voce pode pedir um desconto");
        }else if( produto >= 15 && produto < 17){
            System.out.println("Precisa pesquisar mais...");
        }else{
            System.out.println( "Produto muito caro");
        }
    }
}





