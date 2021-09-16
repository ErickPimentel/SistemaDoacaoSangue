public class Mensagem {

    public String aprovadoEtapa1(){
        return "Você está apto(a) para a Etapa 2";
    }

    public String reprovadoEtapa1(){
        return "Não é possível doar sangue \n Motivo(s):\n";
    }

    public String naoPossuiIdadeNecessaria(){
        return "---NÃO POSSUI IDADE NECESSARIA\n";
    }

    public String entre61e69eNuncaDoou(){
        return "---ESTA ENTRE 60 E 69, MAS NUNCA DOOU SANGUE\n";
    }

    public String naoPossuiPesoMinimoNecessario(){
        return "---NAO POSSUI PESO MINIMO NECESSARIO\n";
    }


}