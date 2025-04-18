package impl;

import org.jboss.logging.Logger;

import domain.Entidade;
import domain.Port;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public final class Adapter implements Port {

    @Inject
    Logger log;

    private static final String POLITICA = "p1";

    @Override
    public void aplicaPolitica(Entidade entidade) {
        if (entidade == null) {
            throw new IllegalArgumentException("Entidade não pode ser nula");
        }

        if (entidade.getPolitica() == null || entidade.getPolitica().isEmpty()) {
            throw new IllegalArgumentException("Política não pode ser nula ou vazia");
        }

        if (POLITICA.equals(entidade.getPolitica())) {
            entidade.setValor(1);
        } else {
            entidade.setValor(0);
        }

        log.info("Política " + entidade.getPolitica() + " aplicada com valor: " + entidade.getValor());
    }

}
