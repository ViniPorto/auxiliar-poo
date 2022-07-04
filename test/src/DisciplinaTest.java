import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DisciplinaTest {
    @Test
    public void getNotaFinalTest(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        Avaliacao avaliacao1 = new Trabalho(2, disciplina);
        Avaliacao avaliacao2 = new Trabalho(2, disciplina);
        Avaliacao avaliacao3 = new Prova(6, disciplina);

        avaliacao1.adicionarAlunoENota(aluno, 8.0);
        avaliacao2.adicionarAlunoENota(aluno, 9.0);
        avaliacao3.adicionarAlunoENota(aluno, 7.0);

        assertTrue(disciplina.getNotaFinal(aluno) == 7.6);
    }

    @Test
    public void situacaoFinalTest1(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        assertEquals(disciplina.situacaoAluno(8.0), "Aprovado");
    }

    @Test
    public void situacaoFinalTest2(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        assertEquals(disciplina.situacaoAluno(6.0), "Reprovado");
    }

    @Test
    public void avaliarAlunosTest1(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        Avaliacao avaliacao1 = new Trabalho(2, disciplina);
        Avaliacao avaliacao2 = new Trabalho(2, disciplina);
        Avaliacao avaliacao3 = new Prova(6, disciplina);

        avaliacao1.adicionarAlunoENota(aluno, 8.0);
        avaliacao2.adicionarAlunoENota(aluno, 9.0);
        avaliacao3.adicionarAlunoENota(aluno, 7.0);

        disciplina.avaliarAlunos();

        assertFalse(aluno.getListaSituacaoFinal().isEmpty());
    }

    @Test
    public void avaliarAlunosTest2(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        Avaliacao avaliacao1 = new Trabalho(2, disciplina);
        Avaliacao avaliacao2 = new Trabalho(2, disciplina);
        Avaliacao avaliacao3 = new Prova(6, disciplina);

        avaliacao1.adicionarAlunoENota(aluno, 8.0);
        avaliacao2.adicionarAlunoENota(aluno, 9.0);
        avaliacao3.adicionarAlunoENota(aluno, 7.0);

        disciplina.avaliarAlunos();

        assertFalse(disciplina.getListaBoletim().isEmpty());
    }

    @Test
    public void avaliarAlunosTest3(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        Avaliacao avaliacao1 = new Trabalho(2, disciplina);
        Avaliacao avaliacao2 = new Trabalho(2, disciplina);
        Avaliacao avaliacao3 = new Prova(6, disciplina);

        avaliacao1.adicionarAlunoENota(aluno, 8.0);
        avaliacao2.adicionarAlunoENota(aluno, 9.0);
        avaliacao3.adicionarAlunoENota(aluno, 7.0);

        assertTrue(aluno.getListaSituacaoFinal().isEmpty());
    }

    @Test
    public void avaliarAlunosTest4(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        Avaliacao avaliacao1 = new Trabalho(2, disciplina);
        Avaliacao avaliacao2 = new Trabalho(2, disciplina);
        Avaliacao avaliacao3 = new Prova(6, disciplina);

        avaliacao1.adicionarAlunoENota(aluno, 8.0);
        avaliacao2.adicionarAlunoENota(aluno, 9.0);
        avaliacao3.adicionarAlunoENota(aluno, 7.0);

        assertTrue(disciplina.getListaBoletim().isEmpty());
    }

    @Test
    public void getSituacaoFinalPeloAluno(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);

        Avaliacao avaliacao1 = new Trabalho(2, disciplina);
        Avaliacao avaliacao2 = new Trabalho(2, disciplina);
        Avaliacao avaliacao3 = new Prova(6, disciplina);

        avaliacao1.adicionarAlunoENota(aluno, 8.0);
        avaliacao2.adicionarAlunoENota(aluno, 9.0);
        avaliacao3.adicionarAlunoENota(aluno, 7.0);

        disciplina.avaliarAlunos();

        assertEquals(disciplina.getSituacaoFinalPeloAluno(aluno).getSituacao(), "Aprovado");
    }

    @Test
    public void equalsTest1(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina1 = new Disciplina("Teste1", 7.0, lista);
        Disciplina disciplina2 = new Disciplina("Teste2", 7.0, lista);

        assertNotEquals(disciplina1, disciplina2);
    }

    @Test
    public void equalsTest2(){
        Aluno aluno = new Aluno("Vinicius");

        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);

        Disciplina disciplina1 = new Disciplina("Teste1", 7.0, lista);
        Disciplina disciplina2 = disciplina1;

        assertEquals(disciplina1, disciplina2);
    }
}
