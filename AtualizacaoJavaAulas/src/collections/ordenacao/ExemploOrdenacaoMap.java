package collections.ordenacao;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args){
        System.out.println("--\t Ordenação aleatória \t--");
        Map<String , Livro> meusLivros = new HashMap<>(){{
            put("Hawking , Stephen", new Livro("Uma Breve História do Tempo" , 256));
            put("Duhigg , Charles", new Livro("O Poder do Hábito" , 408));
            put("Harare , Yuaval Noah", new Livro("21 Lições para o Século 21" , 432));


        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + "-" + livro.getValue());

        System.out.println("--\t Orden de inserção \t--");
        Map<String , Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking , Stephen", new Livro("Uma Breve História do Tempo" , 256));
            put("Duhigg , Charles", new Livro("O Poder do Hábito" , 408));
            put("Harare , Yuaval Noah", new Livro("21 Lições para o Século 21" , 432));

        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + "-" + livro.getValue());

        System.out.println("--\t Exiba em Orden alfabeticas dos autores dos livros \t--");
        Map<String , Livro> meusLivros2 = new TreeMap<>( meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
        System.out.println(livro.getKey() + "-" + livro.getValue());

        System.out.println("--\t Exiba em Orden alfabeticas dos livros \t--");
        Set<Map.Entry<String , Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
       meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + "-" + livro.getValue());

        // System.out.println("--\t Exiba em Orden dos numeros de paginas dos livros \t--");
        // depois fazer
        

    }
}
class Livro{
   private String nome;
   private Integer paginas;

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
class ComparatorNome implements Comparator<Map.Entry<String , Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}