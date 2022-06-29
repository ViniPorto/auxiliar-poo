import java.util.List;

public class SituacaoFinal {
    private Aluno aluno;
    private double notaFinal;
    private String situacao;
    private List<Nota> listaDeNotas;

    public SituacaoFinal(Aluno aluno, double notaFinal, String situacao, List<Nota> listaDeNotas){
        this.aluno = aluno;
        this.notaFinal = notaFinal;
        this.situacao = situacao;
        this.listaDeNotas = listaDeNotas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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

    public List<Nota> getListaDeAvaliacoes() {
        return listaDeNotas;
    }

    public void setListaDeAvaliacoes(List<Nota> listaDeAvaliacoes) {
        this.listaDeNotas = listaDeAvaliacoes;
    }
}
