package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {
		
		          //atalho jop (ctrl + espaco)
		String usuario = JOptionPane.showInputDialog
				("Qual o seu nome?");
		
		
		
		int x =  Integer.parseInt("20");
		
		
		            //converter para int o que foi digitado.
		int idade = Integer.parseInt( 
				
				//receber o que o usuario digitar como String
				JOptionPane.showInputDialog("Qual a sua idade?")
				
				);
		
		//escrevam a altura com ponto (ex. 1.70)
		
		double altura = Double.parseDouble( 
				JOptionPane.showInputDialog("Qual a sua altura?")
				);
		
		
		String resposta = "Seu nome: " + usuario +
				"\nSua idade: " + idade +
				"\nSua altura: " + altura;
		
		
		JOptionPane.showMessageDialog(null, resposta);
		
		
		//syso
		System.out.println("Seu nome: " + usuario);
		System.out.println("Sua idade: " + idade);
		System.out.println("Sua altura: " + altura);
		
	}

}
