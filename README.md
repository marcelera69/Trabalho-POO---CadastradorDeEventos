## Getting Started
Trabalho feito para a faculdade na matéria de orientação a objetos
Implementar um pequeno sistema para gerenciar eventos, com as seguintes funcionalidades:
* Cadastrar Pessoas
* Cadastrar Eventos
* Associar uma pessoa a um evento
* Listar pessoas associadas a um evento (usar um JTextArea para exibir as pessoas)

A tela principal deverá ser um JFrame contendo um JTabbedPane com 4 abas que funcionará como um menu. Nele estarão "pendurados" JPanel para implemenar as janelas de cada opção

Para realizar a gravação de dados em arquivo, será fornecida uma classe chamada BD contendo a funcionalidade de salvar e obter dados em arquivo de texto.

As classes deverão ser organizadas em pacotes separados, de acordo com o padrão MVC

Para que os "listeners" (controller) sejam implementados em separado das telas (view), cada "listener" deve prever como atributo um objeto que representa a tela associada a ele, para que o código que trata o evento de mouse (método mouseClicked() ) possa acessar os objetos gráficos (JTextField) para obter os valores digitados

obs: utilizando uma classe DB feita pelo prorpio orientador
