package br.com.impacta.classes;

import javax.swing.JOptionPane;

public class AppAutomovel01 {

	public static void main(String[] args) {
		
		//declarar variavel.
		
		//new responsavel por criar o objeto;
		Automovel auto = new Automovel();	   
		auto.lerDados("Honda","Civic",2010,"EBX1234");	
		
		String texto = auto.mostrar();
		
		System.out.println(texto);
		JOptionPane.showMessageDialog(null, texto);
		
		Automovel auto2 = new Automovel();
		auto2.lerDados("Chevrolet","Corsa",2023,"AAA0000");		
		
		
		

	}

}























