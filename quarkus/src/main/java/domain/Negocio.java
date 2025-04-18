package domain;

import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Negocio {

    @Inject
    Logger log;

    @Inject
    Port port;

    public void fluxoNegocialQueAplicaPolitica(Entidade entidade) {
        port.aplicaPolitica(entidade);
    }

}
