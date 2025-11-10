package padroes.estrategia.padrao;

public class Entrega {
    private String numeroRastreio;
    private ComportamentoEntrega comportamento;

    public Entrega(String numeroRastreio, ComportamentoEntrega comportamento) {
        this.numeroRastreio = numeroRastreio;
        this.comportamento = comportamento;
    }

    public void rastrearLocalizacao() {
        System.out.println("Rastreando a localização do pedido " + numeroRastreio);
    }

    public void processar() {
        comportamento.processarEntrega(numeroRastreio);
    }

    public void setComportamento(ComportamentoEntrega comportamento) {
        this.comportamento = comportamento;
    }
}
