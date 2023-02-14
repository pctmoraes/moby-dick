package main.java.br.com.pctmoraes.mobydick;

import java.util.Locale;

public class Capitao extends Pessoa{
    private int hierarquia;
    public Capitao(String nome, String funcao) {
        super(nome, funcao);
        if(funcao.toUpperCase(Locale.ROOT) == "CAPITAO"){
            this.hierarquia = 1;
        }
    }

    public int getHierarquia() {
        return hierarquia;
    }
}
