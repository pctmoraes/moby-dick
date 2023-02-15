package main.java.br.com.pctmoraes.mobydick;

public class Franca extends Baleia{
    private Boolean possuiBarbatana;
    private String particularidade;
    public Franca(String nome, String classe, String porte, String cor) {
        super(nome, classe, porte, cor);
        this.possuiBarbatana = true;
        this.particularidade = "Sob determinado aspecto este é o Leviatã mais venerável de todos, sendo o primeiro regularmente pescado pelo homem.";
    }

    public Boolean getPossuiBarbatana() {
        return possuiBarbatana;
    }

    public String getParticularidade() {
        return particularidade;
    }
}
