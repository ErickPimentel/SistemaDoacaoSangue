public class Doador {
    private String nome;
    private int idade;
    private double peso;
    private char sexo;
    private boolean estaComFebre;
    private boolean jaDoouSangue;

    private boolean estaGravida;
    private boolean estaAmamentando;
    private boolean partoMenosDe12Meses;

    //se for MACHO
    public Doador(String nome, int idade, double peso, char sexo, boolean estaComFebre, boolean jaDoouSangue) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;

        if (this.sexo == 'F'){
            throw new RuntimeException("FEMEAS DEVEM PREENCHER OS CAMPOS: estaGravida, estaAmamentando, partoMenosDe12Meses");
        }

        this.estaComFebre = estaComFebre;
        this.jaDoouSangue = jaDoouSangue;

        this.estaGravida = false;
        this.estaAmamentando = false;
        this.partoMenosDe12Meses = false;
    }

    //se for FEMEA
    public Doador(String nome, int idade, double peso, char sexo, boolean estaComFebre, boolean jaDoouSangue, boolean estaGravida, boolean estaAmamentando, boolean partoMenosDe12Meses) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.estaComFebre = estaComFebre;
        this.jaDoouSangue = jaDoouSangue;
        this.estaGravida = estaGravida;
        this.estaAmamentando = estaAmamentando;
        this.partoMenosDe12Meses = partoMenosDe12Meses;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isEstaComFebre() {
        return estaComFebre;
    }

    public void setEstaComFebre(boolean estaComFebre) {
        this.estaComFebre = estaComFebre;
    }

    public boolean isJaDoouSangue() {
        return jaDoouSangue;
    }

    public void setJaDoouSangue(boolean jaDoouSangue) {
        this.jaDoouSangue = jaDoouSangue;
    }

    public boolean isEstaGravida() {
        return estaGravida;
    }

    public void setEstaGravida(boolean estaGravida) {
        this.estaGravida = estaGravida;
    }

    public boolean isEstaAmamentando() {
        return estaAmamentando;
    }

    public void setEstaAmamentando(boolean estaAmamentando) {
        this.estaAmamentando = estaAmamentando;
    }

    public boolean isPartoMenosDe12Meses() {
        return partoMenosDe12Meses;
    }

    public void setPartoMenosDe12Meses(boolean partoMenosDe12Meses) {
        this.partoMenosDe12Meses = partoMenosDe12Meses;
    }
}