package domain;

public class Negocio {

    private Port port;

    public Negocio (Port port) {
        this.port = port;
    }

    public void fluxoNegocialQueAplicaPolitica(Entidade entidade) {
        this.port.aplicaPolitica(entidade);
    }

}
