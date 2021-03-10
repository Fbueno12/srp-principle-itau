## SRP - Single Responsability Principle <br />( Principio de responsabilidade única )

`A class should have one, and only one, reason to change` <br />
`uma classe deve ter uma, e somente uma, razão para mudar`

Ele é o primeiro dos princípios do SOLID, ele dita que uma classe só pode ter uma única responsabilidade 
no fluxo da aplicação caso a aplicação seja uma API cada classe será responsável por alguma coisa.
No caso de nossa aplicação cada pasta dentro da aplicação abriga uma responsabilidade diferente, por exemplo,
- `resources` abriga as rotas da aplicação definidas no contrato de serviço
- `entities` abriga os objetos que usaremos dentro do fluxo da aplicação
- `payloads` abriga o que entra e o que sai das rotas que foram definidos no contrato de serviço 
- `controllers` abriga as classes que orquestram o fluxo dentro do serviço como requisição ao mainframe ou gravar algo na base de dados.
- `services` abriga as classes que fazem alguma ação dentro ou fora da aplicação, como enviar um email ou consultar outra API.
#### ou seja, cada classe dentro do projeto tem uma única responsabilidade para executar.

### Alguns benefícios do Single Responsibility Principle (SRP):
- Complexidade do código reduzida, mais explícita e direta;
- Facilitação da legibilidade;
- Redução de acoplamento;
- Código limpo e testável;
- Facilidade de evolução.
  
### conclusão
  O Single Responsibility Principle é um dos mais importantes princípios do SOLID, 
  deve ser aplicado para obtermos classes mais coesas e de baixo acoplamento.

  Este é o tipo de princípio que todo código orientado a objetos deveria possuir.
  Portanto antes de construir aquela classe que cadastra o usuário e envia o e-mail, 
  lembre-se deste princípio.

