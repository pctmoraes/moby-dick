package main.java.br.com.pctmoraes.mobydick;

import java.util.Locale;

public class Arpoador extends Pessoa{
    private int hierarquia;
    public Arpoador(String nome, String funcao) {
        super(nome, funcao);
        if(funcao.toUpperCase(Locale.ROOT) == "ARPOADOR"){
            this.hierarquia = 3;
        }
    }

    public int getHierarquia() {
        return hierarquia;
    }
}
