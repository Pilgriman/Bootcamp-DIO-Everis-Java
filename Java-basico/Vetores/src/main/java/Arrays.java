public class Arrays {
    public static void main(String[] args) {
        //No java, é preciso passar o tamanho do array
        //obs: nem sempre o tamanho do array é coerente com a quantidade de elementos dentro dele
        double[] temperaturas = new double[365];
        temperaturas[0] = 33.3;
        temperaturas[1] = 32.5;
        temperaturas[2] = 35.4;
        temperaturas[3] = 30.3;

        System.out.println(" o tamanho do array é : " + temperaturas.length);


        //imprimindo valores de um array

        for (int i = 0; i < temperaturas.length; i++){
            System.out.println(" o valor da temperatura do dia " + (i+1) + " é : "  + temperaturas[i]);
        }
        //for melhorado para Arrays
        //obs: Nesse tipo de for , não é possível verificar a posição do valor, somente o valor é mostrado.
        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }
}
