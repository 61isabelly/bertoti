public class ElencoFutebol {
    public static void main(String[] args) {
        Jogador goleiro = new Jogador("Rogério Ceni", "Goleiro");
        Jogador zagueiro1 = new Jogador("Lugano", "Zagueiro");
        Jogador zagueiro2 = new Jogador("Miranda", "Zagueiro");
        Jogador meio1 = new Jogador("Hernanes", "Meio-campo");
        Jogador meio2 = new Jogador("Kaká", "Meio-campo");
        Jogador atacante = new Jogador("Luís Fabiano", "Atacante");

        Time defesa = new Time("Defesa");
        defesa.add(goleiro);
        defesa.add(zagueiro1);
        defesa.add(zagueiro2);

        Time meio = new Time("Meio-campo");
        meio.add(meio1);
        meio.add(meio2);

        Time ataque = new Time("Ataque");
        ataque.add(atacante);

        Time time = new Time("São Paulo FC");
        time.add(defesa);
        time.add(meio);
        time.add(ataque);

        time.mostrar();
    }
}