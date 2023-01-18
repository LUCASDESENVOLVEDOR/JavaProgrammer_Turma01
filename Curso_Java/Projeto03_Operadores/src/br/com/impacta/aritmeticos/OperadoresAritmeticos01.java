package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos01 {
  
	public static void main(String[] args) {
		
		//int a = 10;
		//int b = 3;
		//int c =5;
		
		int a = 10,				
			b = 3, 
			c= 5;
		
		int divisao1 = a/b;			
		int resto = a % b;
		double divisao2 = a/b;
		
		double divisao3 = (double)a/b;
		 
		double x = a;
		double divisao4 = x / b;
	
		
		System.out.println("divisão 1: " +  divisao1);
		System.out.println("divisão 2: " +  divisao2);
		System.out.println("resto: " +  resto);
		System.out.println("divisão 3: " +  divisao3);
		System.out.println("divisão 4: " +  divisao4);
	}
}
