package main.java.br.com.pctmoraes.mobydick;

public class Jubarte extends Baleia{
    private Boolean possuiBarbatana;
    private String particularidade;
    public Jubarte(String nome, String classe, String porte, String cor) {
        super(nome, classe, porte, cor);
        this.possuiBarbatana = true;
        this.particularidade = "É a mais brincalhona e feliz de todas as baleias, formando mais da alegre espuma e espalhando mais água que qualquer outra.";
    }

    public Boolean getPossuiBarbatana() {
        return possuiBarbatana;
    }

    public String getParticularidade() {
        return particularidade;
    }
}
