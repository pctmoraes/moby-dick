package main.java.br.com.pctmoraes.mobydick;

import java.util.Locale;

public class Imediato extends Pessoa{
    private int hierarquia;
    public Imediato(String nome, String funcao) {
        super(nome, funcao);
        if(funcao.toUpperCase(Locale.ROOT) == "IMEDIATO"){
            this.hierarquia = 2;
        }
    }

    public int getHierarquia() {
        return hierarquia;
    }
}
