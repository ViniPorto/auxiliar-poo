import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> listaDeAlunos1 = new ArrayList<>();

        Aluno aluno1 = new Aluno("Vinicius");
        Aluno aluno2 = new Aluno("Mirella");
        Aluno aluno3 = new Aluno("Pietro");
        Aluno aluno4 = new Aluno("Helen");
        Aluno aluno5 = new Aluno("Kadu");

        listaDeAlunos1.add(aluno1);
        listaDeAlunos1.add(aluno2);
        listaDeAlunos1.add(aluno3);
        listaDeAlunos1.add(aluno4);
        listaDeAlunos1.add(aluno5);

        Disciplina disciplina1 = new Disciplina("Matematica", 7.0, listaDeAlunos1);
        Disciplina disciplina2 = new Disciplina("Arte", 6.0, listaDeAlunos1);

        Avaliacao avaliacao1 = new Trabalho(2, disciplina1);
        Avaliacao avaliacao2 = new Trabalho(2, disciplina1);
        Avaliacao avaliacao3 = new Prova(6, disciplina1);

        avaliacao1.adicionarAlunoENota(aluno1, 7.0);
        avaliacao1.adicionarAlunoENota(aluno2, 9.4);
        avaliacao1.adicionarAlunoENota(aluno3, 6.7);
        avaliacao1.adicionarAlunoENota(aluno4, 8.3);
        avaliacao1.adicionarAlunoENota(aluno5, 7.5);

        avaliacao2.adicionarAlunoENota(aluno1, 9.0);
        avaliacao2.adicionarAlunoENota(aluno2, 9.2);
        avaliacao2.adicionarAlunoENota(aluno3, 4.0);
        avaliacao2.adicionarAlunoENota(aluno4, 5.6);
        avaliacao2.adicionarAlunoENota(aluno5, 10.0);

        avaliacao3.adicionarAlunoENota(aluno1, 2.0);
        avaliacao3.adicionarAlunoENota(aluno2, 7.8);
        avaliacao3.adicionarAlunoENota(aluno3, 7.2);
        avaliacao3.adicionarAlunoENota(aluno4, 9.0);
        avaliacao3.adicionarAlunoENota(aluno5, 8.9);

        disciplina1.avaliarAlunos();

        Avaliacao avaliacao4 = new Trabalho(2, disciplina2);
        Avaliacao avaliacao5 = new Prova(4, disciplina2);
        Avaliacao avaliacao6 = new Prova(4, disciplina2);

        avaliacao4.adicionarAlunoENota(aluno1, 7.0);
        avaliacao4.adicionarAlunoENota(aluno2, 10.0);
        avaliacao4.adicionarAlunoENota(aluno3, 9.4);
        avaliacao4.adicionarAlunoENota(aluno4, 8.3);
        avaliacao4.adicionarAlunoENota(aluno5, 6.5);

        avaliacao5.adicionarAlunoENota(aluno1, 8.9);
        avaliacao5.adicionarAlunoENota(aluno2, 9.5);
        avaliacao5.adicionarAlunoENota(aluno3, 1.0);
        avaliacao5.adicionarAlunoENota(aluno4, 6.0);
        avaliacao5.adicionarAlunoENota(aluno5, 5.0);

        avaliacao6.adicionarAlunoENota(aluno1, 3.0);
        avaliacao6.adicionarAlunoENota(aluno2, 8.3);
        avaliacao6.adicionarAlunoENota(aluno3, 6.9);
        avaliacao6.adicionarAlunoENota(aluno4, 9.5);
        avaliacao6.adicionarAlunoENota(aluno5, 10.0);

        disciplina2.avaliarAlunos();

        System.out.println(disciplina1);
        System.out.println(disciplina2);
    }
}
