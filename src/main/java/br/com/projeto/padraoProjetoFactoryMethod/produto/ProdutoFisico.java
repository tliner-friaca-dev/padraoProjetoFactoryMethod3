package br.com.projeto.padraoProjetoFactoryMethod.produto;

public class ProdutoFisico extends Produto {

    @Override
    public String criarProduto() {

        return "Produto Físico criado";
        
    }
    
}
