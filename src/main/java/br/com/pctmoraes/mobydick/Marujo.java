package main.java.br.com.pctmoraes.mobydick;

import java.util.Locale;

public class Marujo extends Pessoa {
    private int hierarquia;

    public Marujo(String nome, String funcao) {
        super(nome, funcao);
        if(funcao.toUpperCase().equals("MARUJO")){
            this.hierarquia = 3;
        }
    }

    public int getHierarquia() {
        return hierarquia;
    }

    public void remar(){
        System.out.println("Aaahh!!! com certeza minha espinha partirá - pensou "+this.getNome());
    }
}
