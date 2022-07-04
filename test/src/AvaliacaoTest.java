import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AvaliacaoTest {
    @Test
    public void adicionarAlunoENotaTest1(){
        Aluno aluno = new Aluno("Vinicius");
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);
        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);
        Avaliacao avaliacao = new Prova(4, disciplina);
        avaliacao.adicionarAlunoENota(aluno, 7.0);
        assertFalse(avaliacao.getListaAlunosENotas().isEmpty());
    }

    @Test
    public void adicionarAlunoENotaTest2(){
        Aluno aluno = new Aluno("Vinicius");
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);
        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);
        Avaliacao avaliacao = new Prova(4, disciplina);
        avaliacao.adicionarAlunoENota(aluno, 7.0);
        assertEquals(avaliacao.getListaAlunosENotas().get(0).getAluno(), aluno);
    }

    @Test
    public void adicionarAlunoENotaTest3(){
        Aluno aluno = new Aluno("Vinicius");
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);
        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);
        Avaliacao avaliacao = new Prova(4, disciplina);
        avaliacao.adicionarAlunoENota(aluno, 7.0);
        assertEquals(avaliacao.getListaAlunosENotas().get(0).getAvaliacao(), avaliacao);
    }

    @Test
    public void adicionarAlunoENotaTest4(){
        Aluno aluno = new Aluno("Vinicius");
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);
        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);
        Avaliacao avaliacao = new Prova(4, disciplina);
        double notaAvaliacao = 7.0;
        avaliacao.adicionarAlunoENota(aluno, notaAvaliacao);
        assertTrue(avaliacao.getListaAlunosENotas().get(0).getNota() == 7.0);
    }
}
