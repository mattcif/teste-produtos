package org.example.service;

import org.example.model.Produto;

import java.util.List;

public class ServicoProduto {


    public static void editarProduto(List<Produto> listaProdutos, Long idProduto, String novoNome) {

        for (Produto produto : listaProdutos) {
            if(produto.getId().equals(idProduto)) {
                produto.setNome(novoNome);
                break;
            }
        }



    }


    public static void deletarProduto(List<Produto> listaProdutos, Long idProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getId().equals(idProduto)) {
                listaProdutos.remove(produto);
                break;
            }
        }
    }

    public static void exibirTodosProdutos(List<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            System.out.println("Produto: " + produto.getNome() + ", Categoria: " + produto.getCategoria() +
                    ", Preço Unitário: " + produto.getPrecoUnitario() + ", Quantidade em Estoque: " + produto.getQuantidadeEstoque());
        }
    }

    public static void adicionarProduto(List<Produto> listaProdutos, Produto produto) {
        listaProdutos.add(produto);
    }

    public static Produto buscarProdutoPorId(List<Produto> listaProdutos, Long id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }
}
