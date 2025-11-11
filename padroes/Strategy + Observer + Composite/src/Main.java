public class Main {
    public static void main(String[] args) {
        AgenciaNoticias agencia = new AgenciaNoticias();
        agencia.adicionarObservador(new AppMobile("luiz"));
        agencia.adicionarObservador(new SiteNoticias("esporte360.com"));

        Time timePrincipal = new Time("Tigers FC", new ContratacaoPorTeto(1_000_000));

        Time ataque = new Time("Ataque", new ContratacaoSemRestricao());
        Time defesa = new Time("Defesa", new ContratacaoSemRestricao());
        timePrincipal.adicionar(ataque);
        timePrincipal.adicionar(defesa);

        Jogador j1 = new Jogador("Camisa 9", 900_000);
        Jogador j2 = new Jogador("Camisa 10", 200_000);
        Jogador zagueiro = new Jogador("Zagueiro", 120_000);

        boolean ok1 = timePrincipal.contratar(j1, agencia);
        System.out.println("Contratar Camisa 9: " + ok1);

        boolean ok2 = timePrincipal.contratar(j2, agencia);
        System.out.println("Contratar Camisa 10: " + ok2);

        boolean ok3 = defesa.contratar(zagueiro, agencia);
        System.out.println("Contratar Zagueiro (Defesa): " + ok3);

        System.out.println("\n== ELENCO ATUAL ==");
        timePrincipal.imprimir("");

        System.out.println("\nCusto total Tigers FC: R$ " + timePrincipal.getCusto());

        System.out.println("\nTrocando estratégia para 'Sem Restrição'...");
        timePrincipal.setEstrategia(new ContratacaoSemRestricao());
        boolean ok4 = timePrincipal.contratar(j2, agencia);
        System.out.println("Contratar Camisa 10 (após troca): " + ok4);

        System.out.println("\n== ELENCO FINAL ==");
        timePrincipal.imprimir("");
        System.out.println("\nCusto total Tigers FC: R$ " + timePrincipal.getCusto());
    }
}
