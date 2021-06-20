package collections.ordenacao;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tordem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>() {
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

    }

}
class Serie<minhasSeries> {
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
        Serie<?> serie = (Serie<?>) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && TempoEpisodio.equals(serie.TempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, TempoEpisodio);
    }
}



