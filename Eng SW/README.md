## Aula 08/08/2024

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.


• **O que é Engenharia de Software?**

Nela se aplica princípios de engenharia para desenvolver um software sustentável e escalável. Com enfoque em metodologias estruturadas há uma garantia que o software seja eficiente, limpo e fácil de manter; com o controle de qualidade rigoroso e em práticas que permitem a evolução contínua em larga escala.

## Aula 12/08/2024

• **Cite 3 exemplos de Trade-offs:**

Portabilidade: O sistema deve ser capaz de rodar em diferentes plataformas com alterações mínimas; Manutenção: O sistema deve ser fácil de manter e atualizar; Escalabilidade: O sistema deve ser capaz de aumentar ou diminuir conforme necessário.

## Aula 16/08/2024

• **Repetir as classes SalaAula e Aula com um exemplo seu em Java**

_Classe Formula1Car_
```
package org.example;

// Criada a classe Formula1Car
// A classe criada possui os atributos definidos como privados

public class Formula1Car {

    private String piloto;
    private String equipe;
    private int numeroCarro;
    private String nomeCarro;
    private int anoFabricacao;

    // Criado o método construtor, definido como público

    public Formula1Car(String piloto, String equipe, int numeroCarro, String nomeCarro, int anoFabricacao) {
        this.piloto = piloto;
        this.equipe = equipe;
        this.numeroCarro = numeroCarro;
        this.nomeCarro = nomeCarro;
        this.anoFabricacao = anoFabricacao;
    }

    // Métodos de acesso (getters) e modificação (setters)

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
```

_Classe Corrida_

```
package org.example;

import java.util.LinkedList;
import java.util.List;

// Classe Corrida que gerencia uma lista de carros de Fórmula 1
public class Corrida {

    // Lista privada de objetos do tipo Formula1Car que armazena os carros e pilotos inscritos na corrida
    private List<Formula1Car> carrosCorrida = new LinkedList<Formula1Car>();

    // Método para inscrever um carro de Fórmula 1 na corrida
    public void inscreverCarro(Formula1Car carro) {
        // Adiciona o carro à lista de carros inscritos na corrida
        carrosCorrida.add(carro);
    }

    // Método que busca carros na lista pela equipe informada
    public List<Formula1Car> buscarCarrosPorEquipe(String equipe) {
        // Lista que armazenará os carros encontrados que correspondem à equipe
        List<Formula1Car> carrosEncontrados = new LinkedList<Formula1Car>();

        for (Formula1Car carro : carrosCorrida) {
            // Verifica se a equipe do carro atual é igual à equipe procurada
            if (carro.getEquipe().equals(equipe)) {
                // Se for igual, adiciona o carro à lista de carros encontrados
                carrosEncontrados.add(carro);
            }
        }
        // Retorna a lista de carros encontrados (pode ser vazia se nenhum carro corresponder à equipe)
        return carrosEncontrados;
    }

    // Método que busca carros na lista pelo piloto informado
    public List<Formula1Car> buscarCarrosPorPiloto(String piloto) {
        // Lista que armazenará os carros encontrados que correspondem ao piloto
        List<Formula1Car> carrosEncontrados = new LinkedList<Formula1Car>();

        for (Formula1Car carro : carrosCorrida) {
            // Verifica se o piloto do carro atual é igual ao piloto procurado
            if (carro.getPiloto().equals(piloto)) {
                // Se for igual, adiciona o carro à lista de carros encontrados
                carrosEncontrados.add(carro);
            }
        }
        // Retorna a lista de carros encontrados (pode ser vazia se nenhum carro corresponder ao piloto)
        return carrosEncontrados;
    }

    // Método que retorna a lista completa de carros inscritos na corrida
    public List<Formula1Car> getCarrosCorrida() {
        return carrosCorrida;
    }
}
```

_Formula1CarTest_

```
package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// Classe de teste para a classe Corrida utilizando JUnit 5
class Formula1CarTest {

    // Método de teste que verifica o funcionamento da inscrição de carros de Fórmula 1 e a busca por modelo
    @Test
    void test() {

        // Criação de uma instância da classe Corrida, que será testada
        Corrida corrida = new Corrida();

        // Criação de dois objetos Formula1Car com modelos reais de carros de Fórmula 1
        Formula1Car rb15 = new Formula1Car("Max Verstappen", "Red Bull", 33, "RB15", 2019);
        Formula1Car sf90 = new Formula1Car("Sebastian Vettel", "Ferrari", 5, "SF90", 2019);

        // Inscrição dos carros na corrida
        corrida.inscreverCarro(rb15);
        corrida.inscreverCarro(sf90);

        // Verifica se o número de carros inscritos na corrida é igual a 2
        assertEquals(corrida.getCarrosCorrida().size(), 2);

        // Busca um carro pelo nome do modelo "RB15" e armazena o resultado na lista carros
        List<Formula1Car> carros = corrida.buscarCarrosPorModelo("RB15");

        // Verifica se o primeiro carro encontrado tem o mesmo modelo do carro RB15
        assertEquals(carros.get(0).getNomeCarro(), rb15.getNomeCarro());
    }
}
```





