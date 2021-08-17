package br.com.pilgriman;

//SERA PRECISO IMPORTAR AS BIBLIOTECAS DO JUNIT
//obs: "Sonar" é uma plataforma interessante para testar o programa desenvolvido e avaliar a qualidade dele.
//obs2: "checkstyle" e "pmd" ferramentas que ajudam analisar codigos tambem.
import br.com.pilgriman.CalculoDivisao.Divisao;
import br.com.pilgriman.CalculoMultiplicacao.Multiplicacao;
import br.com.pilgriman.CalculoSoma.Calculo;
import br.com.pilgriman.CalculoSubtracao.Subtracao;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculoTest {
    public CalculoTest() {
    }

    @Test
    public void testSoma() {
        int a = 10;
        int b = 20;
        int expResult = 30;
        int result = Calculo.Soma(a, b);
        System.out.println("result");
        // o assert serve para saber se realmente o codigo esta sendo testado e existe varios tipos deles.
        assertEquals(expResult, result);

    }

    @Test
    public void testSubtracao() {
        int a = 20;
        int b = 10;
        int expResult = 10;
        int result = Subtracao.Subtracao(a, b);
        System.out.println("result");
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiplicacao(){
        int a = 10;
        int b = 20;
        int expResult = 200;
        int result = Multiplicacao.Multiplicacao(a, b);
        System.out.println("result");
        assertEquals(expResult, result);
    }

    @Test
    public void testDivisao(){
        int a = 20;
        int b = 10;
        int expResult = 2;
        int result = Divisao.Divisao(a , b);
        System.out.println("result");
        assertEquals(expResult, result);
    }

}
