import java.util.ArrayList;
import java.util.List;

public class AgenciaNoticias {
    private final List<ObservadorNoticia> observers = new ArrayList<>();

    public void adicionarObservador(ObservadorNoticia o) {
        if (o != null) observers.add(o);
    }

    public void removerObservador(ObservadorNoticia o) {
        observers.remove(o);
    }

    public void publicarManchete(Manchete manchete) {
        for (ObservadorNoticia o : observers) {
            o.atualizar(manchete);
        }
    }
}
