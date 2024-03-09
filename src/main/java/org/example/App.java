package org.example;

import org.example.model.Produto;
import org.example.service.ServicoProduto;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        List<Produto> listaProdutos = new ArrayList<Produto>();

        listaProdutos.add(criarProduto(1L, "Laptop", "Laptop de última geração", "Eletrônicos", 1500.0, 10));
        listaProdutos.add(criarProduto(2L, "Smartphone", "Smartphone com câmera de alta resolução", "Eletrônicos", 800.0, 20));
        listaProdutos.add(criarProduto(3L, "Livro", "Livro best-seller de ficção", "Livros", 30.0, 50));
        listaProdutos.add(criarProduto(4L, "Fones de ouvido", "Fones de ouvido sem fio com cancelamento de ruído", "Eletrônicos", 200.0, 15));
        listaProdutos.add(criarProduto(5L, "Cadeira de escritório", "Cadeira ergonômica para longas horas de trabalho", "Móveis", 250.0, 5));


        ServicoProduto servicoProduto = new ServicoProduto();

        ServicoProduto.exibirTodosProdutos(listaProdutos);

        System.out.println();

        System.out.println("Editando");

        servicoProduto.editarProduto(listaProdutos, 2L, "Celular" );

        servicoProduto.exibirTodosProdutos(listaProdutos);

        System.out.println();
        System.out.println("Removendo Produto");

        servicoProduto.deletarProduto(listaProdutos, 4L);

        servicoProduto.exibirTodosProdutos(listaProdutos);


    }

    public static Produto criarProduto(
            Long id,
            String nome,
            String descricao,
            String categoria,
            double precoUnitario,
            int quantidadeEstoque
    ) {
        return new Produto(id, nome, descricao, categoria, precoUnitario, quantidadeEstoque);

    }

}
