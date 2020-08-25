package bc.sc.senai.exercicioJUnit;

import java.util.Calendar;

public class Questao2 {

    public String verificarClassificacaoDivida(Integer ano, String situacao, double valor) {
        String classificacao = "";
        Integer anoCorrente = Calendar.getInstance().get(Calendar.YEAR);

        if((anoCorrente - ano) > 5 || situacao != "inscrita" || valor < 1000) {
            classificacao = "Inapta";

        }else if((anoCorrente - ano) == 5 && situacao == "inscrita" && valor >= 1000) {
            classificacao = "Prioridade 1";

        }else if((anoCorrente - ano) == 4 || (anoCorrente - ano) == 3 && situacao == "inscrita" && valor >= 1000) {
            classificacao = "Prioridade 2";

        }else if((anoCorrente - ano) == 2 || (anoCorrente - ano) == 1 && situacao == "inscrita" && valor >= 1000) {
            classificacao = "Prioridade 3";

        } else {
            classificacao = "Não cobrar agora";
        }
        return classificacao;
    }
}
