package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer>  agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
       if(!agendaContatosMap.isEmpty()){
        agendaContatosMap.remove(nome);
       }
    }

    public void exibirContatos(){
        if(!agendaContatosMap.isEmpty()){
            System.out.println(agendaContatosMap);
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Nome 01", 112115454);
        agendaContatos.adicionarContato("Nome 03", 11115454);
        agendaContatos.adicionarContato("Nome 02", 115454);
        agendaContatos.adicionarContato("Nome 04", 1122254);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Nome 01");

        System.out.println(agendaContatos.pesquisarPorNome("Nome 03"));
    }
}
