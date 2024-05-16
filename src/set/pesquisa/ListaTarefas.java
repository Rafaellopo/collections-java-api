package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasSet.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcuidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.isTarefaConcluida() == true) {
                tarefasConcuidas.add(tarefa);
            }
        }
        return tarefasConcuidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendetes = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.isTarefaConcluida() == false) {
                tarefasPendetes.add(tarefa);
            }
        }
        return tarefasPendetes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaUpdate = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setTarefaConcluida(true);
                tarefaUpdate = tarefa;
                break;
            }
        }
        return tarefaUpdate;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaUpdate = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setTarefaConcluida(false);
                tarefaUpdate = tarefa;
                break;
            }
        }
        return tarefaUpdate;
    }

    public void limparListaTarefas() {
        tarefasSet.removeAll(tarefasSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 02");
        listaTarefas.adicionarTarefa("Tarefa 03");
        listaTarefas.adicionarTarefa("Tarefa 04");
        listaTarefas.adicionarTarefa("Tarefa 05");

        // System.out.println("Quantidades de tarefas: " +
        // listaTarefas.contarTarefas());

        // listaTarefas.exibirTarefas();

        // listaTarefas.removerTarefa("Tarefa 02");

        // listaTarefas.exibirTarefas();

      //  System.out.println(listaTarefas.marcarTarefaConcluida("Tarefa 01"));
       // System.out.println(listaTarefas.marcarTarefaConcluida("Tarefa 02"));
       listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

        // listaTarefas.marcarTarefaPendente("Tarefa 02");
        // listaTarefas.exibirTarefas();
    }

}
