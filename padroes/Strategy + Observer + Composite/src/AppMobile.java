public class AppMobile implements ObservadorNoticia {
    private final String usuario;

    public AppMobile(String usuario) { this.usuario = usuario; }

    @Override
    public void atualizar(Manchete manchete) {
        System.out.println("[AppMobile@" + usuario + "] " + manchete.getTitulo() + " -> " + manchete.getCorpo());
    }
}
