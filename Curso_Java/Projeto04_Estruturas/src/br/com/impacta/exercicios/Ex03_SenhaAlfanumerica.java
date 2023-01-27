package br.com.impacta.exercicios;

public class Ex03_SenhaAlfanumerica {

	public static void main(String[] args) {
		
		/*
		 * Este programa deve gerar uma senha com 6 digitos
		 * onde cada digito é numero entre 0 e 9. A senha final
		 * é uma string
		 */
		
		String senha = "";		
		for (int i = 0; i < 6; i++) {			
		   senha +=  (int)(Math.random() * 10);			
		}
		
		System.out.println(senha);  
	}
}
