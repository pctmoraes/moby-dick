package main.java.br.com.pctmoraes.mobydick;

public class DorsoDeBarbatana extends Baleia{
    private Boolean possuiBarbatana;
    private String particularidade;
    public DorsoDeBarbatana(String nome, String classe, String porte, String cor) {
        super(nome, classe, porte, cor);
        this.possuiBarbatana = true;
        this.particularidade = "Foi visto em quase todos os oceanos; é comumente a baleia cujo jato, a distância, foi tantas vezes descrito por passageiros pelo comprimento que alcança.";
    }

    public Boolean getPossuiBarbatana() {
        return possuiBarbatana;
    }

    public String getParticularidade() {
        return particularidade;
    }
}
