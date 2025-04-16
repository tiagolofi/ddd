package domain;

public class Entidade {
    private String politica;
    private int valor;

    public void setPolitica(String politica) {
        this.politica = politica;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public String getPolitica() {
        return this.politica;
    }
}
