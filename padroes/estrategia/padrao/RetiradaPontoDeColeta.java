package padroes.estrategia.padrao;

public class RetiradaPontoDeColeta implements ComportamentoEntrega {
    @Override
    public void processarEntrega(String numeroRastreio) {
        System.out.println("Agendando retirada no ponto de coleta para o pedido " + numeroRastreio);
    }
}
