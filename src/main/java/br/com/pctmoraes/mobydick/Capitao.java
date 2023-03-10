package main.java.br.com.pctmoraes.mobydick;

import java.util.Locale;

public class Capitao extends Pessoa{
    private int hierarquia;
    public Capitao(String nome, String funcao) {
        super(nome, funcao);
        if(funcao.toUpperCase().equals("CAPITAO")){
            this.hierarquia = 0;
        }
    }

    public int getHierarquia() {
        return hierarquia;
    }

    public void darOrdem(String funcaoOrdenado, int hierarquiaOrdenado){
        if (this.hierarquia < hierarquiaOrdenado) {
            System.out.println(this.getNome() +": vá fazer alguma coisa, "+ funcaoOrdenado + "!");
        }
        else {
            System.out.println(this.getNome() +" pensou que gostaria de dar ordens ao "+ funcaoOrdenado + " no entanto, ele não tem poder para tal dentro da hierarquia de um navio baleeiro.");
        }
    }
}
