package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo01 {

	public static void main(String[] args) {
		
		
		//Quem executa método é sempre um objeto! 		
		Pessoa p1 = new Funcionario("Joel",29,Sexo.MASCULINO, "Motoboy",4000);
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		p1 = new Aluno("Joel",29,Sexo.MASCULINO, 1234, 
				 new Curso(10,"c#",40, 500));
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		
		
	}

}
