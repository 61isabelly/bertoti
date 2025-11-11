public class ContratacaoPorTeto implements ContratacaoStrategy {
    private final double teto;

    public ContratacaoPorTeto(double teto) {
        if (teto < 0) throw new IllegalArgumentException("Teto inválido");
        this.teto = teto;
    }

    @Override
    public boolean podeContratar(Time time, Jogador candidato) {
        double custoAtual = time.getCusto();
        return (custoAtual + candidato.getCusto()) <= teto;
    }

    public double getTeto() { return teto; }
}
