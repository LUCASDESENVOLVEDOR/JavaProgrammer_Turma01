package br.com.impacta.inteiros;

public class VariaveisByte {
	
	public static void main(String[] args) {
		
		//variavel nao comeca com letra maiuscula.
		
		byte idade1 = 80; //-128 ate 127
		byte idade2 = 48;
		
		System.out.println("Idade da primeira pessoa: " + idade1);
		System.out.println("Idade da segunda pessoa: " + idade2);
		
		//somando as duas idades, e armazenando em uma terceira variavel.
		
		byte soma = (byte) (idade1 + idade2); //typecast
		
		System.out.println("Soma das Idades: " + soma);
		
		
		
	}

}
