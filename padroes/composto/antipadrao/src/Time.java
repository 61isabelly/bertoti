import java.util.ArrayList;
import java.util.List;

class Time {
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();
    private List<Time> setores = new ArrayList<>();

    public Time(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void addSetor(Time setor) {
        setores.add(setor);
    }

    public void mostrar() {
        System.out.println("=== " + nome + " ===");

        for (Jogador j : jogadores) {
            System.out.println(j.getPosicao() + ": " + j.getNome());
        }

        for (Time t : setores) {
            t.mostrar();
        }
    }
}
