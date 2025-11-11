public class Jogador implements MembroTime {
    private final String nome;
    private final double salario;

    public Jogador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getCusto() { return salario; }

    @Override
    public void imprimir(String prefixo) {
        System.out.println(prefixo + "- Jogador: " + nome + " (R$ " + salario + ")");
    }
}
