package domain;

import java.util.logging.Logger;

public class Negocio {

    private Port port;
    private final Logger log = Logger.getLogger(Negocio.class.getName());

    public Negocio (Port port) {
        this.port = port;
    }

    public void fluxoNegocialQueAplicaPolitica(Entidade entidade) {
        log.info("Política será aplicada para: " + entidade.getPolitica());
        this.port.aplicaPolitica(entidade);
    }

}
