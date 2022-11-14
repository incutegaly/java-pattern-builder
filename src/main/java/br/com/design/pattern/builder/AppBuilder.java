package br.com.design.pattern.builder;

public class AppBuilder {
    public static void main(String[] args) {
        
        Produto sapato = ProdutoBuilder.builder()
        		.nome("sb casual")
        		.cor("preto")
        		.estilo("casual")
        		.preco("100.00")
        		.imagem("src/imagem/exemplo")
        		.descricao("exemplo")
        		.build();
        
        Produto mesa = ProdutoBuilder.builder()
        		.nome("mesa escritório")
        		.cor("marrom")
        		.estilo("classica")
        		.preco("1000.00")
        		.imagem("src/imagem/exemplo")
        		.altura("1.90")
        		.largura("1.70")
        		.materiais("madeira")
        		.descricao("exemplo")
        		.build();
    }
}