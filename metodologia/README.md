<p align="center">
  <img src="assets/header-isabelly.png" alt="Isabelly de S. Rodrigues" width="700px">
</p>

## Sobre mim

Olá! Sou a **Isabelly**, tenho 20 anos e estudo **Banco de Dados na FATEC Jessen Vidal**, em São José dos Campos. Estagiei em análise de dados na **Ericsson** e hoje sou **Analista de Dados Jr. na Nestlé**.

Venho de um background em **ciência de dados**: gosto de entender o dado de ponta a ponta, de onde ele vem, como se organiza e que decisão ele precisa sustentar. Transito entre dados, código e negócio, o que me permite transformar necessidades reais em soluções que fazem sentido para quem usa.

Desde 2024, cada semestre me trouxe um cliente real e um problema novo, e passei por Python, Java, Docker, Vue e bancos relacionais e NoSQL. Fui desenvolvedora, Scrum Master e, hoje, Product Owner.

Quero me aprofundar em **back-end e engenharia de dados**, criando sistemas com código confiável o suficiente para sobreviver aos próximos releases; ou pelo menos até a próxima reunião de deploy.

## Contato

- [LinkedIn](https://www.linkedin.com/in/isabelly-rdgs/)

## Meus Projetos

<details>
  <summary><strong>2024-1</strong></summary>

O projeto "Scientific Calculator" foi desenvolvido durante o 1º semestre do curso de Banco de Dados como uma calculadora de terminal com um amplo conjunto de operações matemáticas, tendo o CADI, da própria FATEC, como cliente interno. O desenvolvimento foi dividido em quatro sprints: nas duas primeiras, as operações foram implementadas em VisualG; nas duas últimas, o código foi reescrito em TypeScript. O produto final oferecia operações básicas, fatorial, função de 2º grau, juros simples e compostos, conversão de bases numéricas e concatenação de strings, tudo por meio de um menu interativo no terminal.

O time, a equipe **Steam Ducks**, trabalhou em Scrum, e eu atuei como desenvolvedora.

#### Tecnologias Utilizadas

#### Contribuições Pessoais

Era o primeiro projeto do curso e o meu primeiro contato real com lógica de programação aplicada a um produto funcional. O desenvolvimento aconteceu em duas fases bien diferentes: nas Sprints 1 e 2, tudo em VisualG, o que exigia pensar em algoritmos puros, sem orientação a objetos nem bibliotecas, só estruturas de controle e variáveis. Nas Sprints 3 e 4, o código foi convertido para TypeScript, mas uma regra do cliente continuou valendo: funções como `Math.pow` eram proibidas, então toda a lógica de potenciação tinha que ser construída do zero.

Fiquei responsável pela função de **juros compostos** nas duas fases. Em VisualG, modelei o algoritmo com variáveis tipadas, entrada por `leia`, um laço `para` para acumular a potência e saída formatada com `escreva`. Na conversão para TypeScript, mantive a mesma potenciação manual com um laço `for`, agora com tipagem estática, `prompt-sync` para a entrada e `.toFixed(2)` para o formato monetário. A separação entre montante e juros foi preservada nas duas versões, o que garantiu consistência entre as entregas.

O resultado foi uma implementação coerente nas duas linguagens, e isso fez da conversão mais do que uma tradução de sintaxe: foi um exercício de entender o que a lógica realmente fazia, independentemente do ambiente em que rodava. Foi aqui que aprendi que um algoritmo bem pensado não depende da linguagem.

<details>
<summary>Função de Juros Compostos em VisualG e TypeScript</summary>

A fórmula de juros compostos exige potenciação, e o cliente havia proibido `Math.pow`. Em VisualG, o algoritmo recebe capital, taxa e tempo em meses, converte a taxa percentual em decimal e usa um laço `para` que multiplica o fator `(1 + i)` a cada período, acumulando a potência. O montante é o capital vezes essa potência, e os juros são a diferença entre montante e capital, exibidos separadamente em reais com duas casas decimais.

Na versão em TypeScript (`compoundInterest.ts`), a lógica é exatamente a mesma, com um laço `for`, variáveis tipadas, `prompt-sync` para a entrada e `.toFixed(2)` na saída. Manter as duas versões espelhadas foi o que me permitiu comprovar que a conversão preservava o comportamento original.

</details>

#### Hard Skills

<details>
<summary><strong>Lógica de programação e VisualG</strong></summary>

Sem recursos prontos, precisei transformar uma fórmula matemática em uma sequência de passos que o computador pudesse executar. Fazer a potenciação na mão, com um laço acumulando o fator `(1 + i)`, me mostrou como as estruturas de controle sustentam qualquer programa, mesmo os mais simples.

**Competências desenvolvidas:** Lógica de programação (básico/intermediário) · VisualG (básico) · Estruturas de repetição e variáveis tipadas (básico).

</details>

<details>
<summary><strong>TypeScript</strong></summary>

A passagem para TypeScript foi meu primeiro contato com uma linguagem usada no mercado. Reescrever a mesma lógica com tipagem estática, entrada via `prompt-sync` e formatação monetária me fez prestar atenção em legibilidade e organização, e não só em fazer funcionar.

**Competências desenvolvidas:** TypeScript (básico) · Funções tipadas (básico) · Entrada e saída em terminal (básico).

</details>

<details>
<summary><strong>Git e GitHub</strong></summary>

O versionamento deixou de ser só guardar código e virou parte da rotina do time. Aprendi a usar commits semânticos e a nomear tudo em inglês, de forma que qualquer colega entendesse o histórico.

**Competências desenvolvidas:** Git e GitHub (básico) · Commits semânticos (básico).

</details>

#### Soft Skills

<details>
<summary><strong>Atenção às restrições do projeto</strong></summary>

A regra de não usar `Math.pow` poderia ter sido ignorada na conversão para TypeScript, mas respeitá-la nas duas fases fazia parte de entregar o que o cliente pediu. Aprendi cedo que restrição de projeto não é detalhe.

</details>

<details>
<summary><strong>Consistência entre implementações</strong></summary>

Manter a mesma lógica nas duas linguagens exigiu disciplina: cada ajuste em uma versão precisava ser refletido na outra, para que a conversão fosse fiel à original.

</details>

<details>
<summary><strong>Precisão matemática</strong></summary>

Converter a taxa percentual para decimal e isolar corretamente os juros do montante pediu cuidado com detalhes que, em finanças, mudam o resultado final.

</details>

</details>

<details>
  <summary><strong>2024-2</strong></summary>

O projeto "PAS — Peer Assessment System" foi desenvolvido como uma aplicação desktop em JavaFX para apoiar o processo de avaliação acadêmica de alunos e equipes ao longo das sprints, novamente com o CADI como cliente interno. O sistema oferece duas frentes principais: a avaliação individual de alunos por critérios (autonomia, prazo, colaboração e produtividade), com distribuição limitada de pontos entre os membros da equipe, e a avaliação coletiva de sprints, em que cada turma pode pontuar suas equipes em diferentes ciclos do projeto.

A aplicação foi pensada para garantir consistência nas avaliações: validações em tempo real impedem que o avaliador exceda o total de pontos disponíveis, popups exibem descrições contextuais de cada critério e mensagens de erro orientam o usuário antes de qualquer salvamento. A interface foi construída com FXML, separando a camada visual da lógica de controle, em layouts dinâmicos (VBox/HBox) que se adaptam à quantidade de critérios ou equipes carregadas.

#### Tecnologias Utilizadas

#### Contribuições Pessoais

O sistema precisava traduzir regras acadêmicas rígidas em comportamento de software: o avaliador não pode distribuir mais pontos do que o disponível, cada critério precisa de uma descrição acessível na hora do preenchimento e as equipes carregadas têm que corresponder exatamente à turma selecionada. Um erro de usabilidade ali teria impacto direto na validade das avaliações, e a responsabilidade de transformar esses requisitos em telas funcionais ficou comigo.

Construí as duas telas principais do sistema, a de avaliação individual de alunos e a de avaliação de sprints, com seus controllers em Java e interfaces em FXML. Na tela de alunos, implementei um listener que monitora cada alteração nos ComboBoxes: ao tentar distribuir mais pontos do que o saldo disponível, o campo é revertido automaticamente e um alerta aparece antes que qualquer dado inválido seja salvo. Também adicionei popups modais com a descrição de cada critério. Na tela de sprints, estruturei o carregamento dinâmico das equipes a partir da turma escolhida e a validação das notas no intervalo de 1 a 100. Modelei as classes de domínio `notaAluno` e `notaSprint` e configurei o ambiente Maven com JavaFX, ControlsFX e JUnit, o que destravou o time para rodar e testar a aplicação localmente.

As telas foram entregues com validações completas e sem comportamentos inesperados diante de entradas fora do padrão. A separação entre FXML e controller facilitou a manutenção ao longo das sprints, e a modelagem das entidades deixou uma base consistente para a persistência futura. Aprendi a pensar em componentes reutilizáveis e a traduzir regras de negócio em validações que orientam o usuário em vez de puni-lo.

<details>
<summary>Tela de Avaliação de Aluno com distribuição limitada de pontos</summary>

O critério acadêmico exigia que o avaliador distribuísse exatamente 10 pontos entre os membros da equipe. Implementei um listener em cada ComboBox que calcula a diferença entre o valor antigo e o novo e abate do saldo de pontos. Se o saldo ficaria negativo, o campo volta ao valor anterior e um alerta de "Pontos insuficientes" aparece antes de qualquer dado inválido ser salvo. O saldo restante é atualizado na tela a cada mudança.

Cada critério também tem um popup modal com seu nome e sua descrição, aberto direto da tela de preenchimento, para que o avaliador não precise sair do fluxo para entender o que está pontuando.

</details>

<details>
<summary>Tela de Avaliação de Sprint com equipes dinâmicas por turma</summary>

Cada turma tinha suas próprias equipes, então uma lista fixa seria incorreta. Ao selecionar a turma, o controller `telaSprintController` monta dinamicamente os campos de nota apenas para as equipes daquela turma. Cada campo aceita somente dígitos e bloqueia, em tempo real, valores fora do intervalo de 1 a 100, revertendo para o valor anterior, de modo que entradas inválidas nem chegam ao backend.

</details>

<details>
<summary>Modelagem das classes de domínio</summary>

Sem classes de domínio, as avaliações seriam valores soltos, sem estrutura nem semântica, o que dificultaria a persistência e a exportação de relatórios. A classe `notaAluno` representa a nota de um aluno em um critério específico (com a descrição do critério e a sprint), e `notaSprint` representa a nota de uma equipe em uma sprint de uma turma. Ambas encapsulam seus atributos e estabeleceram contratos claros para os dados do sistema.

</details>

<details>
<summary>Configuração do ambiente Maven com JavaFX</summary>

O ambiente não rodava JavaFX, ControlsFX e JUnit juntos, o que impedia o time de executar e testar a aplicação localmente. No `pom.xml`, declarei as dependências de JavaFX (controls e fxml, versão 22.0.1), ControlsFX e JUnit (em escopo de teste), além do plugin para empacotar a aplicação. No `module-info.java`, declarei os módulos requeridos e abri o pacote principal ao FXML. Isso desbloqueou o ciclo de build e permitiu ao time avançar nas funcionalidades sem impedimentos de infraestrutura.

</details>

#### Hard Skills

<details>
<summary><strong>Java e JavaFX</strong></summary>

Foi meu primeiro contato com aplicações desktop. Trabalhar com eventos, listeners e popups modais me ensinou como a interface reage ao que o usuário faz e como impedir um estado inválido antes que ele exista.

**Competências desenvolvidas:** Java (básico/intermediário) · JavaFX (básico/intermediário) · Programação orientada a eventos (básico/intermediário).

</details>

<details>
<summary><strong>FXML e organização de camadas</strong></summary>

Separar o layout declarativo da lógica de controle deixou o código mais fácil de manter. Passei a organizar o projeto em Application, Controller e classes de domínio, cada uma com sua responsabilidade.

**Competências desenvolvidas:** FXML (básico/intermediário) · Separação de responsabilidades (básico/intermediário) · Modelagem de classes de domínio (básico).

</details>

<details>
<summary><strong>Maven, ControlsFX e JUnit</strong></summary>

Configurar as dependências e o módulo do projeto foi o que permitiu ao time executar e testar a aplicação. Foi uma tarefa invisível, mas sem ela ninguém conseguiria avançar.

**Competências desenvolvidas:** Maven (básico/intermediário) · ControlsFX (básico) · JUnit (básico) · Git e GitHub (básico/intermediário).

</details>

#### Soft Skills

<details>
<summary><strong>Atenção a regras de negócio</strong></summary>

Cada critério acadêmico virou uma validação concreta: limite de pontos, faixas de nota e campos obrigatórios. Aprendi a ler a regra por trás do requisito antes de escrever o código.

</details>

<details>
<summary><strong>Pensamento em componentes</strong></summary>

Os layouts dinâmicos (VBox/HBox) me levaram a projetar telas que se adaptam à quantidade de critérios ou equipes, em vez de telas feitas para um único cenário.

</details>

<details>
<summary><strong>Cuidado com a experiência do usuário</strong></summary>

Popups, mensagens de erro contextuais e descrições de critérios existiam para reduzir dúvidas no momento da avaliação. Passei a olhar a tela pela perspectiva de quem preenche.

</details>

<details>
<summary><strong>Organização de código</strong></summary>

Manter cada responsabilidade isolada facilitou a manutenção e as revisões do time ao longo das sprints.

</details>

</details>

<details>
  <summary><strong>2025-1</strong></summary>

Em parceria com a empresa **Altave**, foi desenvolvido um sistema web para monitoramento de funcionários de empresas terceiras em áreas de manutenção. O sistema permite cadastrar empresas e profissionais, incluindo fotos, e oferece uma filtragem completa das informações (por data, empresa e profissional). Os dados podem ser visualizados em um dashboard interativo, e é possível extrair relatórios detalhados para análise de desempenho e controle de horas trabalhadas.

O projeto contou com uma API para consumo de dados e uma modelagem de banco relacional, com front-end minimalista e intuitivo. Também há gestão de acesso, com autenticação por e-mail e senha e controle de acesso baseado em papéis (RBAC), histórico de alterações nos pontos para garantir transparência, criação de cargos e definição de pagamentos com base nas horas trabalhadas.

A equipe **Steam Ducks** trabalhou em Scrum, e eu atuei como **Scrum Master**, além de cuidar da cobertura de testes do backend.

#### Tecnologias Utilizadas

#### Contribuições Pessoais

Era o primeiro projeto com um cliente real, e o time enfrentava dois desafios ao mesmo tempo: entregar funcionalidades com qualidade técnica crescente e, ao mesmo tempo, manter o alinhamento humano de um grupo que ainda estava aprendendo a trabalhar junto. Sem processo, as sprints viravam caos; sem cobertura de testes, as integrações quebravam em silêncio. Assumi o papel de Scrum Master para cuidar dos dois lados.

No processo, conduzi todas as cerimônias do Scrum (dailies, plannings, reviews e retrospectivas) e documentei cada uma em atas formais, mantendo o histórico de decisões acessível ao time. O acompanhamento diário também acontecia pelo grupo do WhatsApp, onde registrei status de tarefas, bloqueios reportados fora do horário de reunião e decisões rápidas. Isso criou uma trilha de comunicação que foi consultada várias vezes para esclarecer o que havia sido combinado. Na gestão de pessoas, acompanhei individualmente a carga de cada membro pelo Jira, percebendo quem estava sobrecarregado, quem precisava de apoio técnico e quando redistribuir tarefas antes que o prazo da sprint fosse comprometido.

No lado técnico, implementei testes unitários em Java com JUnit e Mockito para sete controllers do backend, configurei o banco H2 para testes locais e participei dos code reviews. O projeto foi entregue no prazo com todas as funcionalidades acordadas, e o processo que estruturei deixou o time mais autônomo: as decisões passaram a ser consultadas, e não refeitas, e os bloqueios eram resolvidos antes de virar atraso. Aprendi que gerir pessoas em um time de desenvolvimento não é cobrar, e sim criar as condições para que cada pessoa consiga entregar.

<details>
<summary>Atas de reunião e cerimônias Scrum</summary>

O time não tinha histórico de decisões, então o que era combinado em uma planning podia ser questionado semanas depois. Passei a registrar cada cerimônia com pauta, participantes, decisões e próximos passos com responsável e prazo, e as atas ficavam no repositório e eram linkadas no grupo logo após a reunião.

</details>

<details>
<summary>Gestão de pessoas e registro via WhatsApp</summary>

Em times de faculdade, a comunicação informal é onde as coisas realmente acontecem, mas sem registro as decisões se perdem no scroll. Padronizei o grupo para que atualizações, bloqueios e alinhamentos fossem registrados com contexto, e isso também me permitia perceber quando alguém estava travado antes da próxima daily.

</details>

<details>
<summary>Acompanhamento individual e gestão de carga via Jira</summary>

Com cinco devs em paralelo e sprints de duas semanas, era fácil alguém ficar sobrecarregado sem o time perceber. Acompanhei semanalmente a distribuição de pontos por membro, cruzando com o velocity das sprints anteriores para antecipar riscos de entrega.

</details>

<details>
<summary>Ambiente de testes isolado (H2)</summary>

O projeto não tinha ambiente de testes isolado: qualquer teste rodaria contra o banco real ou simplesmente não rodaria. Adicionei o H2 como dependência e criei um profile `test` com um arquivo de propriedades próprio, apontando para um banco em memória, com console web habilitado para inspeção, dialeto do H2 e criação automática do schema pelo Hibernate. As classes de teste de integração passaram a usar esse profile, o que deixou os testes rápidos, reproduzíveis e sem efeito colateral. Esse foi o pré-requisito para toda a cobertura do backend.

</details>

<details>
<summary>Testes unitários dos controllers</summary>

As controllers não tinham cobertura: falhas nos retornos da API só seriam descobertas em execução, muitas vezes pelo cliente. Escrevi testes com JUnit e Mockito para os **sete controllers**, com o service mockado e três tipos de cenário em cada endpoint: sucesso (por exemplo, criação de usuário retornando `201` com o id), erro de validação (`400` com a mensagem do problema) e erro interno (`500` com mensagem genérica). Nas consultas, também cobri o caso de recurso inexistente (`404`). Com isso, as integrações passaram a ser validadas antes de chegar à branch principal.

</details>

#### Hard Skills

<details>
<summary><strong>Java, Spring Boot e testes unitários</strong></summary>

As controllers não tinham cobertura nenhuma, e falhas só seriam descobertas em execução, muitas vezes pelo cliente. Escrever testes com JUnit e Mockito para os sete controllers, cobrindo sucesso, erro de validação e erro interno em cada endpoint, me fez enxergar o teste como parte do desenho da API, e não como uma etapa final.

**Competências desenvolvidas:** Java (intermediário) · Spring Boot (básico/intermediário) · JUnit e Mockito (intermediário).

</details>

<details>
<summary><strong>Ambiente de testes com H2</strong></summary>

Sem um ambiente isolado, os testes rodariam contra o banco real ou simplesmente não rodariam. Configurar o H2 em memória com um profile separado deixou os testes rápidos e reproduzíveis, e foi o pré-requisito para toda a cobertura que veio depois.

**Competências desenvolvidas:** Banco H2 (básico/intermediário) · Profiles do Spring (básico) · Testes de integração (básico).

</details>

<details>
<summary><strong>Jira e gestão de sprints</strong></summary>

Acompanhar a distribuição de pontos por membro e cruzar com o velocity das sprints anteriores me deu uma forma objetiva de antecipar riscos de entrega.

**Competências desenvolvidas:** Jira (intermediário) · Scrum (intermediário) · Estimativa e acompanhamento de sprints (intermediário).

</details>

<details>
<summary><strong>Git e GitHub</strong></summary>

Branches, merges, pull requests e code reviews fizeram parte do meu dia a dia, tanto escrevendo quanto revisando.

**Competências desenvolvidas:** Git e GitHub (intermediário).

</details>

#### Soft Skills

<details>
<summary><strong>Liderança e coordenação de equipe</strong></summary>

Conduzir dailies, plannings e retrospectivas me ensinou que liderar um time é, na maior parte do tempo, manter todos olhando para a mesma direção e remover o que atrapalha o caminho.

</details>

<details>
<summary><strong>Comunicação eficaz</strong></summary>

Fui a interface constante com o Product Owner e os stakeholders para alinhar expectativas e esclarecer requisitos. As atas e o registro no grupo transformaram conversas em decisões que podiam ser consultadas depois.

</details>

<details>
<summary><strong>Gestão de pessoas</strong></summary>

Perceber sinais de sobrecarga ou de bloqueio antes da próxima daily exigiu conversar individualmente com cada membro e redistribuir tarefas com cuidado, sem expor ninguém.

</details>

<details>
<summary><strong>Organização e resolução de problemas</strong></summary>

Manter roteiro, documentação e repositório organizados, e identificar impedimentos propondo soluções ágeis, foi o que sustentou o ritmo do time ao longo das sprints.

</details>

</details>

<details>
  <summary><strong>2025-2</strong></summary>

O projeto "Tráfegou! – Monitoramento de Tráfego Inteligente" foi desenvolvido para atender a uma demanda real da **Prefeitura de São José dos Campos**.

A plataforma consolida um mapa georreferenciado com indicadores relevantes, classifica regiões por níveis de criticidade e automatiza o disparo de alertas (com integração ao bot do Telegram) vinculados a protocolos de ação previamente definidos. A aplicação permite não apenas identificar problemas, mas também registrar as ações tomadas pelos gestores, criando um histórico rastreável para a melhoria contínua da mobilidade urbana e para agir com agilidade diante de mudanças no trânsito.

A equipe **Steam Ducks** trabalhou em Scrum, e eu atuei como desenvolvedora full stack.

#### Tecnologias Utilizadas

#### Contribuições Pessoais

O sistema de monitoramento precisava ir além de mostrar um mapa: ele deveria comunicar o estado da cidade de forma imediata e indicar, em tempo real, quais vias estavam com as piores condições de fluxo. O desafio estava em definir quais métricas fariam sentido para esse contexto e, depois, construir os componentes capazes de exibi-las de forma clara e responsiva. Essa responsabilidade, da decisão sobre os indicadores até a entrega visual, ficou sob minha condução.

Participei ativamente das discussões sobre quais dados agregariam valor ao sistema e estruturei os componentes da interface a partir dessas decisões. Desenvolvi o módulo de alertas de vias críticas: um sidebar reativo (`TrafficAlertsSidebar.vue`) que consome um endpoint agendado e mostra, em tempo real, a rua com pior condição por região, classificada por um nível de severidade calculado a partir da diferença entre a velocidade limite e a velocidade média. No backend, implementei o endpoint `GET /worst` em Java com Spring Boot e a lógica de ranqueamento no `LevelService`. Criei também o composable `useTrafficStatus`, que mantém o estado global de qualidade do trânsito compartilhado entre o dashboard e o mapa, e construí os gráficos de desempenho por hora (`LineChart`) e de comparação semanal de velocidade (`DoubleBarChart`), reproduzindo com fidelidade o design feito no Figma. Também contribuí na API, no suporte à configuração do banco em nuvem e no pipeline de coleta de dados por scheduled tasks na Oracle Cloud.

O resultado foi uma interface que comunica o estado do trânsito em uma única tela: status global em destaque, alertas por região ao lado do mapa e gráficos históricos integrados. O projeto consolidou minha capacidade de atuar nas duas pontas do sistema e de participar de decisões de produto com embasamento técnico, sabendo o que é viável entregar e o que realmente agrega valor ao usuário final.

<details>
<summary>Sidebar de alertas com integração ao endpoint de piores ruas</summary>

Os gestores precisavam saber, em tempo real, quais ruas estavam nas piores condições, sem vasculhar o mapa. No backend, o endpoint `GET /worst` (`StreetController`) chama o `LevelService`, que calcula a severidade de cada rua pela diferença entre a velocidade limite e a velocidade média e devolve apenas a pior rua de cada região, mantendo a resposta enxuta. No frontend, o `TrafficAlertsSidebar.vue` renderiza um card por alerta, com região, rua, texto de status e horário, colorido pelo nível de severidade e com transição animada de abertura.

</details>

<details>
<summary>Composable de status global da cidade</summary>

O status global do trânsito precisava ser consistente entre o dashboard e o mapa. O composable `useTrafficStatus` guarda o nível atual (de 1 a 5) e o traduz em texto e cor (excelente, bom, regular, ruim e péssimo), expondo uma função para atualizá-lo. Qualquer componente que consome o composable exibe sempre o mesmo texto e a mesma cor, e a manchete do dashboard ("O trânsito em São José dos Campos está...") reage automaticamente à mudança.

</details>

<details>
<summary>Gráficos de métricas: decisão e implementação</summary>

Não havia definição clara de quais cortes de tempo agregariam mais valor, então participei da discussão e implementei dois recortes complementares. O `DoubleBarChart` compara a velocidade média de duas semanas, dia a dia, em barras lado a lado. O `LineChart` mostra a velocidade média ao longo das 24 horas do dia, com área preenchida. Ambos foram integrados aos filtros existentes e seguem o design do Figma.

</details>

#### Hard Skills

<details>
<summary><strong>Vue.js 3 e TypeScript</strong></summary>

Compartilhar o estado do trânsito entre o dashboard e o mapa me levou a usar composables para centralizar a lógica. Qualquer dessincronização exibiria informações conflitantes, então o estado precisava ter uma única fonte.

**Competências desenvolvidas:** Vue.js 3 (intermediário) · TypeScript (intermediário) · Composables e reatividade (intermediário).

</details>

<details>
<summary><strong>Java e Spring Boot</strong></summary>

O endpoint de piores ruas me obrigou a pensar na resposta como um contrato: uma rua por região, já classificada por severidade, para manter o frontend simples e reativo.

**Competências desenvolvidas:** Java (intermediário) · Spring Boot (intermediário) · APIs REST (intermediário).

</details>

<details>
<summary><strong>Gráficos de métricas com Chart.js</strong></summary>

Os gráficos por hora e por semana vieram de uma decisão de produto: quais recortes de tempo ajudam o gestor a agir. Transformar essa decisão em visualização, fiel ao Figma, foi um exercício de unir dado e design.

**Competências desenvolvidas:** Chart.js e vue-chartjs (intermediário) · Visualização de dados (intermediário).

</details>

<details>
<summary><strong>Docker, Oracle Cloud e tarefas agendadas</strong></summary>

Ajudar na configuração do banco em nuvem e no pipeline de coleta mostrou como os dados chegam ao sistema antes de qualquer tela.

**Competências desenvolvidas:** Docker (básico/intermediário) · Oracle Cloud e SQL Developer (básico) · Scheduled tasks (básico).

</details>

#### Soft Skills

<details>
<summary><strong>Visão de produto</strong></summary>

Participar da escolha dos indicadores me tirou do papel de quem apenas implementa. Passei a perguntar qual decisão cada métrica sustenta e se ela cabe no que podemos entregar.

</details>

<details>
<summary><strong>Atenção a detalhes</strong></summary>

Reproduzir o design do Figma com fidelidade e sugerir melhorias de responsividade e UI/UX fez parte do cuidado com a experiência de quem usa o sistema todo dia.

</details>

<details>
<summary><strong>Colaboração técnica</strong></summary>

Integrar as camadas com o restante do time e apoiar a configuração do banco e da coleta de dados exigiu alinhamento constante sobre contratos e formatos.

</details>

</details>

<details>
  <summary><strong>2026-1</strong></summary>

Em parceria com a empresa **Ericsson**, foi desenvolvido o **SCA**, um sistema web de controle e análise de custos e materiais para projetos e programas internos. A plataforma foi construída com uma arquitetura de dados em camadas (silver/gold), permitindo a ingestão de dados via CSV, o monitoramento das execuções de importação e a visualização de indicadores financeiros em dashboards interativos.

O sistema consolida rankings de materiais por impacto financeiro, custos por projeto, composição de orçamento e histórico de execuções. Um módulo de auditoria dedicado exibe falhas e inconsistências nas importações, com paginação e filtros, além do histórico completo das operações. O backend foi construído com Python e Django REST Framework, seguindo o ciclo TDD (Red → Green → Refactor), e o frontend com Vue.js 3 e TypeScript.

A equipe **Steam Ducks** trabalhou em Scrum, e eu atuei como desenvolvedora full stack.

#### Tecnologias Utilizadas

#### Contribuições Pessoais

O sistema precisava de uma camada completa de ingestão e rastreabilidade de dados, e nenhuma delas existia ainda. Não havia como importar CSVs, registrar o resultado dessas importações nem consultar o histórico de falhas. Ao mesmo tempo, o dashboard financeiro carecia de filtros por período e de rankings de materiais que o time ainda precisaria construir do zero, tanto no backend quanto no frontend. Assumi a entrega dessas funcionalidades de ponta a ponta, atuando em paralelo nos dois repositórios (sca-server e sca-client) e sendo responsável por todo o ciclo: modelagem, implementação, testes e integração.

No backend, implementei os filtros de período do dashboard principal com queries dinâmicas usando `Q()` objects do Django ORM e construí os dois rankings de materiais, o de maior impacto financeiro (`get_top_materials_by_financial_impact`) e o de custo por projeto (`CostByProjectView`), com serializers que formatam os valores monetários. Em seguida criei o módulo `imports/` do zero: defini os schemas de colunas obrigatórias para os 11 tipos de CSV aceitos, implementei a validação de linhas (`_validate_rows`, que distingue erros de avisos) e o registro de execução (`_register_execucao`), estruturei os endpoints de upload e cobri toda a camada com testes unitários. Depois construí inteiramente o módulo `monitoring/`: selectors com filtros encadeados por status, tabela, fonte e período, um serializer com o campo computado `duracao_segundos` e uma suíte de 88 testes unitários. Também participei de PRs co-autorados na centralização das constantes de schema e nas fixtures de teste compartilhadas.

No frontend, integrei as novas APIs ao painel de materiais (`fetchTopMaterials` e `fetchCostByProject`, em TypeScript, com tratamento de erros e testes) e construí as três abas da tela de Auditoria: upload de CSV por tipo de dado, falhas e inconsistências com paginação e histórico de execuções, além da rota `/auditoria`. Ao final do semestre, dois módulos completos de backend haviam sido entregues do zero com boa cobertura de testes, os dashboards passaram a filtrar por período e exibir rankings, e a tela de Auditoria reunia tudo o que é preciso para diagnosticar o ciclo de importação. Esse projeto marcou uma virada na minha forma de trabalhar: foi quando atuei com arquitetura de dados em camadas, adotei o TDD como prática de verdade e conduzi entregas full stack com autonomia, da modelagem do banco ao componente Vue que o usuário enxerga.

<details>
<summary>Filtros de período no dashboard principal (backend)</summary>

O dashboard exibia todos os projetos sem recorte temporal, o que impedia comparar períodos. A função `get_projects_by_period` monta um filtro com `Q()` objects do Django ORM, acrescentando as condições de data inicial e final apenas quando elas são informadas, de modo que consultas sem filtro continuam funcionando. O endpoint passou a aceitar `start_date` e `end_date` por query params, e um teste de integração cobre o fluxo completo.

</details>

<details>
<summary>Rankings de materiais: impacto financeiro e custo por projeto (backend)</summary>

Os dados de compras existiam, mas nenhuma view os agregava. O ranking de impacto financeiro agrupa as compras pela descrição do material, soma o valor total e ordena do maior para o menor, limitando o resultado aos dez primeiros. O de custo por projeto (`CostByProjectView`) devolve o custo total de materiais por projeto e alimenta o gráfico comparativo do frontend. Um serializer arredonda os valores monetários para duas casas, e ambos aceitam os mesmos filtros via query params.

</details>

<details>
<summary>Módulo de importação CSV: criação completa (backend)</summary>

Os dados chegavam exclusivamente via CSV, sem nenhum mecanismo de ingestão. O módulo `imports/` define, em `schemas.py`, as colunas obrigatórias de cada um dos 11 tipos de arquivo (programas, projetos, materiais, estoque, fornecedores, pedidos e solicitações de compra, compras por projeto, tarefas e tempo de tarefas, entre outros). A validação linha a linha distingue erros (valores nulos ou vazios) de avisos (campos só com espaços), e cada importação grava um registro de execução com status, linhas processadas, erros, avisos, detalhes de falha e timestamps de início e fim. O módulo foi coberto por mais de 100 testes de schemas, URLs e fluxos de upload, com mocks do banco.

</details>

<details>
<summary>Módulo de monitoramento e histórico de execuções (backend)</summary>

Depois do módulo de imports, a saúde do pipeline era opaca: não dava para saber se uma importação tinha funcionado, falhado ou demorado demais. O módulo `monitoring/` oferece um selector com filtros encadeados por status, tabela, fonte e período, ordenando as execuções da mais recente para a mais antiga. O serializer expõe o tipo do processo e calcula a duração em segundos a partir dos timestamps, retornando nulo quando a execução ainda não terminou. Uma suíte de 88 testes unitários cobre todos os campos, os casos limite (duração nula e zero) e a presença de todos os campos esperados na resposta.

</details>

<details>
<summary>Integração dos rankings no frontend (sca-client)</summary>

As APIs de ranking existiam, mas o painel de materiais mostrava apenas dados tabelados, sem nenhuma visão de custo agregado. Criei um serviço em TypeScript com as funções `fetchTopMaterials` e `fetchCostByProject`, com interfaces tipadas para as respostas, filtros convertidos em query params e erros explícitos com mensagem amigável quando a API falha. Os testes unitários cobrem sucesso, falha de rede e resposta não-ok.

</details>

<details>
<summary>Tela de Auditoria: CSV import, falhas e histórico (frontend)</summary>

O acompanhamento das importações estava invisível para o usuário. A tela de Auditoria reuniu três necessidades em abas, cada uma com testes para estados de loading, erros de API e comportamento reativo.

</details>

#### Hard Skills

<details>
<summary><strong>Python e Django REST Framework</strong></summary>

Criar os módulos `imports/` e `monitoring/` do zero me ensinou a organizar a API em selectors, serializers e views com responsabilidades claras, sempre guiado pelos testes.

**Competências desenvolvidas:** Python (intermediário) · Django REST Framework (intermediário) · Selectors e serializers (intermediário) · TDD com Pytest (intermediário).

</details>

<details>
<summary><strong>Dados em camadas e PostgreSQL</strong></summary>

Trabalhar com o modelo silver/gold, filtros dinâmicos e agregações me aproximou do que mais gosto: entender como o dado nasce, é tratado e vira indicador.

**Competências desenvolvidas:** PostgreSQL (intermediário) · Arquitetura silver/gold (básico/intermediário) · Consultas com filtros dinâmicos e agregações (intermediário).

</details>

<details>
<summary><strong>Vue.js 3 e TypeScript</strong></summary>

Integrar as APIs ao frontend, com serviços tipados e tratamento explícito de falha de rede e de resposta não-ok, tornou a tela de Auditoria confiável para quem a usa.

**Competências desenvolvidas:** Vue.js 3 (intermediário) · TypeScript (intermediário) · Serviços de API (intermediário).

</details>

<details>
<summary><strong>Testes, qualidade e entrega</strong></summary>

Pytest e Vitest, fixtures compartilhadas, SonarCloud e commits semânticos fizeram parte do fluxo. Cobrir os casos limite, e não só o caminho feliz, virou hábito.

**Competências desenvolvidas:** Pytest e Vitest (intermediário) · SonarCloud (básico/intermediário) · Docker (intermediário) · Git e GitHub (intermediário).

</details>

#### Soft Skills

<details>
<summary><strong>Autonomia e entrega</strong></summary>

Conduzir módulos inteiros, da estrutura aos testes e à integração, me deu responsabilidade sobre cada etapa do ciclo e a confiança de entregar sem depender de direcionamento constante.

</details>

<details>
<summary><strong>Pensamento em camadas</strong></summary>

Acompanhar o dado do banco à API e ao componente visual me ajudou a manter a consistência entre as camadas.

</details>

<details>
<summary><strong>Qualidade e cobertura</strong></summary>

Testar campos nulos, filtros ausentes e respostas de erro, e não apenas o cenário ideal, passou a ser parte do que eu considero pronto.

</details>

<details>
<summary><strong>Colaboração técnica</strong></summary>

Nos PRs co-autorados sobre constantes de schema e fixtures, aprendi a revisar e integrar código junto ao time, de forma que o trabalho de um módulo servisse a todos.

</details>

</details>

<details>
  <summary><strong>2026-2</strong></summary>

No segundo semestre de 2026, estamos desenvolvendo o **Índice**, uma plataforma de gestão e análise inteligente de documentos técnicos de engenharia (um EDMS), criada para a **Akaer**, empresa de engenharia e tecnologia que atuam nos setores aeroespacial, de defesa e industrial. O projeto está em andamento, organizado em três sprints entre setembro e novembro: ingestão e NoSQL, LLM e fluxo de revisão, e segurança e experiência do usuário.

O problema do cliente é conhecido de quem trabalha com documentação técnica: arquivos espalhados, sem padrão de nomenclatura e sem visão clara de qual revisão está vigente. Isso gera tempo perdido, retrabalho e o risco de decidir com base em informação desatualizada. O Índice propõe centralizar o envio dos documentos, padronizar sua identificação, classificá-los com apoio de IA, permitir busca por conteúdo com resumos e proteger o acervo com controle de acesso por perfil e nível de sigilo, em conformidade com a LGPD.

O projeto é desenvolvido pela equipe **Pragma**, com sete integrantes organizados em Scrum, e meu papel é o de **Product Owner**.

#### Tecnologias Utilizadas

#### Contribuições Pessoais

Entrei no Índice como Product Owner, e o primeiro desafio foi menos técnico do que parecia: as expectativas sobre o que um EDMS deveria entregar ainda não estavam alinhadas entre o cliente e o time. Para a Akaer, um sistema de gestão documental é, antes de tudo, controle de revisão, aprovação formal e sigilo, e não apenas um lugar para guardar arquivos. Parti das minhas referências de mercado sobre GED, EDMS e controle de documentos e de um roteiro de dez passos para implantar um sistema de gestão documental (diagnóstico, taxonomia, codificação, workflows, status, permissões, auditoria e governança). Ele virou a régua que eu usava para mostrar o que era núcleo do MVP e o que era evolução. Com isso, escrevi a declaração do problema, defini uma métrica de sucesso (reduzir o tempo para encontrar um documento relevante) e uma contra-métrica (não aumentar a taxa de documentos desatualizados ou mal classificados), e negociei o escopo: envio, padrão de identificação, busca e visualização primeiro; agrupamentos, biblioteca pessoal e auditoria avançada depois.

Esse material-base virou o backlog do produto, com 13 user stories priorizadas, estimadas em story points e ligadas a seis requisitos funcionais e cinco não funcionais. Cada história ganhou critérios de aceite no formato Dado/Quando/Então e, na hora de quebrar o trabalho, distribuí as tarefas entre backend e frontend em cards com descrição, DoR e DoD, com as dependências explícitas no Jira (por exemplo, o fluxo de pedidos de acesso, em que um card só começa depois do anterior). Foram cerca de 27 cards na Sprint 2 e 23 na Sprint 3. Nos cards de frontend, o wireframe anexado era parte do critério de pronto, e foi assim que prototipei o estilo visual do sistema, as telas e os componentes no Figma: navbar por perfil, tabela de documentos, painel do gestor e modais de acesso e avaliação.

A validação com o cliente aconteceu em duas rodadas de perguntas, e cada resposta virou decisão de produto. Descobrimos que cada alteração deve gerar uma nova revisão, com a vigente destacada e a aprovada bloqueada para edição; que o código do documento segue um padrão único validado pelo sistema; que o fluxo é elaboração, revisão técnica, revisão de qualidade, aprovação e publicação; e que a exclusão deve ser substituída por cancelamento ou arquivamento, sempre com log. Na Sprint 2, fechei as regras de borda que destravaram o time: uma revisão reprovada encerra o envio com justificativa; enquanto uma nova revisão aguarda aprovação, a versão vigente continua visível e só o botão de nova revisão fica bloqueado; quando um usuário é removido, os documentos são preservados e apenas seus dados pessoais são anonimizados. Ao revisar o que o time implementou, também identifiquei incoerências e as transformei em orientações objetivas, como tirar do upload inicial a lógica de versões duplicadas, deixar a tela de detalhes somente para leitura e histórico e tornar a navbar condicional por perfil.

A parte que mais me exigiu foi a de LGPD e segurança da informação. Produzi um documento que cruza cada critério de segurança com os requisitos do sistema e os cards que os atendem, e o levei para validação com o mentor da disciplina, para rastrear a nossa cobertura e não deixar nenhum critério sem resposta. Desse trabalho saíram os cards de termos de adesão versionados e consentimento granular, direitos do titular, anonimização de autoria, blacklist de identificadores guardando apenas hash, auditoria imutável, proteção de conteúdo restrito e plano de resposta a vazamentos. O projeto segue em andamento, mas o time já trabalha com um backlog rastreável do requisito ao card, um escopo protegido e um mesmo entendimento do que é um EDMS. Aprendi que um requisito bem escrito é a forma mais barata de evitar um bug.

<details>
<summary>Declaração do problema, métricas e escopo do MVP</summary>

**Dor identificada:** colaboradores têm dificuldade para encontrar, organizar e reutilizar documentos importantes, porque os arquivos ficam espalhados, sem padrão de nomenclatura e sem visão clara de status.

</details>

<details>
<summary>Backlog priorizado e requisitos</summary>

Organização de 13 user stories priorizadas, estimadas em story points e ligadas a requisitos funcionais e não funcionais.

</details>

<details>
<summary>Validação com o cliente: das respostas às decisões de produto</summary>

Validação de regras como controle de revisões, fluxos de aprovação, padrões de nomenclatura e tratamento de documentos sigilosos.

</details>

<details>
<summary>Estrutura de resolução dos cards (descrição, DoR e DoD)</summary>

Padronização de cards com descrição, DoR (com wireframes anexados para o frontend) e DoD.

</details>

<details>
<summary>LGPD e segurança da informação: do critério ao card</summary>

Mapeamento de critérios de segurança da informação e LGPD validados com o mentor da disciplina.

</details>

#### Hard Skills

<details>
<summary><strong>Gestão de produto e engenharia de requisitos</strong></summary>

Ser Product Owner de um EDMS exigiu transformar conversas com o cliente em requisitos concretos: problema, métricas, escopo, regras de negócio, requisitos funcionais e não funcionais e critérios de aceite. A contra-métrica de integridade foi a que melhor mostrou o cuidado necessário, porque encontrar um documento rápido não vale nada se ele for a versão errada.

**Competências desenvolvidas:** Product Owner (intermediário/avançado) · Engenharia de requisitos (intermediário/avançado) · Product Backlog e user stories (intermediário/avançado) · Critérios de aceite, DoR e DoD (intermediário/avançado).

</details>

<details>
<summary><strong>Domínio de EDMS e documentos técnicos</strong></summary>

Para especificar o produto, precisei aprender como funciona a gestão documental de engenharia: taxonomia, codificação, controle de revisão, fluxo de aprovação, status e controle de acesso por classificação. Entender o domínio foi o que me permitiu perguntar as coisas certas ao cliente.

**Competências desenvolvidas:** EDMS/GED (intermediário) · Controle de revisão e fluxos de aprovação (intermediário) · Need-to-know e classificação de sigilo (básico/intermediário).

</details>

<details>
<summary><strong>Prototipação e design de interface</strong></summary>

Prototipar o estilo visual, as telas e os componentes no Figma deu ao time uma referência única antes da implementação. Pensar nos estados de cada tela (habilitado, desabilitado, restrito, vazio) evitou decisões de design no meio do código.

**Competências desenvolvidas:** Figma (intermediário) · Wireframes e componentes (intermediário) · Design de fluxos por perfil (intermediário).

</details>

<details>
<summary><strong>LGPD e segurança da informação</strong></summary>

Traduzir exigências legais em tarefas implementáveis, como consentimento por cláusula, anonimização e auditoria imutável, e validar o resultado com o mentor, me ensinou a tratar privacidade como requisito de produto desde o início.

**Competências desenvolvidas:** LGPD (intermediário) · Segurança da informação (básico/intermediário) · Auditoria e rastreabilidade (intermediário) · Modelagem de perfis e permissões (intermediário).

</details>

<details>
<summary><strong>Jira, Scrum e IA aplicada a documentos</strong></summary>

Organizei dependências e fluxos no Jira, planejei as sprints e especifiquei as funcionalidades de IA do produto, com requisitos de timeout, fallback e aviso de conteúdo gerado por IA.

**Competências desenvolvidas:** Jira (avançado) · Scrum (intermediário/avançado) · Especificação de funcionalidades com IA (básico/intermediário).

</details>

#### Soft Skills

<details>
<summary><strong>Negociação e gestão de escopo</strong></summary>

Cliente e time enxergavam o EDMS de formas diferentes, e meu papel foi aproximá-los. Usar o roteiro de implantação e as perguntas de validação para decidir o que entra agora e o que fica para depois me ensinou que priorizar é também dizer quando.

</details>

<details>
<summary><strong>Comunicação com stakeholders</strong></summary>

Formular perguntas específicas, apresentar alternativas e registrar cada resposta como decisão reduziu ambiguidades antes que chegassem ao código.

</details>

<details>
<summary><strong>Liderança por clareza</strong></summary>

Um DoR explícito, uma dependência visível e um wireframe anexado removeram bloqueios antes que eles aparecessem. Liderei dando contexto ao time, e não ordens.

</details>

<details>
<summary><strong>Pensamento crítico</strong></summary>

Revisar o fluxo implementado, identificar incoerências e propor a refatoração com justificativa de produto exigiu olhar para o sistema como um todo.

</details>

<details>
<summary><strong>Responsabilidade e integridade</strong></summary>

Buscar a validação do mentor para o documento de segurança, em vez de assumir que estava tudo coberto, é uma postura que quero levar para qualquer produto que envolva dados sensíveis.

</details>

</details>
