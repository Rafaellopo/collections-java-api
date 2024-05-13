package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listNumeros;

    

    public OrdenacaoNumeros() {
       listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> list = new ArrayList<>(listNumeros);
        Collections.sort(list);
        return list;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> list = new ArrayList<>(listNumeros);
        list.sort(Collections.reverseOrder());
        return list;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(120);
        ordenacaoNumeros.adicionarNumero(112);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(12654);
        ordenacaoNumeros.adicionarNumero(188882);
        ordenacaoNumeros.adicionarNumero(137577872);

        System.out.println(ordenacaoNumeros.listNumeros);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}
