package br.com.pilgriman;
import java.io.IOException;
import java.util.Scanner;

public class Theon {
        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int N = leitor.nextInt();
            int T, menor = 0, pMenor = 0;

            for (int i = 1; i <= N; i++) {
                T = leitor.nextInt();

                if ((T < menor) && (N >= 1) && (N <= 100) && (T >= 0) && (T <= 20)) {
                    pMenor = i;
                    menor = T;
                } else if ((pMenor == 0) && (N >= 1) && (N <= 100) && (T >= 0) && (T <= 20)) {
                    pMenor = i;
                    menor = T;
                }
            }
            System.out.println(pMenor);
            leitor.close();
        }
    }

