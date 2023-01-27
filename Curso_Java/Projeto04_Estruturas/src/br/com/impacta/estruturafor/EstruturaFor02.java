package br.com.impacta.estruturafor;

import javax.swing.JOptionPane;

public class EstruturaFor02 {
	
	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.
				showInputDialog("Quantas pessoas estão na sala")
				);
		
		int maior = 0;
		int pessoa = 0;
		
		for (int i = 1; i <= quantidade; i++) {
			
		     String pergunta = "Pessoa " + i +
				       " \nQual a idade da Pessoa " + i + " ?";
			
		    int idade = Integer.parseInt(JOptionPane.showInputDialog(pergunta)
		    		                    );
		    
		    if(idade > maior) {
		    	maior = idade;
		        pessoa = i;
		    }
			
		}
		
		
		JOptionPane.showMessageDialog(null, "Maior idade: " + maior +
				                             "\n Pessoa: " + pessoa);
		
		
		
		
		
		
	}

}
