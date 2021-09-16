import org.junit.Test;

import static org.junit.Assert.*;

public class TesteDoador {

    //1 - FIXTURE e 2 - Criacao do objeto
    Doador d1 = new Doador("Erick Spinelli Pimentel", 21, 86.5, 'M', false, false);
    Doador d2 = new Doador("Isaque Gabryel Brasileiro de Melo", 21, 70.2, 'M', false, true);
    Doador d3 = new Doador("Eduardo Bruno de Almeida Donato", 23, 75.4, 'M', true, false);

    Doador d4 = new Doador("Maria Clara Costa e Silva", 20, 60.7, 'F', false, false, false, false, false);

    Doador d5 = new Doador("Fernanda Pereira Calixto", 30, 90.7, 'F', false, false, true, false, false);

    Doador d6 = new Doador("Alice Ferreira", 28, 102.7, 'F', false, false, true, true, false);

    Doador d7 = new Doador("Sophia Miller", 24, 55.2, 'F', false, false, false, true, false);

    Doador d8 = new Doador("Izabel Duarte", 34, 55.2, 'F', false, false, false, false, true);

    @Test
    public void testarNome(){
        //3 - Asserts
        assertEquals(d1.getNome(), "Erick Spinelli Pimentel");
        assertNotEquals(d1.getNome(), "erick spinelli pimentel");
        assertNotEquals(d1.getNome(), "Erik Spinelli Pimentel");
        assertNotEquals(d1.getNome(), "Eric Spinelli Pimentel");

        assertEquals(d2.getNome(), "Isaque Gabryel Brasileiro de Melo");
        assertNotEquals(d2.getNome(), "isaque gabryel brasileiro de melo");
        assertNotEquals(d2.getNome(), "isaac gabryel brasileiro de melo");
        assertNotEquals(d2.getNome(), "izack gabryel brasileiro de melo");

        assertEquals(d3.getNome(), "Eduardo Bruno de Almeida Donato");
        assertNotEquals(d3.getNome(), "eduardo bruno de almeida donato");
        assertNotEquals(d3.getNome(), "Eduard Bruno de Almeida Donato");
        assertNotEquals(d3.getNome(), "Edu Bruno de Almeida Donato");
    }

    @Test
    public void testarIdade(){

        //3 - Asserts
        assertEquals(d1.getIdade(), 21);
        assertNotEquals(d1.getIdade(), 22);
        assertNotEquals(d1.getIdade(), 23);

        assertEquals(d2.getIdade(), 21);
        assertNotEquals(d2.getIdade(), 22);
        assertNotEquals(d2.getIdade(), 23);

        assertEquals(d3.getIdade(), 23);
        assertNotEquals(d3.getIdade(), 21);
        assertNotEquals(d3.getIdade(), 22);


    }

    @Test
    public void testarPeso(){
        double delta = 0.00;

        assertEquals(d1.getPeso(), 86.5, delta);
        assertNotEquals(d1.getPeso(), 86.4, delta);
        assertNotEquals(d1.getPeso(), 86.6, delta);
        assertNotEquals(d1.getPeso(), 86.49, delta);
        assertNotEquals(d1.getPeso(), 86.51, delta);

        assertEquals(d2.getPeso(), 70.2, delta);
        assertNotEquals(d2.getPeso(), 70.1, delta);
        assertNotEquals(d2.getPeso(), 70.3, delta);
        assertNotEquals(d2.getPeso(), 70.19, delta);
        assertNotEquals(d2.getPeso(), 70.21, delta);

        assertEquals(d3.getPeso(), 75.4, delta);
        assertNotEquals(d3.getPeso(), 75.3, delta);
        assertNotEquals(d3.getPeso(), 75.5, delta);
        assertNotEquals(d3.getPeso(), 75.39, delta);
        assertNotEquals(d3.getPeso(), 75.41, delta);

    }

    @Test
    public void testarSexo(){
        assertEquals(d1.getSexo(), 'M');
        assertNotEquals(d1.getSexo(), 'F');

        assertEquals(d2.getSexo(), 'M');
        assertNotEquals(d2.getSexo(), 'F');

        assertEquals(d3.getSexo(), 'M');
        assertNotEquals(d3.getSexo(), 'F');

        assertEquals(d4.getSexo(), 'F');
        assertNotEquals(d4.getSexo(), 'M');

        assertEquals(d5.getSexo(), 'F');
        assertNotEquals(d5.getSexo(), 'M');

        assertEquals(d6.getSexo(), 'F');
        assertNotEquals(d6.getSexo(), 'M');

        assertEquals(d7.getSexo(), 'F');
        assertNotEquals(d7.getSexo(), 'M');

        assertEquals(d8.getSexo(), 'F');
        assertNotEquals(d8.getSexo(), 'M');
    }

    @Test
    public void testarEstaComFebre(){
        assertFalse(d1.isEstaComFebre());
        assertFalse(d2.isEstaComFebre());
        assertTrue(d3.isEstaComFebre());
        assertFalse(d4.isEstaComFebre());
        assertFalse(d5.isEstaComFebre());
        assertFalse(d6.isEstaComFebre());
        assertFalse(d7.isEstaComFebre());
        assertFalse(d8.isEstaComFebre());
    }

