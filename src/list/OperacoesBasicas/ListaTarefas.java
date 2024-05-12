package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaLst;

    public ListaTarefas() {
        this.tarefaLst = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaLst.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa paraRemover: this.tarefaLst){
            if(paraRemover.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(paraRemover);
            }
        }
        this.tarefaLst.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefaLst.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(this.tarefaLst);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        //listaTarefa.removerTarefa("Tarefa 1");
        
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
        
      
    }
}