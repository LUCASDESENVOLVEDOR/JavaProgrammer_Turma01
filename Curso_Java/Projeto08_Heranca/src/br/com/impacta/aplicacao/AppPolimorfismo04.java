package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo04 {
public static void main(String[] args) {
	
	//Quem executa método é sempre um objeto! 		
	Pessoa p1 = new Funcionario("Joel",29,Sexo.MASCULINO, "Motoboy",4000);
	
	//Desejamos alterar o valor salário no objeto.
	
	if(p1 instanceof Funcionario) {
		 Funcionario func = (Funcionario)p1;			
		 func.setSalario(5000);
		 JOptionPane.showMessageDialog(null, p1.mostrar());			
	}
	
	
	
	p1 = new Aluno("Joel",29,Sexo.MASCULINO, 1234, 
			 new Curso(10,"c#",40, 500));
	
	
	Curso curso = new Curso(11,"Java",100,1200);
	
	if(p1 instanceof Aluno) {
		
		//Aluno aluno = (Aluno)p1;
		 ((Aluno)p1).setCurso(curso);			
		 JOptionPane.showMessageDialog(null, p1.mostrar());
	}	
	
  }
}
