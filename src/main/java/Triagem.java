public class Triagem {

    public String etapa1(Doador doador){

        boolean idadeNecessaria = false;
        boolean entre61e69 = false;
        boolean pesoMinimo = false;

        String resultado = null;

        //logica
        idadeNecessaria = doador.getIdade() >= 16 && doador.getIdade() <= 60;

        entre61e69 = doador.getIdade() > 60 && doador.getIdade() <= 69;

        pesoMinimo = (doador.getPeso() >= 60) & (doador.getSexo() == 'M') || (doador.getPeso() >= 50 && doador.getSexo() == 'F');

        Mensagem m = new Mensagem();

        if ((idadeNecessaria || (entre61e69 && doador.isJaDoouSangue())) && pesoMinimo){
            resultado = m.aprovadoEtapa1();
        }else{

            resultado = m.reprovado();

            if (!idadeNecessaria && !entre61e69) resultado += m.naoPossuiIdadeNecessaria();

            if (entre61e69 && !doador.isJaDoouSangue()) resultado += m.entre61e69eNuncaDoou();

            if (!pesoMinimo) resultado += m.naoPossuiPesoMinimoNecessario();
        }

        return resultado;
    }

    public String etapa2(Doador doador){

        String resultado = null;
        Mensagem m = new Mensagem();
        if (etapa1(doador).equals(m.aprovadoEtapa1())){

            if(!doador.isEstaComFebre() && !doador.isEstaGravida() && !doador.isEstaAmamentando()){
                resultado = m.aprovadoEtapa2();
            }
            else{
                resultado = m.reprovado();

                if (doador.isEstaComFebre()) resultado += m.doadorEstaComFebre();

                if (doador.isEstaGravida()) resultado += m.doadoraEstaGravida();

                if (doador.isEstaAmamentando()) resultado += m.doadoraEstaAmamentando();
            }
        }

        return resultado;
    }

}