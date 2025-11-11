public class Elenco {
    public static void main(String[] args) {
        Time defesa = new Time("Defesa");
        defesa.addJogador(new Jogador("Rogério Ceni", "Goleiro"));
        defesa.addJogador(new Jogador("Lugano", "Zagueiro"));
        defesa.addJogador(new Jogador("Miranda", "Zagueiro"));

        Time meio = new Time("Meio-campo");
        meio.addJogador(new Jogador("Hernanes", "Meio-campo"));
        meio.addJogador(new Jogador("Kaká", "Meio-campo"));

        Time ataque = new Time("Ataque");
        ataque.addJogador(new Jogador("Luís Fabiano", "Atacante"));

        Time spfc = new Time("São Paulo FC");
        spfc.addSetor(defesa);
        spfc.addSetor(meio);
        spfc.addSetor(ataque);

        spfc.mostrar();
    }
}
