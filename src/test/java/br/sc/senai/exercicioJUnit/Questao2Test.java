package br.sc.senai.exercicioJUnit;

import bc.sc.senai.exercicioJUnit.Questao2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class Questao2Test {

    @Test
    public void verificarInaptaA() {
        String resultadoEsperado = "Inapta";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 6,
                "inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarInaptaB() {
        String resultadoEsperado = "Inapta";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 5,
                "não inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarInaptaC() {
        String resultadoEsperado = "Inapta";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 5,
                "inscrita",
                999
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade1() {
        String resultadoEsperado = "Prioridade 1";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 5,
                "inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade2A() {
        String resultadoEsperado = "Prioridade 2";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 4,
                "inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade2B() {
        String resultadoEsperado = "Prioridade 2";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 3,
                "inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade3A() {
        String resultadoEsperado = "Prioridade 3";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 2,
                "inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarPrioridade3B() {
        String resultadoEsperado = "Prioridade 3";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR) - 1,
                "inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void verificarNaoCobrarAgora() {
        String resultadoEsperado = "Não cobrar agora";
        String resultadoReal = "";
        Questao2 cobranca = new Questao2();
        resultadoReal = cobranca.verificarClassificacaoDivida(
                Calendar.getInstance().get(Calendar.YEAR),
                "inscrita",
                1000
        );
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }
}
