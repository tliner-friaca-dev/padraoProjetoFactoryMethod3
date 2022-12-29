package br.com.projeto.padraoProjetoFactoryMethod.categoria;

import br.com.projeto.padraoProjetoFactoryMethod.produto.ProdutoDigital;

public class CategoriaDigital extends Categoria {

    public String novoProduto() {

        return new ProdutoDigital().criarProduto();

    }
    
}
