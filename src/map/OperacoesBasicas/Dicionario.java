package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public String exibirPalavras() {
        String palavra = "";
        if (!dicionarioMap.isEmpty()) {
            for (String key : dicionarioMap.keySet()) {
                palavra += " " + key;
            }
        }
        return palavra;
    }

    public void pesquisarPorPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(palavra + " " + dicionarioMap.get(palavra));
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra 01", "Definição 01");
        dicionario.adicionarPalavra("Palavra 02", "Definição 02");
        dicionario.adicionarPalavra("Palavra 03", "Definição 03");
        dicionario.adicionarPalavra("Palavra 04", "Definição 04");

        dicionario.removerPalavra("Palavra 04");

        System.out.println(dicionario.exibirPalavras());

        //dicionario.pesquisarPorPalavra("Palavra 04");
    }
}
