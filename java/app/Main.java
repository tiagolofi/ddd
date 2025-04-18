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

        negocio.fluxoNegocialQueAplicaPolitica(entidade); // Aplicação do política/Execução do negócio
    
        System.out.println(entidade.toString()); // Log da entidade após a aplicação da política
    }
}
