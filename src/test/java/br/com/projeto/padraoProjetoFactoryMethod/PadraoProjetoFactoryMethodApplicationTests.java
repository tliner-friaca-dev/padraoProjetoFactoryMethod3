package br.com.projeto.padraoProjetoFactoryMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.padraoProjetoFactoryMethod.categoria.Categoria;
import br.com.projeto.padraoProjetoFactoryMethod.categoria.CategoriaDigital;

@SpringBootTest
class PadraoProjetoFactoryMethodApplicationTests {

	@Test
	void criarProdutoFisico_quandoSucesso() {

		String produto = new Categoria().novoProduto();

		assertEquals("Produto Físico criado", produto);
	}

	@Test
	void criarProdutoDigital_quandoSucesso() {

		String produto = new CategoriaDigital().novoProduto();

		assertEquals("Produto Digital criado", produto);
	}

}
