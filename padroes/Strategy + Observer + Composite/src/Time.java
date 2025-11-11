import java.util.ArrayList;
import java.util.List;

public class Time implements MembroTime {
    private final String nome;
    private final List<MembroTime> membros = new ArrayList<>();
    private ContratacaoStrategy estrategia;

    public Time(String nome, ContratacaoStrategy estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    public void setEstrategia(ContratacaoStrategy nova) {
        if (nova == null) throw new IllegalArgumentException("Estratégia não pode ser nula");
        this.estrategia = nova;
    }

    public boolean adicionar(MembroTime membro) {
        return membros.add(membro);
    }

    public boolean remover(MembroTime membro) {
        return membros.remove(membro);
    }

    public boolean contratar(Jogador jogador, AgenciaNoticias agencia) {
        if (estrategia == null) throw new IllegalStateException("Estratégia de contratação não definida");
        boolean ok = estrategia.podeContratar(this, jogador);
        if (ok) {
            membros.add(jogador);
            if (agencia != null) {
                Manchete m = new Manchete(
                        "Contratação: " + jogador.getNome(),
                        "O time " + getNome() + " contratou " + jogador.getNome() + " por R$ " + jogador.getCusto()
                );
                agencia.publicarManchete(m);
            }
        }
        return ok;
    }

    public List<MembroTime> getMembros() {
        return new ArrayList<>(membros);
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getCusto() {
        return membros.stream().mapToDouble(MembroTime::getCusto).sum();
    }

    @Override
    public void imprimir(String prefixo) {
        System.out.println(prefixo + "+ Time: " + nome + " (custo total R$ " + getCusto() + ")");
        for (MembroTime m : membros) {
            m.imprimir(prefixo + "  ");
        }
    }
}