    @Test
    public void testarJaDoouSangue(){
        assertFalse(d1.isJaDoouSangue());
        assertTrue(d2.isJaDoouSangue());
        assertFalse(d3.isJaDoouSangue());
        assertFalse(d4.isJaDoouSangue());
        assertFalse(d5.isJaDoouSangue());
        assertFalse(d6.isJaDoouSangue());
        assertFalse(d7.isJaDoouSangue());
        assertFalse(d8.isJaDoouSangue());
    }

    @Test
    public void testarEstaGravida(){

        assertFalse(d1.isEstaGravida());
        assertFalse(d2.isEstaGravida());
        assertFalse(d2.isEstaGravida());

        assertFalse(d4.isEstaGravida());
        assertTrue(d5.isEstaGravida());
        assertTrue(d6.isEstaGravida());
        assertFalse(d7.isEstaGravida());
        assertFalse(d8.isEstaGravida());
    }

    @Test
    public void testarEstaAmamentando(){

        assertFalse(d1.isEstaAmamentando());
        assertFalse(d2.isEstaAmamentando());
        assertFalse(d2.isEstaAmamentando());

        assertFalse(d4.isEstaAmamentando());
        assertFalse(d5.isEstaAmamentando());
        assertTrue(d6.isEstaAmamentando());
        assertTrue(d7.isEstaAmamentando());
        assertFalse(d8.isEstaAmamentando());
    }

    @Test
    public void testarPartoMenos12Meses(){

        assertFalse(d1.isPartoMenosDe12Meses());
        assertFalse(d2.isPartoMenosDe12Meses());
        assertFalse(d2.isPartoMenosDe12Meses());

        assertFalse(d4.isPartoMenosDe12Meses());
        assertFalse(d5.isPartoMenosDe12Meses());
        assertFalse(d6.isPartoMenosDe12Meses());
        assertFalse(d7.isPartoMenosDe12Meses());
        assertTrue(d8.isPartoMenosDe12Meses());
    }

    @Test
    public void testarTriagemEtapa1(){

        //Idade (Limite inferior)
        Doador d09 = new Doador("a", 15, 70, 'M', false, false);
        Doador d10 = new Doador("a", 16, 70, 'M', false, false);
        Doador d11 = new Doador("a", 17, 70, 'M', false, false);

        //Idade (Limite Superior)
        Doador d12 = new Doador("a", 60, 70, 'M', false, false);
        Doador d13 = new Doador("a", 61, 70, 'M', false, false);
        Doador d14 = new Doador("a", 62, 70, 'M', false, true);
        Doador d15 = new Doador("a", 69, 70, 'M', false, false);
        Doador d16 = new Doador("a", 70, 70, 'M', false, false);
        Doador d17 = new Doador("a", 71, 70, 'M', false, false);


        //Peso M (Limite Inferior)
        Doador d18 = new Doador("a", 20, 58, 'M', false, false);
        Doador d19 = new Doador("a", 20, 59, 'M', false, false);
        Doador d20 = new Doador("a", 20, 60, 'M', false, false);
        Doador d21 = new Doador("a", 20, 61, 'M', false, false);

        //Peso F (Limite Inferior)
        Doador d22 = new Doador("a", 20, 48, 'F', false, false,false, false, false);
        Doador d23 = new Doador("a", 20, 49, 'F', false, false,false, false, false);
        Doador d24 = new Doador("a", 20, 50, 'F', false, false,false, false, false);
        Doador d25 = new Doador("a", 20, 51, 'F', false, false,false, false, false);

        //Idade e peso fora da margem
        Doador d26 = new Doador("a", 10, 58, 'M', false, false);
        Doador d27 = new Doador("a", 12, 49, 'F', false, false,false, false, false);

        //entre 61 e 69 nunca doou e peso fora da margem
        Doador d28 = new Doador("a", 65, 58, 'M', false, false);
        Doador d29 = new Doador("a", 65, 49, 'F', false, false,false, false, false);

        Triagem triagem = new Triagem();
        Mensagem m = new Mensagem();

        //System.out.println(triagem.etapa1(d29));

        //Idade (Limite inferior)
        assertEquals(triagem.etapa1(d09), m.reprovadoEtapa1() + m.naoPossuiIdadeNecessaria());
        assertEquals(triagem.etapa1(d10), m.aprovadoEtapa1());
        assertEquals(triagem.etapa1(d11), m.aprovadoEtapa1());

        //Idade (Limite Superior)
        assertEquals(triagem.etapa1(d12), m.aprovadoEtapa1());
        assertEquals(triagem.etapa1(d13), m.reprovadoEtapa1() + m.entre61e69eNuncaDoou());
        assertEquals(triagem.etapa1(d14), m.aprovadoEtapa1());
        assertEquals(triagem.etapa1(d15), m.reprovadoEtapa1() + m.entre61e69eNuncaDoou());
        assertEquals(triagem.etapa1(d16), m.reprovadoEtapa1() + m.naoPossuiIdadeNecessaria());
        assertEquals(triagem.etapa1(d17), m.reprovadoEtapa1() + m.naoPossuiIdadeNecessaria());
    }

}