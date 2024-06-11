package main.br.com.cfarias;

public class Fibonacci {
	private static final int MAXIMO_ELEMENTOS = 90000;
	private static final long[] elemFib = new long[getMaximoElementos()];

	public static long encontrarElementoPD(int n) {

		for (int i = 0; i < getMaximoElementos(); i++) {
			elemFib[i] = -1; // Todos os elementos dentro do array são inicializados com -1
		}

		return findElement(n);
	}

	public static long findElement(int n) {

		if (elemFib[n] == -1) {// Se o elemento for -1...
			if (n <= 1) {
				elemFib[n] = n;// 0 ou 1...
			} else {
				elemFib[n] = findElement(n - 1) + findElement(n - 2);
			}
		}

		return elemFib[n];

	}

	public static int getMaximoElementos() {
		return MAXIMO_ELEMENTOS;
	}
}
