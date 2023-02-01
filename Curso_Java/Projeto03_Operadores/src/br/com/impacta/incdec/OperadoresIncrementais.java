package br.com.impacta.incdec;

public class OperadoresIncrementais {
	public static void main(String[] args) {
		
		int numero = 10;
		System.out.println("numero: " + numero);
		
		numero++;
		System.out.println("numero++: " + numero);
		
		++numero;
		System.out.println("numero++: " + numero);
		//12
		
		int x =numero++;
		//12
		
		//numero = 13.
		//14
		x = ++numero;
		
		System.out.println();
		System.out.println("x: " + x);
		System.out.println("numero: " + numero);
		
		
	}

}
