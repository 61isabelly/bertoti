public class SiteNoticias implements ObservadorNoticia {
    private final String dominio;

    public SiteNoticias(String dominio) { this.dominio = dominio; }

    @Override
    public void atualizar(Manchete manchete) {
        System.out.println("[Site " + dominio + "] " + manchete.getTitulo() + " | " + manchete.getCorpo());
    }
}
