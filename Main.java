
class Main {
    public static void main(String[] args) {

        Port port = new Adapter(); // Implementação concreta

        Negocio negocio = new Negocio(port); // Injeção de dependência

        Entidade entidade = new Entidade("entidade1"); // Dados da entidade
         
        negocio.fluxoNegocialQueAplicaPoliticaX(entidade); // Aplicação do política/Execução do negócio
    }
}
