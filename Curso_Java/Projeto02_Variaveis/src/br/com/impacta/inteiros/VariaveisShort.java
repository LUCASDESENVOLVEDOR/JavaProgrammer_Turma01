package br.com.impacta.inteiros;

public class VariaveisShort {
	
public static void main(String[] args) {
		
		//variavel nao comeca com letra maiuscula.
		
		short idade1 = 32767; //
		short idade2 = 1;
		
		System.out.println("Idade da primeira pessoa: " + idade1);
		System.out.println("Idade da segunda pessoa: " + idade2);
		
		//somando as duas idades, e armazenando em uma terceira variavel.
		
		short soma = (short) (idade1 + idade2); //typecast
		
		System.out.println("Soma das Idades: " + soma);
		
		
		
	}

}
