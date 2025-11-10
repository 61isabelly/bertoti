package padroes.observador.padrao;
public class SistemaClima {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        estacao.adicionar(temp -> System.out.println("Display Interno: " + temp + "°C"));
        estacao.adicionar(temp -> System.out.println("Display Externo: " + temp + "°C"));

        estacao.setTemperatura(24.8f);
        estacao.setTemperatura(29.4f);
    }
}
