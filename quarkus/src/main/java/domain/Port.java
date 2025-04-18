package domain;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface Port {
    void aplicaPolitica(Entidade entidade);
}
