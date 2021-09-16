public class Mensagem {

    public String aprovadoEtapa1(){
        return "Você está apto(a) para a Etapa 2";
    }

    public String reprovado(){
        return "Não é possível doar sangue \nMotivo(s):\n";
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

    public String aprovadoEtapa2(){
        return "Por favor, aguarde na fila para doação";
    }

    public String doadorEstaComFebre(){
        return "---ESTA COM FEBRE\n";
    }

    public String doadoraEstaGravida(){
        return "---ESTA GRAVIDA\n";
    }

    public String doadoraEstaAmamentando(){
        return "---ESTA AMAMENTANDO\n";
    }


}