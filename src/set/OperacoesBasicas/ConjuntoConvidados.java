package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado convidado: convidadosSet){
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 0001);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 0002);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 0003);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 0004);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 0005);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 0005);

        System.out.println(conjuntoConvidados.contarConvidados());
        
                conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(0005);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(0002);

        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();
    }

}
