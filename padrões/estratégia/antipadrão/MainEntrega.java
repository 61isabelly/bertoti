public class MainEntrega {
    public static void main(String[] args) {
        new EntregaPadrao("PED123");
        RetiradaPontoDeColeta entregaColeta = new RetiradaPontoDeColeta("COL456");

        entregaColeta.agendarRetirada();

    }
}
