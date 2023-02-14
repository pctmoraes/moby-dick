package main.java.br.com.pctmoraes.mobydick;

import java.util.Locale;

public class Apoador extends Pessoa{
    private int hierarquia;
    public Apoador(String nome, String funcao) {
        super(nome, funcao);
        if(funcao.toUpperCase(Locale.ROOT) == "ARPOADOR"){
            this.hierarquia = 3;
        }
    }

    public int getHierarquia() {
        return hierarquia;
    }
}
