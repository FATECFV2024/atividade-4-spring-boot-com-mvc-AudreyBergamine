
//  JSON para efetuar teste de HTTP Request do tipo POST 
/* 

 
--------------------------POST METHOD--------------------------
// PARA CRIAR O ALUNO, NOTA E ENDEREÇO DE UMA ÚNICA VEZ
{
  "nome": "Audrey Bergamine ",
  "idade": 32,
  "curso": "Análise e Desenvolvimento de Sistemas",
  "matriculado": true,
  "nota": {
    "Lógica e Programação": 9.7,
    "Banco de Dados": 10.0,
    "Desenvolvimento Web I": 10.0
  },
  "endereco": {
    "rua": "Rua Rosa",
    "numero": 552,
    "cidade": "Poá",
    "estado": "SP",
    "cep": "01234-567"
  }
}

{
  "nome": "Talles Bergamine ",
  "idade": 23,
  "curso": "Análise e Desenvolvimento de Sistemas",
  "matriculado": true,
  "nota": {
    "Lógica e Programação": 9.7,
    "Banco de Dados": 10.0,
    "Desenvolvimento Web I": 10.0
  },
  "endereco": {
    "rua": "Rua Rosa",
    "numero": 552,
    "cidade": "Poá",
    "estado": "SP",
    "cep": "01234-567"
  }
}


 
 
--------CRIAR SOMENTE UM ALUNO (Sem NOTA  e ENDEREÇO ) ---------
{
  "nome": "Sueli Bergamine",
  "idade": 56,
  "curso": "Análise e Desenvolvimento de Sistemas",
  "matriculado": true
}
 
ROTA: http://localhost:8080/nota/{id}
--------CRIAR UMA NOTA E INCLUIR O ALUNO (NECESSÁRIO)---------
{
    "Lógica e Programação": 8.0,
    "Banco de Dados": 7.0,
    "Desenvolvimento Web I": 6.0
  }
 
ROTA: http://localhost:8080/endereco/{id}
--------CRIAR UM ENDERECO E INCLUIR O ALUNO (NECESSÁRIO)---------
{
    "rua": "9 de Maio",
    "numero": 552,
    "cidade": "Poá",
    "estado": "SP",
    "cep": "08561-160"
  }
 
--------------------------GET METHOD--------------------------
ROTA: http://localhost:8080/aluno
 
--------------------------PUT METHOD--------------------------
ROTA: http://localhost:8080/nota/1
  {
    "Lógica e Programação": 9.0,
    "Banco de Dados": 9.5,
    "Desenvolvimento Web I": 8.5
  }
 
--------------------------DELETE METHOD--------------------------
ROTA: http://localhost:8080/endereco/1



*/