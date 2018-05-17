## Exercício: sistema de vendas 

### Definição do projeto
Tomando por base o sistema de Vendas proposto nos exercícios anteriores, considere que será necessário manter uma espécie de banco de dados em memória para Clientes, Vendedores, Produtos e Vendas realizadas.

Dessa forma, ao executar seu programa, o usuário deverá ser apresentado a um menu de opções, como por exemplo:

```
    ----------------------------
    ----- SISTEMA DE VENDAS ----
    ----------------------------
    (1) Cadastrar Cliente
    (2) Listar Clientes
    (3) Cadastrar Vendedor
    (4) Listar Vendedores
    (5) Cadastrar Produto
    (6) Listar Produtos
    (7) Registrar Venda
    (8) Relatório de Vendas
    ----------------------------
```

*Observações:*
- Defina as classes / interfaces que julgar necessárias para que seu sistema utilize o padrão MVC
- Defina uma coleção (API Collections) em cada controlador para atuar como  um 'banco de dados' em memória, dos objetos cadastrados.

####Desafio (+0,5 pontos):
Implemente uma camada de persistência, que carregue/salve os objetos das coleções em arquivos, ao iniciar/sair do sistema

Cada aluno deve submeter pelo AVA o link para um repositório no github, que deve conter:
- `/doc`: Diagrama de classes do sistema
- `/src`: Código fonte do sistema
- `README.md`: arquivo explicando como executar seu programa
- `<seu_programa>.jar`: arquivo empacotado (JAR) para executar seu programa
