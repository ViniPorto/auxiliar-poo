import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Disciplina {
    private String nomeDaDisciplina;
    private double notaDeCorte;
    private List<Avaliacao> listaDeAvaliacoes;
    private List<SituacaoFinal> listaBoletim;

    public Disciplina(String nomeDaDisciplina, double notaDeCorte){
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.notaDeCorte = notaDeCorte;
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

    public void adicionarAvaliacao(Avaliacao avaliacao){
        listaDeAvaliacoes.add(avaliacao);
    }

    public static double getNotaFinal(List<Avaliacao> listaDeAvaliacoes){
        double somatorioNotaVezesPeso = 0, somatorioPesos = 0;
        for(Avaliacao avaliacao : listaDeAvaliacoes){
            somatorioPesos += avaliacao.getPeso();
            somatorioNotaVezesPeso += avaliacao.getPeso() * avaliacao.getNota();
        }
        return ((somatorioNotaVezesPeso / somatorioPesos) * 10.0) / 10.0;
    }

    public void situacaoBoletim(){
        for(Avaliacao avaliacao : listaDeAvaliacoes){

        }
    }

    @Override
    public String toString(){
        String string = "Disciplina -> " + this.nomeDaDisciplina +
                "\nNota de corte -> " + this.notaDeCorte +
                "\n\n=-=-=-=-=-=-=-=-=-=-=-=\n\n";
        for(Aluno aluno : listaDeAlunos.keySet()){
            String listaEmString = "";
            for(Avaliacao avaliacao : listaDeAlunos.get(aluno)){
                listaEmString += "Avaliacao -> " + avaliacao.getClass().getName() +
                        "\nNota -> " + avaliacao.getNota() +
                        "\nPeso -> " + avaliacao.getPeso() +
                        "\n\n";
            }
            string += "Aluno -> " + aluno.getNome() +
                    "\nNotas:\n\n" + listaEmString +
                    "Nota final: " + getNotaFinal(listaDeAlunos.get(aluno)) +
                    "\nSituacao: " + this.situacaoBoletim(getNotaFinal(listaDeAlunos.get(aluno))) +
                    "\n\n=-=-=-=-=-=-=-=-=-=-=-=\n\n";
        }
        return string;
    }
}
