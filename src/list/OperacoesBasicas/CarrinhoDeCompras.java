package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Vestido", 15, 2);
        carrinho.adicionarItem("Sapato", 10, 0);
        carrinho.adicionarItem("Sapato", 150, 20);

        carrinho.calcularValorTotal();

        carrinho.exibirItens();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        if (quantidade < 1) {
            quantidade = 1;
        }
        this.itens.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : this.itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        this.itens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : this.itens) {
            if (item.getQuantidade() > 0) {
                valorTotal += (item.getPreco() * item.getQuantidade());
            } else {
                continue;
            }
        }
        System.out.println("O valor total do carrinho de compra é: " + valorTotal);
    }

    public void exibirItens() {
        System.out.println(this.itens);
    }

}
