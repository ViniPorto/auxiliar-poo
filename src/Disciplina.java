import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDaDisciplina;
    private double notaDeCorte;
    private List<Avaliacao> listaDeAvaliacoes = new ArrayList<>();
    private List<SituacaoFinal> listaBoletim = new ArrayList<>();
    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private int codigo;
    private static int totalDeDisciplinas = 0;

    public Disciplina(String nomeDaDisciplina, double notaDeCorte, List<Aluno> listaDeAlunos){ //TESTAR
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.notaDeCorte = notaDeCorte;
        this.listaDeAlunos.addAll(listaDeAlunos);
        totalDeDisciplinas++; //TESTAR
        this.codigo = totalDeDisciplinas;
    }

    public List<SituacaoFinal> getListaBoletim(){
        return listaBoletim;
    }

    public List<Aluno> getListaDeAlunos(){
        return listaDeAlunos;
    }

    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public void setNomeDaDisciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public double getNotaDeCorte() {
        return notaDeCorte;
    }

    public void setNotaDeCorte(double notaDeCorte) {
        this.notaDeCorte = notaDeCorte;
    }

    public int getCodigo(){
        return codigo;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao){
        listaDeAvaliacoes.add(avaliacao);
    }

    public double getNotaFinal(Aluno aluno){
        double somatorioNotaVezesPeso = 0, somatorioPesos = 0;
        for(Nota nota : aluno.getListaDeNotas()){
            somatorioNotaVezesPeso += (nota.getNota() * nota.getAvaliacao().getPeso());
            somatorioPesos += nota.getAvaliacao().getPeso();
        }
        return ((somatorioNotaVezesPeso / somatorioPesos) * 10.0) / 10.0;
    }

    public String situacaoAluno(double notaFinal){
        if(notaFinal >= notaDeCorte){
            return "Aprovado";
        }
        return "Reprovado";
    }

    public void avaliarAlunos(){
        for(Aluno aluno : listaDeAlunos){
            SituacaoFinal situacao = new SituacaoFinal(aluno.getListaDeNotas(), this.getNotaFinal(aluno), this.situacaoAluno(this.getNotaFinal(aluno)));
            aluno.adicionaSituacaoFinal(situacao);
            listaBoletim.add(situacao);
        }
    }

    public SituacaoFinal getSituacaoFinalPeloAluno(Aluno aluno){
        for(SituacaoFinal situacaoFinal : listaBoletim){
            if(aluno.equals(situacaoFinal.getAluno())){
                return situacaoFinal;
            }
        }
        return new SituacaoFinal(null, 0.0, null);
    }

    @Override
    public String toString(){
        String stringAluno = "";
        String string = "=-=-=-=-=-=-=-=" +
                "\n\nDisciplina: " + nomeDaDisciplina +
                "\nNota de corte: " + notaDeCorte +
                "\n\n";
        for(Aluno aluno : listaDeAlunos){
            stringAluno += "==========" +
                    "\n\nNome do aluno: " + aluno.getNome() +
                    "\nCodigo: " + aluno.getCodigo() +
                    "\n\n<<Avaliacoes>>\n\n";
            for(Nota nota : aluno.getListaDeNotas()){
                if(nota.getAvaliacao().getDisciplina().equals(this)) {
                    stringAluno += "Avaliacao: " + nota.getAvaliacao().getClass().getName() +
                            "\nNota: " + nota.getNota() +
                            "\nPeso: " + nota.getAvaliacao().getPeso() +
                            "\n\n";
                }
            }
            SituacaoFinal situacaoFinal = this.getSituacaoFinalPeloAluno(aluno);
            stringAluno += "----------" +
                    "\nNota final: " + situacaoFinal.getNotaFinal() +
                    "\nSituacao: " + situacaoFinal.getSituacao() +
                    "\n\n";
        }
        string += stringAluno;
        return string;
    }

    @Override
    public boolean equals(Object o){
        return this.codigo == ((Disciplina) o).getCodigo();
    }
}
