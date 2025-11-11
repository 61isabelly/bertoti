import java.util.ArrayList;
import java.util.List;

class Time implements MembroTime {
    private String nomeTime;
    private List<MembroTime> membros = new ArrayList<>();

    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void add(MembroTime membro) {
        membros.add(membro);
    }

    @Override
    public void mostrar() {
        System.out.println("=== " + nomeTime + " ===");
        for (MembroTime m : membros) {
            m.mostrar();
        }
    }

    public void addSetor(Time defesa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSetor'");
    }

    public void addJogador(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addJogador'");
    }
}
