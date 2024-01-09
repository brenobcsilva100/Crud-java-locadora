import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Ator {

    private Integer codAtor;
    private String name;
    private String nacionalidade;
    private ArrayList<Filme> filmes = new ArrayList<>();

    public Integer getCodAtor() {
        return codAtor;
    }

    public void setCodAtor(Integer codAtor) {
        this.codAtor = codAtor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    public void cadastrarAtor(){
        SortedMap<Ator> cadatrarAtor = new TreeMap();
    }
}
