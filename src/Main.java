import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matematica", 7.0);

        Aluno aluno1 = new Aluno("Vinicius");
        Aluno aluno2 = new Aluno("Mirella");

        List<Avaliacao> listaAluno1 = new ArrayList<>();
        listaAluno1.add(new Trabalho(8, 2));
        listaAluno1.add(new Prova(9.5, 4));
        listaAluno1.add(new Prova(8, 4));

        List<Avaliacao> listaAluno2 = new ArrayList<>();
        listaAluno2.add(new Trabalho(7, 2));
        listaAluno2.add(new Prova(6, 4));
        listaAluno2.add(new Prova(8.5, 4));

        matematica.adicionarAluno(aluno1, listaAluno1);
        matematica.adicionarAluno(aluno2, listaAluno2);

        //------------------------------------------------------------------------//

        Disciplina fisica = new Disciplina("Fisica", 8.0);

        Aluno aluno3 = new Aluno("Kadu");
        Aluno aluno4 = new Aluno("Helen");
        Aluno aluno5 = new Aluno("Andresa");
        Aluno aluno6 = new Aluno("Eudes");
        Aluno aluno7 = new Aluno("Matheus");
        Aluno aluno8 = new Aluno("Renan");

        List<Avaliacao> listaAluno3 = new ArrayList<>();
        listaAluno3.add(new Trabalho(9, 2));
        listaAluno3.add(new Trabalho(6.7, 2));
        listaAluno3.add(new Trabalho(8.9, 2));
        listaAluno3.add(new Prova(5.8, 4));

        List<Avaliacao> listaAluno4 = new ArrayList<>();
        listaAluno4.add(new Trabalho(8.8, 2));
        listaAluno4.add(new Trabalho(9, 2));
        listaAluno4.add(new Trabalho(6.7, 2));
        listaAluno4.add(new Prova(9.1, 4));

        List<Avaliacao> listaAluno5 = new ArrayList<>();
        listaAluno5.add(new Trabalho(8.5, 2));
        listaAluno5.add(new Trabalho(7.8, 2));
        listaAluno5.add(new Trabalho(9.3, 2));
        listaAluno5.add(new Prova(10, 4));

        List<Avaliacao> listaAluno6 = new ArrayList<>();
        listaAluno6.add(new Trabalho(6.4, 2));
        listaAluno6.add(new Trabalho(7.6, 2));
        listaAluno6.add(new Trabalho(8.0, 2));
        listaAluno6.add(new Prova(9.7, 4));

        List<Avaliacao> listaAluno7 = new ArrayList<>();
        listaAluno7.add(new Trabalho(9.8, 2));
        listaAluno7.add(new Trabalho(4, 2));
        listaAluno7.add(new Trabalho(2, 2));
        listaAluno7.add(new Prova(1.5, 4));

        List<Avaliacao> listaAluno8 = new ArrayList<>();
        listaAluno8.add(new Trabalho(1.1, 2));
        listaAluno8.add(new Trabalho(3.4, 2));
        listaAluno8.add(new Trabalho(5.5, 2));
        listaAluno8.add(new Prova(6, 4));

        fisica.adicionarAluno(aluno3, listaAluno3);
        fisica.adicionarAluno(aluno4, listaAluno4);
        fisica.adicionarAluno(aluno5, listaAluno5);
        fisica.adicionarAluno(aluno6, listaAluno6);
        fisica.adicionarAluno(aluno7, listaAluno7);
        fisica.adicionarAluno(aluno8, listaAluno8);

        //------------------------------------------------------------------------//

        System.out.println(fisica);
        System.out.println(matematica);
    }
}
