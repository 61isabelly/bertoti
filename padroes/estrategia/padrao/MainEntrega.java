package padroes.estrategia.padrao;

public class MainEntrega {
    public static void main(String[] args) {
        Entrega entrega1 = new Entrega("PED123", new EntregaPadrao());
        Entrega entrega2 = new Entrega("RAP456", new EntregaRapida());
        Entrega entrega3 = new Entrega("COL789", new RetiradaPontoDeColeta());

        entrega1.processar();
        entrega2.processar();
        entrega3.processar();

        entrega1.setComportamento(new RetiradaPontoDeColeta());
        entrega1.processar();  
    }
}
