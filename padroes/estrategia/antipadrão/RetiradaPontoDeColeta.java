package padroes.estrategia.antipadrão;
public class RetiradaPontoDeColeta extends Entrega implements Agendavel {
    public RetiradaPontoDeColeta(String numeroRastreio) {
        super(numeroRastreio);
    }

    @Override
    public void agendarRetirada() {
        System.out.println("Agendando retirada no ponto de coleta para o pedido " + numeroRastreio);
    }
}
