package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, quantidade, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoExibir = new TreeSet<>(produtoSet);
        return produtoExibir;
    }
    
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoExibirPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoExibirPorPreco.addAll(produtoSet);
        return produtoExibirPorPreco;
    }
    
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 01", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 02", 105d, 4);
        cadastroProdutos.adicionarProduto(1L, "Produto 01", 150d, 55);
      //  cadastroProdutos.adicionarProduto(3L, "Produto 03", 5d, 50);
       // cadastroProdutos.adicionarProduto(4L, "Produto 04", 155d, 95);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }

}
