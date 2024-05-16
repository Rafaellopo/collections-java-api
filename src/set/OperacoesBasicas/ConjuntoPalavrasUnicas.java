package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> listPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        listPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        if (this.verificarPalavra(palavra) == false) {
            listPalavrasUnicas.add(new String(palavra));
        } else {
            System.out.println("Palavra: " + palavra + ", já foi inserida anteriormente");
        }
    }

    public void removerPalavra(String palavra) {
        if (!listPalavrasUnicas.isEmpty()) {
            if (this.verificarPalavra(palavra)) {
                listPalavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada!");
            }
        } else {
            System.out.println("A lista está vazia");
        }

    }

    public boolean verificarPalavra(String palavra) {
        boolean existePalavra = false;
        if (listPalavrasUnicas.contains(palavra)) {
            existePalavra = true;
        }
        return existePalavra;
    }

    public void exibirPalavrasUnicas() {
        String imprimir = "";
        for (String palavra : listPalavrasUnicas) {
            if (imprimir.length() == 0) {
                imprimir += palavra;
            } else {
                imprimir += " " + palavra;
            }
        }
        System.out.println(imprimir);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("palavra 01");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 02");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 03");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 04");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 01");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("palavra 02");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
