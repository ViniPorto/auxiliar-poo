import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class DisciplinaTest {
    /*

    Feito testes apenas para esta classe porque as demais possuem apenas métodos triviais como
    getters, setters e contrutores.
    Desta forma não criei um pacote para testes.

     */

    @Test
    public void testeAdicionarAluno1(){
        Disciplina disciplina = new Disciplina("Teste", 7.0);
        Aluno aluno1 = new Aluno("Vinicius");
        List<Avaliacao> listaAluno1 = new ArrayList<>();
        listaAluno1.add(new Trabalho(8, 2));
        listaAluno1.add(new Prova(9.5, 4));
        listaAluno1.add(new Prova(8, 4));

        disciplina.adicionarAluno(aluno1, listaAluno1); //testando este método

        Assert.assertEquals(disciplina.listaDeAlunos.get(aluno1), listaAluno1);
    }

    @Test
    public void testeAdicionarAluno2(){
        Disciplina disciplina = new Disciplina("Teste", 7.0);
        Aluno aluno1 = new Aluno("Mirella");
        List<Avaliacao> listaAluno1 = new ArrayList<>();
        listaAluno1.add(new Trabalho(10, 2));
        listaAluno1.add(new Prova(8.9, 4));
        listaAluno1.add(new Prova(8, 4));

        disciplina.adicionarAluno(aluno1, listaAluno1); //testando este método

        Assert.assertEquals(disciplina.listaDeAlunos.get(aluno1), listaAluno1);
    }

    @Test
    public void testeGetNotaFinal1(){
        /*
        Fórmula da média ponderada:
        Mp = [(N1 x P1) + (N2 x P2) + (N3 x P3) + ... (Nx x Px)] ÷ (P1 + P2 + P3 + ... Px)
         */

        List<Avaliacao> listaAvaliacoes = new ArrayList<>();
        listaAvaliacoes.add(new Trabalho(10, 2));
        listaAvaliacoes.add(new Prova(8.9, 4));
        listaAvaliacoes.add(new Prova(8, 4));

        Assert.assertTrue(Disciplina.getNotaFinal(listaAvaliacoes) == 8.76);
    }

    @Test
    public void testeGetNotaFinal2(){
        /*
        Fórmula da média ponderada:
        Mp = [(N1 x P1) + (N2 x P2) + (N3 x P3) + ... (Nx x Px)] ÷ (P1 + P2 + P3 + ... Px)
         */

        List<Avaliacao> listaAvaliacoes = new ArrayList<>();
        listaAvaliacoes.add(new Trabalho(7, 2));
        listaAvaliacoes.add(new Trabalho(8.3, 2));
        listaAvaliacoes.add(new Trabalho(9.7, 2));
        listaAvaliacoes.add(new Trabalho(7.5, 2));
        listaAvaliacoes.add(new Trabalho(8, 2));

        Assert.assertTrue(Disciplina.getNotaFinal(listaAvaliacoes) == 8.1);
    }

    @Test
    public void testeGetNotaFinal3(){
        /*
        Fórmula da média ponderada:
        Mp = [(N1 x P1) + (N2 x P2) + (N3 x P3) + ... (Nx x Px)] ÷ (P1 + P2 + P3 + ... Px)
         */

        List<Avaliacao> listaAvaliacoes = new ArrayList<>();
        listaAvaliacoes.add(new Trabalho(3, 2));
        listaAvaliacoes.add(new Trabalho(4.7, 2));
        listaAvaliacoes.add(new Trabalho(2.5, 2));
        listaAvaliacoes.add(new Prova(0.7, 4));

        Assert.assertTrue(Disciplina.getNotaFinal(listaAvaliacoes) == 2.32);
    }

    @Test
    public void testeSituacaoBoletim1(){
        //retorna "Aprovado" caso a nota informada seja maior OU igual, caso contrário informa "Reprovado"
        Disciplina disciplina = new Disciplina("Teste", 7.0);
        Assert.assertEquals(disciplina.situacaoBoletim(6.9), "Reprovado");
    }

    @Test
    public void testeSituacaoBoletim2(){
        //retorna "Aprovado" caso a nota informada seja maior OU igual, caso contrário informa "Reprovado"
        Disciplina disciplina = new Disciplina("Teste", 5.5);
        Assert.assertEquals(disciplina.situacaoBoletim(6.9), "Aprovado");
    }

    @Test
    public void testeSituacaoBoletim3(){
        //retorna "Aprovado" caso a nota informada seja maior OU igual, caso contrário informa "Reprovado"
        Disciplina disciplina = new Disciplina("Teste", 8.0);
        Assert.assertEquals(disciplina.situacaoBoletim(8.0), "Aprovado");
    }

    @Test
    public void testeToString(){
        //toString montado manualmente para os testes
        Disciplina disciplina = new Disciplina("Teste", 7.0);
        Aluno aluno1 = new Aluno("Mirella");
        List<Avaliacao> listaAluno1 = new ArrayList<>();
        listaAluno1.add(new Trabalho(10, 2));
        listaAluno1.add(new Prova(8.9, 4));
        listaAluno1.add(new Prova(8, 4));

        disciplina.adicionarAluno(aluno1, listaAluno1);

        Assert.assertEquals("Disciplina -> Teste\n" +
                "Nota de corte -> 7.0\n" +
                "\n" +
                "=-=-=-=-=-=-=-=-=-=-=-=\n" +
                "\n" +
                "Aluno -> Mirella\n" +
                "Notas:\n" +
                "\n" +
                "Avaliacao -> Trabalho\n" +
                "Nota -> 10.0\n" +
                "Peso -> 2\n" +
                "\n" +
                "Avaliacao -> Prova\n" +
                "Nota -> 8.9\n" +
                "Peso -> 4\n" +
                "\n" +
                "Avaliacao -> Prova\n" +
                "Nota -> 8.0\n" +
                "Peso -> 4\n" +
                "\n" +
                "Nota final: 8.76\n" +
                "Situacao: Aprovado\n" +
                "\n" +
                "=-=-=-=-=-=-=-=-=-=-=-=\n" +
                "\n", disciplina.toString());
    }
}
