package main.java.br.com.pctmoraes.mobydick;

public class NavioBaleeiro {
    private String nome;
    private String estado;
    private String tamanho;
    private String corDoCasco;
    private String estadoConves;

    public NavioBaleeiro(String nome, String estado, String tamanho, String corDoCasco, String estadoConves) {
        this.nome = nome;
        this.estado = estado;
        this.tamanho = tamanho;
        this.corDoCasco = corDoCasco;
        this.estadoConves = estadoConves;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCorDoCasco() {
        return corDoCasco;
    }

    public String getEstadoConves() {
        return estadoConves;
    }
}
