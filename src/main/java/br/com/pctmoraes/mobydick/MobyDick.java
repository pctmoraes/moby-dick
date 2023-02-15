package main.java.br.com.pctmoraes.mobydick;

public class MobyDick extends Cachalote{
    private Boolean possuiBarbatana;
    private String particularidade;
    public MobyDick(String nome, String classe, String porte, String cor) {
        super(nome, classe, porte, cor);
        this.possuiBarbatana = false;
        this.particularidade = "Terrível";
    }

    public Boolean getPossuiBarbatana() {
        return possuiBarbatana;
    }

    public String getParticularidade() {
        return particularidade;
    }
}
