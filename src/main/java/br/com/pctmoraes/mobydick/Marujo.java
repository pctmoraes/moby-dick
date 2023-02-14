package main.java.br.com.pctmoraes.mobydick;

import java.util.Locale;

public class Marujo extends Pessoa {
    private int hierarquia;

    public Marujo(String nome, String funcao) {
        super(nome, funcao);
        if(funcao.toUpperCase(Locale.ROOT) == "MARUJO"){
            this.hierarquia = 0;
        }
    }

    public int getHierarquia() {
        return hierarquia;
    }
}
