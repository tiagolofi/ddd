
public final class Adapter implements Port {

    @Override
    public void aplicaPoliticaX(Entidade entidade) {
        System.out.println("Política X Aplicada para: " + entidade.getNome());
    }

}
