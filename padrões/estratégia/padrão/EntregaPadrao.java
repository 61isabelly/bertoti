package padrões.estratégia.padrão;

public class EntregaPadrao implements ComportamentoEntrega {
    @Override
    public void processarEntrega(String numeroRastreio) {
        System.out.println("Entrega padrão enviada diretamente ao endereço para o pedido " + numeroRastreio);
    }
}
