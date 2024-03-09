package org.example;

import org.example.model.Produto;
import org.example.service.ServicoProduto;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TesteServicoProduto {

    @Test
    public void testAdicionarProduto() {
        // Arrange
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto = new Produto(1L, "Laptop", "Laptop de última geração", "Eletrônicos", 1500.0, 10);

        // Act
        ServicoProduto.adicionarProduto(listaProdutos, produto);

        // Assert
        assertEquals(1, listaProdutos.size());
        assertEquals(produto, listaProdutos.get(0));
    }

    @Test
    public void testDeletarProduto() {
        // Arrange
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto(1L, "Laptop", "Laptop de última geração", "Eletrônicos", 1500.0, 10);
        listaProdutos.add(produto1);

        // Act
        ServicoProduto.deletarProduto(listaProdutos, 1L);

        // Assert
        assertEquals(0, listaProdutos.size());
    }

    @Test
    public void testEditarProduto() {
        // Arrange
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto(1L, "Laptop", "Laptop de última geração", "Eletrônicos", 1500.0, 10);
        listaProdutos.add(produto1);

        // Act
        ServicoProduto.editarProduto(listaProdutos, 1L, "Novo Nome");

        // Assert
        assertEquals("Novo Nome", listaProdutos.get(0).getNome());
    }

    @Test
    public void testEditarProdutoInexistente() {
        // Arrange
        List<Produto> listaProdutos = new ArrayList<>();

        // Act
        ServicoProduto.editarProduto(listaProdutos, 1L, "Novo Nome");

        // Assert
        assertEquals(0, listaProdutos.size());
    }

    @Test
    public void testBuscarProdutoPorId() {
        // Arrange
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto(1L, "Laptop", "Laptop de última geração", "Eletrônicos", 1500.0, 10);
        listaProdutos.add(produto1);

        // Act
        Produto produtoEncontrado = ServicoProduto.buscarProdutoPorId(listaProdutos, 1L);

        // Assert
        assertEquals(produto1, produtoEncontrado);
    }

    @Test
    public void testBuscarProdutoPorIdInexistente() {
        // Arrange
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto(1L, "Laptop", "Laptop de última geração", "Eletrônicos", 1500.0, 10);
        listaProdutos.add(produto1);

        // Act
        Produto produtoEncontrado = ServicoProduto.buscarProdutoPorId(listaProdutos, 2L);

        // Assert
        assertNull(produtoEncontrado);
    }
}
