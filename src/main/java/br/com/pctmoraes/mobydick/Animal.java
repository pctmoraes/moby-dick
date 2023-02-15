package main.java.br.com.pctmoraes.mobydick;

public abstract class Animal {
    private String nome;
    private String classe;
    private String porte;
    private String cor;

    public Animal(String nome, String classe, String porte, String cor) {
        this.nome = nome;
        this.classe = classe;
        this.porte = porte;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public String getClasse() {
        return classe;
    }

    public String getPorte() {
        return porte;
    }

    public String getCor() {
        return cor;
    }
}
