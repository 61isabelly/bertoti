package padroes.observador.antipadrao;
public class MainEstacao {
    public static void main(String[] args) {

        double temperatura = 25.0;
        double umidade = 60.0;
        double pressao = 1013.0;

        Previsao.atualizar(temperatura, umidade, pressao);
        Historico.atualizar(temperatura, umidade, pressao);
    }
}