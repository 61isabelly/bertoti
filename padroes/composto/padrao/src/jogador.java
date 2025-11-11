class Jogador implements MembroTime {
    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    @Override
    public void mostrar() {
        System.out.println(posicao + ": " + nome);
    }

    public String getPosicao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPosicao'");
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}
