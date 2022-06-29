public class Nota {
    private Aluno aluno;
    private Avaliacao avaliacao;
    private double nota;

    public Nota(Aluno aluno, Avaliacao avaliacao, double nota){
        this.aluno = aluno;
        this.avaliacao = avaliacao;
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
