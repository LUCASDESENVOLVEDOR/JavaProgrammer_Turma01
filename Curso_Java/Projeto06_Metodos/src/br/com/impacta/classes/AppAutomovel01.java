package br.com.impacta.classes;

import javax.swing.JOptionPane;

public class AppAutomovel01 {

	public static void main(String[] args) {
		
		//declarar variavel.
		
		//new responsavel por criar o objeto;
		Automovel auto = new Automovel();	
		
		auto.lerDados("Honda","Civic",2020,"EBX1234");	
		
	
	
		//auto.setAno(1959);
		
		String texto = auto.mostrar("titulo personalizado");
		
		System.out.println(texto);
		JOptionPane.showMessageDialog(null, texto,"Relátorio", JOptionPane.ERROR_MESSAGE);
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Informe um número"));
		
		
		
		//Automovel auto2 = new Automovel();
		//auto2.lerDados("Chevrolet","Corsa",2023,"AAA0000");		
		
		//texto = auto2.mostrar();
		
		//System.out.println(texto);
		//JOptionPane.showMessageDialog(null, texto);
		
		
	
		
		
		
		
		
		

	}

}























