package main.java.br.com.pctmoraes.mobydick;

public abstract class Pessoa {
    private String nome;
    private String funcao;

    public Pessoa(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome(){
        return nome;
    }
    public String getFuncao() {
        return funcao;
    }
}
