package padroes.observador.antipadrao;

public class Historico {
    public static void atualizar(double temperatura, double umidade, double pressao){
        System.out.println("Histórico de temperatura: " + temperatura +
                ", umidade: " + umidade +
                ", pressão: " + pressao);
    };
}
