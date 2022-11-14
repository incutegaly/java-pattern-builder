package br.com.design.pattern.builder;

import java.util.List;

public class ProdutoBuilder {

	private Produto produto;
	
	private ProdutoBuilder() {
		produto = new Produto();
	}
	
	public static ProdutoBuilder builder() {
		return new ProdutoBuilder();
	}
	
	public ProdutoBuilder nome(String nome) {
		this.produto.setNome(nome);
		return this;
	}
	
	public ProdutoBuilder imagem(String imagem) {
		this.produto.setImagem(imagem);
		return this;
	}
	
	public ProdutoBuilder preco(String preco) {
		this.produto.setPreco(preco);
		return this;
	}
	
	public ProdutoBuilder cor(String cor) {
		this.produto.setCor(cor);
		return this;
	}
	
	public ProdutoBuilder altura(String altura) {
		this.produto.setAltura(altura);
		return this;
	}
	
	public ProdutoBuilder largura(String largura) {
		this.produto.setLargura(largura);
		return this;
	}
	
	public ProdutoBuilder estilo(String estilo) {
		this.produto.setEstilo(estilo);
		return this;
	}	
	
	public ProdutoBuilder materiais(String materiais) {
		this.produto.setMateriais(materiais);
		return this;
	}	
	
	public ProdutoBuilder caracteristicas(List<String> caracteristicas) {
		this.produto.setCaracteristicas(caracteristicas);
		return this;
	}	
	
	public ProdutoBuilder descricao(String descricao) {
		this.produto.setDescricao(descricao);
		return this;
	}
	
	public Produto build() {
		return this.produto;
		
	}
}
