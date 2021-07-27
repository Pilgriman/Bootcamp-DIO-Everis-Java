package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
          Gato gato = new Gato("Mimi","loiro",7);
          Livro livro = new Livro( "Pinocchio", 128);

        System.out.println(gato);
        System.out.println(livro);
    }

}
