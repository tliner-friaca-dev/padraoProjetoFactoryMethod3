package br.com.projeto.padraoProjetoFactoryMethod.categoria;

import br.com.projeto.padraoProjetoFactoryMethod.produto.ProdutoFisico;

public class Categoria {

    public String novoProduto() {

        return new ProdutoFisico().criarProduto();

    }
    
}
