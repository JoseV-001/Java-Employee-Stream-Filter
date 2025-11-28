

# 🚀 Java Employee Stream Filter

Este projeto em Java demonstra o poder da API de Streams (Java 8+) para processar dados lidos de um arquivo CSV. Ele simula um pequeno sistema de consulta de funcionários, permitindo filtrar e agregar informações de forma funcional e eficiente.

## ✨ Destaques de Tecnologia

* **API de Streams (Java 8+):** Uso de operações funcionais como `filter`, `map`, `sorted`, `reduce` e `collect`.
* **Manipulação de Arquivos (I/O):** Leitura de dados estruturados a partir de um arquivo CSV usando `BufferedReader` e `FileReader`.
* **Programação Funcional:** Código mais expressivo, conciso e sem loops tradicionais.

## 📊 Funcionalidades

O programa realiza duas operações principais:

1. **Filtrar e listar e-mails por salário:**

   * O usuário informa um valor de salário.
   * O programa mostra todos os e-mails dos funcionários cujo salário é **maior** que o valor informado.
   * A listagem é exibida em **ordem alfabética**.

2. **Somar salários pela letra inicial do nome:**

   * O usuário agora escolhe **qual letra inicial** deseja usar (ex: `A`, `b`, `M`).
   * O sistema ignora maiúsculas/minúsculas.
   * O programa soma e exibe o total dos salários de todos os funcionários cujo nome começa com a letra escolhida.

## 🛠️ Estrutura do Projeto

* **`application.Main`**
  Responsável pela leitura do arquivo, entrada do usuário, execução das operações com Streams e exibição dos resultados.

* **`model.entities.Employee`**
  Modelo simples representando um funcionário, contendo nome, e-mail e salário.

## ▶️ Como Executar

1. O arquivo de entrada (**in.txt**) já está incluído no projeto como exemplo.
   Você pode editá-lo ou criar um novo.
2. O arquivo deve seguir o formato:
   **Nome,Email,Salário**
   Exemplo:
   `Jose,Jose@gmail.com,2500.00`
3. Execute a classe `application.Main` e informe:

   * O caminho completo para o arquivo.
   * O salário mínimo para filtragem.
   * A letra inicial para o cálculo da soma.

> Este projeto tem fins **didáticos**, focado no aprendizado de Streams, leitura de arquivos e boas práticas básicas de Java.
