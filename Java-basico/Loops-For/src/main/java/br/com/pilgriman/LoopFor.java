package br.com.pilgriman;

public class LoopFor {
    public static void main(String[] args) {
        /*int i;
        int max= 10;
        System.out.println("Contando até " + max);
        for ( i = 0; i <= max; i++){
            System.out.println("O valor de i: " + i);
        }*/
 //******************************************************
        /*int i;
        int min= 1;
        System.out.println("Contagem regressiva de 10 até " + min);
        for (i = 10; i >= min ;i--){
            System.out.println("O valor de i: " + i);
        }*/

 //For para mais de uma variavel
 /*     for(int i = 0, j = 10;i < j;i++,j--){
            System.out.println("O valor de i: " + i + "," + "O valor de j: " + j);

 }*/

//For com partes ausentes
        /*int i=0;
        for (; i < 5;){
            System.out.println("O valor de i " + i);
                i++;
}*/

//tabuada de 5

        int j=5;
        int mult;

        for(int i= 1 ;i < 10;i++){
            mult= i * j;
            System.out.println(i + "X" + j + "=" + mult);

        }

    }

}

