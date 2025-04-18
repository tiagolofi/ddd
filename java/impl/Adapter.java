package impl;

import java.util.logging.Logger;

import domain.Entidade;
import domain.Port;

public final class Adapter implements Port {

    private static final String POLITICA = "p1";
    private final Logger log = Logger.getLogger(Adapter.class.getName());

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
