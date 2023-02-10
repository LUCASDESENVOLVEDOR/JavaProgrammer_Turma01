package br.com.impacta.classes;

public class Automovel {

	
//atributos.
 private String	marca;
 private String	modelo;
 private int	    ano;
 private String	placa;
 
	public String mostrar() {
		
		String resposta = "Marca: " + marca + 
				          "\nModelo: " + modelo + 
				          "\nAno: " + ano + 
				          "\nPlaca:" + placa;
		
		return resposta;
		
		
	}

	public void lerDados(String marca, String modelo, int ano, String placa)
	{
		//this é uma referencia para termos acesso os atributos da classe.
		
		//this referencia da propria classe.
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}

	

}
