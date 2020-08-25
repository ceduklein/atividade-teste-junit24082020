package bc.sc.senai.exercicioJUnit;

import java.util.Calendar;

public class Questao1 {

    public String verificarClassificação(int ano) {
        String classificacao = "";
        Integer anoCorrente = Calendar.getInstance().get(Calendar.YEAR);

        if((anoCorrente - ano) > 5) {
            classificacao =  "Inapta";

        } else if ((anoCorrente - ano) == 5) {
            classificacao = "Prioridade 1";

        } else if ((anoCorrente - ano) == 4 || (anoCorrente - ano) == 3) {
            classificacao = "Prioridade 2";

        } else if ((anoCorrente - ano) == 2 || (anoCorrente - ano) == 1) {
            classificacao = "Prioridade 3";
        } else {
            classificacao = "Não cobrar agora";
        }
        return classificacao;
    }
}
