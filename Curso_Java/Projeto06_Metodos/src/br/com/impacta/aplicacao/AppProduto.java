package br.com.impacta.aplicacao;

import br.com.impacta.classes.Produtos;

public class AppProduto {
	public static void main(String[] args) {
		
		Produtos celular = new Produtos();
		
		
		celular.setCodigo(12345); 
		celular.setCategoria("telefonia");
		celular.setDescricao("Iphone");
		celular.setPreco(30000);
				
		
		
		
	}
}
