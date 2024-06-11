package main.br.com.cfarias;

/**	Calculadora simples que possui métodos de soma, subtração, multiplicação e divisão
 * Deve receber parâmetros são inteiros primitivos
 * 
 */
public class Calculadora {
	
	
	/**Soma dois numeros
	 * 
	 * @param i
	 * @param j
	 * @return Retorna a soma entre i e j
	 */
	public static int adicionar(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	/**
	 * Subtrai dois numeros
	 * @param i primeiro numero para ser subtraído
	 * @param j segundo número que subtraí o primeiro
	 * @return retorna a diferença i - j
	 */
	public static int subtrair(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}

	/**
	 * Multiplica dois números inteiros
	 * @param i primeiro inteiro a ser multiplicado
	 * @param j segundo inteiro a ser multiplicado
	 * @return retorna a multiplicacao de i * j
	 */
	public static int multiplicar(int i, int j) {
		// TODO Auto-generated method stub
		return  i * j;
	}

	/**Divisor de dois numeros inteiros, seus parâmetros são validados pelo validatorDivision
	 * 
	 * @param dividendo Deve ser maior que o divisor
	 * @param divisor Divide em partes iguais o dividendo
	 * @return
	 */
	public static int dividir(int dividendo, int divisor) {
		validatorDivision(dividendo, divisor);
		
		return dividendo / divisor;
	}

	/**
	 * Valida se divisor é maior que 0 e dividendo é maior que o divisor
	 * caso contrário retorna um IllegalArgumentExcpetion
	 * @param dividendo
	 * @param divisor
	 */
	public static void validatorDivision(int dividendo , int divisor) {
		if(dividendo < divisor) {
			throw new IllegalArgumentException("O dividendo deve ser maior que o divisor");
		}
		if(divisor == 0) {
			throw new IllegalArgumentException("O divisor deve ser maior que 0");
		}
	}

}
