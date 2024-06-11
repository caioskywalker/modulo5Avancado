package teste.br.com.cfarias;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import main.br.com.cfarias.Calculadora;

public class CalculadoraTeste {
	
	//Calculadora cal;
	
	
	public CalculadoraTeste() {
		//cal = new Calculadora();
	}
	/**Testa soma entre dois numeros
	 */
	@Test
	public void testeAdicionar_HappyPath() {
		int result = Calculadora.adicionar(5,6);
		assertNotNull(result);
		assertEquals(11, result);
	}
	/**Testa subtracao entre dois numeros
	 * 
	 */
	@Test
	public void testeSubtrair_HappyPath() {
		int result = Calculadora.subtrair(8,5);
		assertNotNull(result);
		assertEquals(3, result);
		
	}
	/**Testa multiplicacao entre dois numeros
	 * 
	 */
	@Test
	public void testeMultiplicar_HappyPath() {
		int result = Calculadora.multiplicar(2,4);
		assertNotNull(result);
		assertEquals(8, result);
		
		
	}
	
	/**Testa se a divisão ocorre corretamente,
	 * Não é exatamente um teste unitário, pois depende do método validatorDivision
	 */
	@Test
	public void testeDividir_HappyPath () {
		int result = Calculadora.dividir(10,2);
		assertNotNull(result);
		assertEquals(5, result);
	}
	@Test
	public void testeDividir_UnHappyPath() {
		
		assertThrows(IllegalArgumentException.class, () -> Calculadora.dividir(0, 10));
	}
	
	@Test
	public void testeValidatorDivision_UnHappyPath() {
		
		assertThrows(IllegalArgumentException.class, () -> Calculadora.validatorDivision(10, 0));
		
	}
	/** Testa se será lançado o IllegalArgumentExcpetion "O dividendo deve ser maior que o divisor"
	 */
	@Test
	public void testeValidatorDivisionTryCatch_UnHappyPath() {
		
		try {
			Calculadora.validatorDivision(0, 10);
			fail("IllegalArgumentException não lançado...");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e); //Imprimira, dividendo deve ser maior que o divisor
		}
	}
	
	/** Testa se será lançado o IllegalArgumentExcpetion "O divisor deve ser maior que 0"
	 */
	@Test
	public void testeValidatorDivisionTryCatch2_UnHappyPath() {
		
		try {
			Calculadora.validatorDivision(50, 0);
			fail("IllegalArgumentException não lançado...");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e); //Imprimira, divisor deve ser maior que 0
		}
	}
	
	
	


}
