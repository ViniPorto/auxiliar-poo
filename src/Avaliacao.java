import java.util.ArrayList;
import java.util.List;

public abstract class Avaliacao {
    //Sem testes unitários por se tratar de uma classe abstrata
    private int peso;
    private List<Nota> listaAlunosENotas = new ArrayList<>();

    public Avaliacao(int peso){
        this.peso = peso;
    }

    public void AdicionarAlunoENota(Aluno aluno, double nota){
        listaAlunosENotas.add(new Nota(aluno, this, nota));
    }

    public List<Nota> getListaAlunosENotas(){
        return listaAlunosENotas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
