package padroes.estrategia.padrao;

public class EntregaRapida implements ComportamentoEntrega {
    @Override
    public void processarEntrega(String numeroRastreio) {
        System.out.println("Entrega rápida enviada com prioridade para o pedido " + numeroRastreio);
    }
}
