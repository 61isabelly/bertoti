public abstract class Entrega {
    protected String numeroRastreio;

    public Entrega(String numeroRastreio) {
        this.numeroRastreio = numeroRastreio;
    }

    public void rastrearLocalizacao() {
        System.out.println("Rastreando a localização do pedido " + numeroRastreio);
    }
}
