public class Aluno {
    private String nome;
    private static int totalDeAlunos = 0;
    private int codigo;

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

    @Override
    public String toString(){
        return "Nome: " + this.nome;
    }

    @Override
    public boolean equals(Object o){
        return this.codigo == ((Aluno) o).getCodigo();
    }
}
