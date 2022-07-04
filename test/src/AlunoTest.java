import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AlunoTest {
    @Test
    public void adicionaSituacaoFinalTest(){
        Aluno aluno = new Aluno("Vinicius");
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);
        List<Nota> listaDeNota = new ArrayList<>();
        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);
        Avaliacao avaliacao = new Prova(4, disciplina);
        Nota nota = new Nota(aluno, avaliacao, 7.0);
        listaDeNota.add(nota);
        SituacaoFinal situacaoFinal = new SituacaoFinal(listaDeNota, 7.0, "Aprovado");
        aluno.adicionaSituacaoFinal(situacaoFinal);
        assertEquals(situacaoFinal, aluno.getListaSituacaoFinal().get(0));
    }

    @Test
    public void adicionaNotaTest(){
        Aluno aluno = new Aluno("Vinicius");
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno);
        Disciplina disciplina = new Disciplina("Teste", 7.0, lista);
        Avaliacao avaliacao = new Prova(4, disciplina);
        Nota nota = new Nota(aluno, avaliacao, 7.0);
        aluno.adicionaNota(nota);
        assertEquals(nota, aluno.getListaDeNotas().get(0));
    }

    @Test
    public void equalsTest1(){
        Aluno aluno1 = new Aluno("Vinicius");
        Aluno aluno2 = new Aluno("Mirella");
        assertNotEquals(aluno1, aluno2);
    }

    @Test
    public void equalsTest2(){
        Aluno aluno1 = new Aluno("Vinicius");
        Aluno aluno2 = aluno1;
        assertEquals(aluno1, aluno2);
    }
}
