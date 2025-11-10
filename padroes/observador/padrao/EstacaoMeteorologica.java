package padroes.observador.padrao;
import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {
    private List<ObservadorTemperatura> observadores = new ArrayList<>();
    private float temperatura;

    public void adicionar(ObservadorTemperatura o) {
        observadores.add(o);
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificar();
    }

    private void notificar() {
        for (ObservadorTemperatura o : observadores) {
            o.atualizar(temperatura);
        }
    }
}
