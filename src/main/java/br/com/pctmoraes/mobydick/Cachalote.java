package main.java.br.com.pctmoraes.mobydick;

public class Cachalote extends Baleia{
    private Boolean possuiBarbatana;
    private String particularidade;
    public Cachalote(String nome, String classe, String porte, String cor) {
        super(nome, classe, porte, cor);
        this.possuiBarbatana = false;
        this.particularidade = "É o maior habitante do globo; a baleia mais formidável de se encontrar; a de aspecto mais majestoso.";
    }

    public Boolean getPossuiBarbatana() {
        return possuiBarbatana;
    }

    public String getParticularidade() {
        return particularidade;
    }
}
