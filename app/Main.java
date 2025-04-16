package app;

import domain.Entidade;
import domain.Negocio;
import domain.Port;
import impl.Adapter;

class Main {
    public static void main(String[] args) {

        Port port = new Adapter(); // Implementação concreta

        Negocio negocio = new Negocio(port); // Injeção de dependência

        Entidade entidade = new Entidade(); // Dados da entidade
        entidade.setPolitica("p1");

        negocio.fluxoNegocialQueAplicaPoliticaX(entidade); // Aplicação do política/Execução do negócio
    }
}
