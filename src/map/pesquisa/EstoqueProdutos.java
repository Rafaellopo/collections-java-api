package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMAp;

    public EstoqueProdutos() {
        this.estoqueProdutosMAp = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMAp.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMAp);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMAp.isEmpty()) {
            for (Produto produto : estoqueProdutosMAp.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMAp.values()) {
            if (produto.getPreco() > maiorPreco) {
                produtoMaisCaro = produto;
                maiorPreco = produto.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto produto : estoqueProdutosMAp.values()) {
            if (produto.getPreco() < menorPreco) {
                produtoMaisBarato = produto;
                menorPreco = produto.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotalEstoque = null;
        double maiorQuantidadeValorEstoque = 0d;
        for (Produto produto : estoqueProdutosMAp.values()) {
            if ((produto.getPreco() * produto.getQuantidade()) > maiorQuantidadeValorEstoque) {
                produtoMaiorQuantidadeValorTotalEstoque = produto;
                maiorQuantidadeValorEstoque = produto.getPreco() * produto.getQuantidade();
            }
        }
        return produtoMaiorQuantidadeValorTotalEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Arroz", 110, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Arroz", 20, 6.0);
        estoqueProdutos.adicionarProduto(3L, "Arroz", 10, 51.0);

        // estoqueProdutos.exibirProdutos();
        // System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        // System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        // System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
