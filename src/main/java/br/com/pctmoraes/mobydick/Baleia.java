package main.java.br.com.pctmoraes.mobydick;

public abstract class Baleia extends Animal{
    private String posicaoCauda = "horizontal";
    public Baleia(String nome, String classe, String porte, String cor) {
        super(nome, classe, porte, cor);
    }

    public String soltarJatoDagua(){
        return("\n\t>=( 0 );;;;~¨¨¨¨~~;,...");
    }
}
