import java.util.ArrayList;
import java.util.List;

public class SituacaoFinal {
    private List<Nota> listaDeNotas = new ArrayList<>();
    private double notaFinal;
    private String situacao;
    private Aluno aluno;
    private Disciplina disciplina;

    public SituacaoFinal(List<Nota> listaDenotas, double notaFinal, String situacao){
        this.listaDeNotas.addAll(listaDenotas);
        this.notaFinal = notaFinal;
        this.situacao = situacao;
        this.aluno = listaDenotas.get(0).getAluno();
        this.disciplina = listaDenotas.get(0).getAvaliacao().getDisciplina();
    }

    public List<Nota> getListaDeNotas() {
        return listaDeNotas;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
