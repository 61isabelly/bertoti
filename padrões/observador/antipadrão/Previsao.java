package padrões.observador.antipadrão;

public class Previsao {
    public static void atualizar(double temperatura, double umidade, double pressao){
        System.out.println("Previsão atualizada com temperatura: " + temperatura +
                           ", umidade: " + umidade +
                           ", pressão: " + pressao);
    };
}
