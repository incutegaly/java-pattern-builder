package br.com.design.pattern.builder;

import java.util.List;

public class Produto {

	private String nome;
	
	private String imagem;
	
	private String preco;
	
	private String cor;
	
	private String altura;
	
	private String largura;
	
	private String tamanho;

	private String avaliacoes;
	
	private String estilo;
	
	private String materiais;
	
	private List<String> caracteristicas;
	
	private String descricao;
	
	public static Produto builder() {
		return new Produto();
	}
	
	protected Produto () {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public void setLargura(String largura) {
		this.largura = largura;
	}

	public void setAvaliacoes(String avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public void setMateriais(String materiais) {
		this.materiais = materiais;
	}

	public void setCaracteristicas(List<String> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}
