package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList =  new ArrayList<>();
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 1986);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 1990);
        catalogo.adicionarLivro("Livro 2", "Autor 3", 2020);
        catalogo.adicionarLivro("Livro 3", "Autor 5", 2030);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 2040);

        System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
        System.out.println("---------------------------");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1990, 2030));
        System.out.println("---------------------------");
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for(Livro livro: livrosList){
               if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
               } 
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for(Livro livro: livrosList){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(livro);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
       Livro livroPorTitulo = null;
       if(!livrosList.isEmpty()){
        for(Livro livro: livrosList){
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = livro;
                break;
            }
        }
       }
       return livroPorTitulo;
    }
}
