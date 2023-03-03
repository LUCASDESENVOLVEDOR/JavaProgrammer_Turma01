package br.com.impacta.aplicacao;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		//instancia da classe Pessoa
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Lucas");
		pessoa.setIdade(29);
		pessoa.setSexo(Sexo.MASCULINO);
		
		
		//instancia da classe Funcionario.
		Funcionario  funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(29);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Motoboy");
		funcionario.setSalario(3500);
		
		//instancia da classe Aluno.
		Aluno aluno = new Aluno();
		aluno.setNome("Amanda");
		aluno.setIdade(20);
		aluno.setSexo(Sexo.FEMININO);
		aluno.setMatricula(12345);
		
		//Curso cursoDoAluno = new Curso();
		//cursoDoAluno.setCodigo(222);
		//cursoDoAluno.setDescricao("Java Programmer");
		//cursoDoAluno.setCargaHoraria(100);
		//cursoDoAluno.setPreco(1000);
		
		
		aluno.setCurso(new Curso(222,"Java Programmer",100,1000));
		
		
		
		
		
		
		
		
		
		
		

	}

}
