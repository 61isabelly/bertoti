public class ContratacaoSemRestricao implements ContratacaoStrategy {
    @Override
    public boolean podeContratar(Time time, Jogador candidato) {
        return true;
    }
}
