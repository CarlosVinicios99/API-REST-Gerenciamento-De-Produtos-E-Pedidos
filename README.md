# API REST - Gerenciamento De Produtos e Pedidos

## Visão Geral
<p>
  Neste projeto implemento uma API REST para um modelo de negócio de Gerenciamento de produtos e pedidos, a API conta com diversos web services, CRUD completo, exceções personalizadas e outros recursos avançados do Spring.
</p>
<br>

## Arquitetura Da API
<p>
  A arquitetura da API segue o modelo do esquema a abaixo, as requisições chegam a camada de Resource que faz acesso a camada de Service que por sua vez acessa a camada de Repository, assim cada camada assume uma responsabilidade tornando o código mais simples de compreender e alterar.
</p>  
<p>
  <img src = "https://github.com/CarlosVinicios99/API-REST-Gerenciamento-De-Produtos-E-Pedidos/blob/main/imagens/arquiteturaAPI.jpg?raw=true" alt = "Arquitetura da API">
</p>
<br>

## Modelo De Negócio
<p>
  O modelo de negócio foi mapeado com o JPA Hibernate e seguiu o diagrama UML abaixo.
</p>
<p>
  <img src = "https://github.com/CarlosVinicios99/API-REST-Gerenciamento-De-Produtos-E-Pedidos/blob/main/imagens/modeloDeNegocio.jpg?raw=true" alt = "Modelo de Negocio">
</p>
<br>

## Banco De Dados
<p>
  O Banco De Dados Relacional H2 foi utilizado durante o desenvolvimento. Abaixo na imagem pode ser visualizado o banco de dados com as respectivas tabelas geradas através do mapeamento Objeto-Relacional com o JPA.
</p>  
<p>
  <img src = "https://github.com/CarlosVinicios99/API-REST-Gerenciamento-De-Produtos-E-Pedidos/blob/main/imagens/tabelasDoBancoDeDados.jpg?raw=true" alt = "Tabelas Geradas no banco de dados">
</p>
<br>

## Exemplos De Requisições
<p>
  Alguns exemplos dos web services fornecidos pela API.
</p>
<p>
  <img src = "https://github.com/CarlosVinicios99/API-REST-Gerenciamento-De-Produtos-E-Pedidos/blob/main/imagens/exemploGetOrders.jpg?raw=true" alt = "Get orders">
</p>
<p>
  <img src = "https://github.com/CarlosVinicios99/API-REST-Gerenciamento-De-Produtos-E-Pedidos/blob/main/imagens/exemploGetProducts.jpg?raw=true" alt = "Get products">
</p>
<br>


## Tecnologias e Ferramentas
<p>
  Resumo das principais Tecnologias e Ferramentas utilizadas no desenvolvimento da API.
</p>
<p>
  <img src = "https://github.com/CarlosVinicios99/API-REST-Gerenciamento-De-Produtos-E-Pedidos/blob/main/imagens/tecnologiasFerramentas.jpg?raw=true" alt = "Tecnologias e Ferramentas">
</p> 



