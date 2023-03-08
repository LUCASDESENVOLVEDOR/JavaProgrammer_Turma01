package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo01 {

	public static void main(String[] args) {
		
		//quem executa método é sempre OBJETO. 
		//Variavel não executa método.
		
		Pessoa p1 = new Funcionario("Joel",29,Sexo.MASCULINO, "Empresario",35000);
		JOptionPane.showMessageDialog(null, p1.mostrar());

	}

}
