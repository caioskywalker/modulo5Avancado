package teste.br.com.cfarias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import main.br.com.cfarias.Fibonacci;

public class FibonacciTeste {
	
	@Test
    public void deveRetornarZeroParaPosicaoZero() {
        long resultado = Fibonacci.encontrarElementoPD(0);
        assertEquals(0, resultado);
    }

    @Test
    public void deveRetornarUmParaPosicaoUm() {
        long resultado = Fibonacci.encontrarElementoPD(1);
        assertEquals(1, resultado);
    }

    @Test
    public void deveRetornarSomaDosElementosAnterioresParaPosicoesMaiores() {
        long resultado = Fibonacci.encontrarElementoPD(6);
        assertEquals(8, resultado);
    }
    
    @Test
    public void deveRetornarZeroParaPosicaoZerofindElement() {
        long resultado = Fibonacci.findElement(0);
        assertEquals(0, resultado);
    }

    @Test
    public void deveRetornarUmParaPosicaoUmfindElement() {
        long resultado = Fibonacci.findElement(1);
        assertEquals(1, resultado);
    }

    @Test
    public void deveRetornarSomaDosElementosAnterioresParaPosicoesMaioresfindElement() {
        long resultado = Fibonacci.findElement(6);
        assertEquals(8, resultado);
    }

 

}
