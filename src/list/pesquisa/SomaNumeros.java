package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> nuList = new ArrayList<>();

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(11);
        somaNumeros.adicionarNumero(120);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(14);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Este é maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Este é o menor número: " + somaNumeros.encontrarMenorNumero());
        
        somaNumeros.exibirNumeros();;
    }

    public void adicionarNumero(int numero) {
        nuList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int num : nuList) {
            soma += num;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        Integer numMaior = 0;
        for (int num : nuList) {
            if (numMaior == null)
                numMaior = num;
            else if (numMaior < num)
                numMaior = num;
            else
                continue;

        }
        return numMaior;
    }

    public Integer encontrarMenorNumero() {
        Integer numMenor = null;
        for (int num : nuList) {
            if (numMenor == null)
                numMenor = num;
            else if (numMenor > num)
                numMenor = num;
            else
                continue;

        }
        return  numMenor;

    }

    public void exibirNumeros() {
        System.out.print("Aqui estão todos o números: ");
        for(int num: nuList){
            System.out.print(num +  " ");
        }
    }
}
