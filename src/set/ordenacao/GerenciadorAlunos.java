package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        for (Aluno alunorRemover : alunoSet) {
            if (alunorRemover.getMatricula() == matricula) {
                alunoSet.remove(alunorRemover);
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> eAlunosNome = new TreeSet<>(alunoSet);
        return eAlunosNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> eAlunosNota = new TreeSet<>(new ComparatorPorNota());
        eAlunosNota.addAll(alunoSet);
        return eAlunosNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 01", 0001L, 5.5);
        gerenciadorAlunos.adicionarAluno("Aluno 02", 0002L, 6.5);
        gerenciadorAlunos.adicionarAluno("Aluno 03", 0003L, 7.0);
        gerenciadorAlunos.adicionarAluno("Aluno 04", 0004L, 8.5);
        gerenciadorAlunos.adicionarAluno("Aluno 01", 0001L, 9.0);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }

}
