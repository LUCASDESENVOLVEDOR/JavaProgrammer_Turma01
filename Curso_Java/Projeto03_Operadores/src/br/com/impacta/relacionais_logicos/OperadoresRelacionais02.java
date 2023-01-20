package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais02 {
	public static void main(String[] args) {
		
		int a= 10, b= 20;
		
		boolean b1 = (a <= 10) && (b % 2 == 0);
		                   
		                      //false     OU    //false
		boolean b2 = (a == 10) && (a == b) || (b > 20);
		
		
		               //t           f    ou  f   
		boolean b3 = (a == 10) && ((a == b) || (b > 20));
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	
	}

}
