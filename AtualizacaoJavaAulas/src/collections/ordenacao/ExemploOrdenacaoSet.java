package collections.ordenacao;


import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\t ordem aleatoria \t--");
        Set<Serie> minhasSeries = new HashSet<>() { // HashSet a lista sera disponibilizada sequencia aleatoria
            {
                add(new Serie("Got", "fantasia", 60));
                add(new Serie("Adão e Eva", "romance", 120));
                add(new Serie("Steve Jobs", "ficção cientifica", 90));
                add(new Serie("Roberto Carlos", "musical", 120));
            }
        };
        for (Serie serie : minhasSeries) System.out.println(serie.getNome()
                + "--" + serie.getGenero() + "--"
                + serie.getTempoEpisodio());

        System.out.println("--\tordem inserção\t--"); // LinkedHashSet a lista sera disponibilizada sequencia sequencial
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
            {
                add(new Serie("Got", "fantasia", 60));
                add(new Serie("Adão e Eva", "romance", 120));
                add(new Serie("Steve Jobs", "ficção cientifica", 90));
                add(new Serie("Roberto Carlos", "musical", 120));
            }
        };
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome()
                + "--" + serie.getGenero() + "--"
                + serie.getTempoEpisodio());

        System.out.println("--\t ordem natural (tempo do epsodio) \t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome()
                + "--" + serie.getGenero() + "--"
                + serie.getTempoEpisodio());

        System.out.println("--\t Ordem Nome / Genero / Tempo epsodio) \t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries); // adicionando as serie já criadas.

        for (Serie serie : minhasSeries3) System.out.println(serie.getNome()
                + "--" + serie.getGenero() + "--"
                + serie.getTempoEpisodio());

//        exercicio depois fareis para testes
//        System.out.println("--\t Ordem Genero) \t--");
//        System.out.println("--\t Tempo epsodio) \t--");

    }

    }


class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer TempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        TempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return TempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", TempoEpisodio=" + TempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && TempoEpisodio.equals(serie.TempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, TempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0 ) return tempoEpisodio;

       return  this.getGenero().compareTo(serie.getGenero());

    }
}
     class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
        public int compare(Serie s1, Serie s2 ) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if(nome != 0 ) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if(genero != 0 ) return genero;

            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

        }


}




