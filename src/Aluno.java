import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private static int totalDeAlunos = 0;
    private int codigo;
    private List<Nota> listaDeNotas = new ArrayList<>();
    private List<SituacaoFinal> listaSituacaoFinal = new ArrayList<>();
    public Aluno(String nome){
        this.nome = nome;
        totalDeAlunos++;
        this.codigo = totalDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getTotalDeAlunos(){
        return totalDeAlunos;
    }

    public int getCodigo(){
        return codigo;
    }

    public void adicionaSituacaoFinal(SituacaoFinal situacaoFinal){ //TESTAR
        listaSituacaoFinal.add(situacaoFinal);
    }

    public List<Nota> getListaDeNotas(){
        return listaDeNotas;
    }

    public void adicionaNota(Nota nota){ //TESTAR
        listaDeNotas.add(nota);
    }

    @Override
    public boolean equals(Object o){ //TESTAR
        return this.codigo == ((Aluno) o).getCodigo();
    }
}
