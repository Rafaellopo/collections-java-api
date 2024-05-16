package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato: contatoSet){
            if(contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato: contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rafael 01", 5555555);
        agendaContatos.adicionarContato("Rafael 02", 5555335);
        agendaContatos.adicionarContato("Thiago 03", 5556665);
        agendaContatos.adicionarContato("Rafael 04", 5552225);
        agendaContatos.adicionarContato("Rodrigo 05", 5551115);
        agendaContatos.adicionarContato("Marilia 06", 5555775);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Rafael"));
        
        System.out.println(agendaContatos.atualizarNumeroContato("Rafael 01", 323232));
        
        agendaContatos.exibirContatos();
    }

}
