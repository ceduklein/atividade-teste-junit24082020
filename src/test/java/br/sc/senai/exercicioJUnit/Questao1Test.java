package br.sc.senai.exercicioJUnit;

import bc.sc.senai.exercicioJUnit.Questao1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;


public class Questao1Test {

    @Test
    public void verificarInapta() {
        String resultadoEsperado = "Inapta";
        String resultadoReal = "";
        Questao1 cobranca = new Questao1();
        resultadoReal = cobranca.verificarClassificação(Calendar.getInstance().get(Calendar.YEAR) - 6);
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade1() {
        String resultadoEsperado = "Prioridade 1";
        String resultadoReal = "";
        Questao1 cobranca = new Questao1();
        resultadoReal = cobranca.verificarClassificação(Calendar.getInstance().get(Calendar.YEAR) - 5);
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade2A() {
        String resultadoEsperado = "Prioridade 2";
        String resultadoReal = "";
        Questao1 cobranca = new Questao1();
        resultadoReal = cobranca.verificarClassificação(Calendar.getInstance().get(Calendar.YEAR) - 4);
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade2B() {
        String resultadoEsperado = "Prioridade 2";
        String resultadoReal = "";
        Questao1 cobranca = new Questao1();
        resultadoReal = cobranca.verificarClassificação(Calendar.getInstance().get(Calendar.YEAR) - 3);
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade3A() {
        String resultadoEsperado = "Prioridade 3";
        String resultadoReal = "";
        Questao1 cobranca = new Questao1();
        resultadoReal = cobranca.verificarClassificação(Calendar.getInstance().get(Calendar.YEAR) - 2);
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade3B() {
        String resultadoEsperado = "Prioridade 3";
        String resultadoReal = "";
        Questao1 cobranca = new Questao1();
        resultadoReal = cobranca.verificarClassificação(Calendar.getInstance().get(Calendar.YEAR) - 1);
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarNãoCobrarAgora() {
        String resultadoEsperado = "Não cobrar agora";
        String resultadoReal = "";
        Questao1 cobranca = new Questao1();
        resultadoReal = cobranca.verificarClassificação(Calendar.getInstance().get(Calendar.YEAR));
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }
}