import java.util.ArrayList;
import java.util.List;

public abstract class Avaliacao {
    //Sem testes unitários por se tratar de uma classe abstrata
    private int peso;
    private List<Nota> listaAlunosENotas = new ArrayList<>();
    private Disciplina disciplina;
    private static int totalDeAvaliacoes = 0;
    private int codigo;



    public Avaliacao(int peso, Disciplina disciplina){
        this.peso = peso;
        this.disciplina = disciplina;
        disciplina.adicionarAvaliacao(this);
        totalDeAvaliacoes++;
        this.codigo = totalDeAvaliacoes;
    }

    public int getCodigo(){
        return codigo;
    }

    public void adicionarAlunoENota(Aluno aluno, double notaAvaliacao){ //TESTAR
        Nota nota = new Nota(aluno, this, notaAvaliacao);
        listaAlunosENotas.add(nota);
        aluno.adicionaNota(nota);
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o){
        return this.codigo == ((Avaliacao) o).getCodigo();
    }
}
