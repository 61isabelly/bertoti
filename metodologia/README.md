<p align="center">
  <img src="./assets/header.png" alt="Header" width="800">
</p>

# Isabelly de S. Rodrigues

<img style="margin: 0 0 20px 20px; float: right; width: 190px; height: auto; border-radius: 12px;" src="https://avatars.githubusercontent.com/u/164695350?v=4">

<div style="margin-right: 220px;">

## Introdução

<div style="text-align: justify;">
Olá!
Meu nome é Isabelly, tenho 19 anos, sou estudante de Banco de Dados pela FATEC Jessen Vidal, de São José dos Campos, e atualmente estagiária de análise de dados na Ericsson.  

Minha trajetória na área de desenvolvimento começou no 1º semestre de 2024, e desde então venho adquirindo experiência nos diferentes campos que envolvem softwares estruturados. No meu dia a dia, é comum trabalhar com Python, Java, Docker e demais soluções de gerenciamento para armazenamento, consulta e organização de informações.  

Nos meus planos futuros, busco me aprofundar em back-end, criando sistemas eficientes, com código confiável o suficiente para sobreviver aos próximos releases; ou pelo menos até a próxima reunião de deploy. 
</div>

<div style="clear: both;"></div>

## Contato
* [LinkedIn](https://www.linkedin.com/in/isabelly-rdgs/)

## Meus Projetos

<details>
  <summary><strong>2025-1</strong></summary>

Em parceria com a empresa Altave, foi desenvolvido um sistema web para monitoramento de funcionários de empresas terceiras em áreas de manutenção. O sistema foi pensado a fim de permitir o cadastro de empresas e profissionais, incluindo fotos, e oferecendo uma filtragem de informações completa (por data, empresa e profissional). É possível visualização de dados de forma gráfica em um dashboard interativo, bem como extrair relatórios detalhados para análise de desempenho e controle de horas trabalhadas.

O projeto contou com uma API para consumo de dados e uma modelagem de banco de dados relacional eficiente, garantindo integridade e organização das informações. O design do front-end é minimalista e intuitivo, facilitando a navegação e o uso diário do sistema. Além disso, o sistema possui funcionalidades de gestão de acesso, permitindo que usuários se autentiquem por e-mail e senha, e registra um histórico de alterações realizadas nos pontos, assegurando transparência e controle das informações por meio de controle de acesso baseado em papéis (RBAC). Também há suporte à criação de cargos e definição de pagamentos com base nas horas trabalhadas, integrando todas as necessidades de monitoramento e gestão de funcionários terceirizados em um único ambiente digital.

<h1 align="center"> Pontual </h1>


<div align="center">
  <img src="./assets/pontual.gif" alt="Descrição do GIF" width="500">
</div>
<br><br> 

<p align="center">
  <a href="https://github.com/Steam-Ducks/point-system" target="_blank">
    <img src="https://img.shields.io/badge/Acesse%20o%20Repositório-white?style=for-the-badge&logo=github&logoColor=black" alt="GitHub Repo"/>
  </a>
</p>


#### Tecnologias Utilizadas

<div align="center">
  
[![My Skills](https://skillicons.dev/icons?i=java,spring,vue,git,supabase,postgres,figma,github,idea,vscode&theme=light)](https://skillicons.dev)

</div>


#### Contribuições Pessoais
Atuei como Scrum Master, coordenando reuniões diárias e de planejamento (daily/planning) e alinhando expectativas entre Product Owner, equipe e stakeholders, garantindo o fluxo contínuo do projeto. Além disso, acompanhei o roteiro de desenvolvimento, a manutenção do repositório e a produtividade da equipe por meio do Jira, identificando pontos de melhoria e promovendo soluções em cima da metodologia ágil SCRUM.

Contribuí com a implementação de testes unitários em Java para nossas controllers (Employee, Company, Dashboard, Auth, Position, TimeRecords e User), assegurando a qualidade e cobertura do backend. Minha participação nos merges de pull requests foi, principalmente, na análise e validação do código garantindo que as funcionalidades fossem integradas de forma consistente e no conjunto da equipe como um todo. 

<details>
  <summary>1. Configuração de Dependências</summary>

  ## H2 

**pom.xml:**
```			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<version>2.2.224</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
```


**point-system/src/test/java/pointsystem/integrationPointSystemApplicationTests.java:**
```
package pointsystem.integration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
@SpringBootTest
class PointSystemApplicationTests {
```

**point-system/src/test/resources/application-test.properties:**
```
# Habilita o console web do H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração do datasource para H2
spring.datasource.url=jdbc:h2:mem:pointdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA (opcional, ajusta conforme sua necessidade)
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```

</details>

<details>
  <summary>2. Testes</summary>

  ## Exemplo de Testes de Unidade

```
package pointsystem.unit.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pointsystem.controller.UserController;
import pointsystem.dto.user.UserDto;
import pointsystem.service.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    private AutoCloseable mocks;

    @BeforeEach
    void setUp() {
        mocks = MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateUserSuccess() {
        UserDto dto = new UserDto();
        when(userService.createUser(dto)).thenReturn(10);

        ResponseEntity<?> response = userController.createUser(dto);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(Map.of("id", 10), response.getBody());
        verify(userService).createUser(dto);
    }

    @Test
    void testCreateUserBadRequest() {
        UserDto dto = new UserDto();
        when(userService.createUser(dto)).thenThrow(new IllegalArgumentException("Dados inválidos"));

        ResponseEntity<?> response = userController.createUser(dto);

        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertEquals(Map.of("message", "Dados inválidos"), response.getBody());
    }

    @Test
    void testCreateUserInternalServerError() {
        UserDto dto = new UserDto();
        when(userService.createUser(dto)).thenThrow(new RuntimeException());

        ResponseEntity<?> response = userController.createUser(dto);

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertEquals(Map.of("message", "Erro ao cadastrar o Usuario. tente novamente"), response.getBody());
    }

    @Test
    void testGetAllUsers() {
        List<UserDto> users = Arrays.asList(new UserDto(), new UserDto());
        when(userService.getAllUsers()).thenReturn(users);

        ResponseEntity<List<UserDto>> response = userController.getAllUsers();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(users, response.getBody());
    }

    @Test
    void testGetUserByIdFound() {
        UserDto user = new UserDto();
        when(userService.getUserById(1)).thenReturn(user);

        ResponseEntity<UserDto> response = userController.getUserById(1);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(user, response.getBody());
    }

    @Test
    void testGetUserByIdNotFound() {
        when(userService.getUserById(1)).thenReturn(null);

        ResponseEntity<UserDto> response = userController.getUserById(1);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNull(response.getBody());
    }

    @Test
    void testUpdateUser() {
        UserDto dto = new UserDto();

        ResponseEntity<Void> response = userController.updateUser(1, dto);

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(userService).updateUserById(1, dto);
    }
}
```
</details>


#### Hard Skills
* **Java & Spring Boot:** desenvolvimento de controllers, serviços e integração com banco de dados;

* **JUnit & Testes Unitários/Integração:** criação de testes abrangentes para múltiplos módulos do backend;

* **Git & GitHub:** gerenciamento de branches, merges, pull requests e manutenção de repositório; 

* **Banco de dados H2:** configuração para testes locais;

* **Jira:** acompanhamento de produtividade, tarefas e gerenciamento de sprints; 

#### Soft Skills
* **Liderança e Coordenação de Equipe:** condução de reuniões diárias e alinhamento de prioridades, garantindo o progresso do projeto.

* **Comunicação Eficaz:** interface constante com Product Owner e stakeholders para definir expectativas e esclarecer requisitos.

* **Organização e Planejamento:** manutenção de roteiro, documentação e estrutura de repositório organizada.

* **Resolução de Problemas:** identificação de impedimentos e proposição de soluções ágeis para manter o ritmo de desenvolvimento.

</details>

<details>
  <summary><strong>2022-1</strong></summary>
Conteúdo do projeto 2022-1...
</details>

<details>
  <summary><strong>2022-2</strong></summary>
Conteúdo do projeto 2022-2...
</details>

<details>
  <summary><strong>2023-1</strong></summary>
Conteúdo do projeto 2023-1...
</details>

<details>
  <summary><strong>2023-2</strong></summary>
Conteúdo do projeto 2023-2...
</details>
