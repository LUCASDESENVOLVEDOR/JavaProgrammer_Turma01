package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {

	public static void main(String[] args) {
		
		/*
		 * Neste programa, o usuario fornece uma certa quantidade 
		 * de números. A entrada de dados termina quando o usuario
		 * digitar o número 0.
		 * 
		 * Cada número informado é mostrado na tela.
		 * 
		 * Se o usuario digitar um número negativo, este é ignorado.
		 * 
		 * 
		 * No final, o programa deve mostrar a soma e a quantidade de 
		 * números informados. 
		 * 
		 */
		
		
		
		int soma = 0;
		int quantidade = 0;
		
		while(true) {
			
			int numero = Integer.parseInt(
					  JOptionPane.showInputDialog("Informe um número.")
					  );		
						
			if(numero == 0)
				break; //break para a estrutura de repeticao (while)
			            //break nao sai do programa.
			
			if(numero < 0)
				continue;
			
			System.out.println(numero);
			//soma = soma +  numero;
			soma += numero;
			//quantidade = quantidade + 1;
			//quantidade += 1;
			quantidade++;
			
		}		
		
		
		System.out.println("Soma dos números informados: " + soma);
		System.out.println("Quantidade e números informados: " + quantidade);
		

	}

}
