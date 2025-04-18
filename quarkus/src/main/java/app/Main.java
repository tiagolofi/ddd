package app;

import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

import org.jboss.logging.Logger;

import domain.Entidade;
import domain.Negocio;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Inject
        Negocio negocio; // Injeção de dependência + Inversão de Dependência

        @Inject
        Logger log;

        @Override
        public int run(String... args) throws Exception {

            Entidade entidade = new Entidade(); // Dados da entidade
            entidade.setPolitica("p1");

            negocio.fluxoNegocialQueAplicaPolitica(entidade); // Aplicação do política/Execução do negócio

            log.info(entidade.toString());

            Entidade entidade2 = new Entidade(); // Dados da entidade 2
            entidade2.setPolitica("p2");

            negocio.fluxoNegocialQueAplicaPolitica(entidade2);

            log.info(entidade2.toString());

            Quarkus.waitForExit();
            return 0;
        }
    }
}