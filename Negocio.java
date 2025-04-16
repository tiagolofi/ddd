public class Negocio {

    private Port port;

    public Negocio (Port port) {
        this.port = port;
    }

    public void fluxoNegocialQueAplicaPoliticaX(Entidade entidade) {
        System.out.println("Política será aplicada para: " + entidade.getNome());
        this.port.aplicaPoliticaX(entidade);
    }

}
