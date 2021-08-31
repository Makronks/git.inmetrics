#Author: your.email@your.domain.com


Feature: Atuliazacao cadastral de Funcionario Inmetrics
 Eu como usuario quero quero realizar atualizacao do cadatral dos funcionarios


  Scenario: Cadastro de Funcionario
    Given que estou no site "https://inm-test-app.herokuapp.com/empregados/"
    When realizo o cadastro do funcionario
    Then Valido o cadastro

  Scenario:  Cadastro de Funcionario
    Given que estou no site "https://inm-test-app.herokuapp.com/empregados/"
    When  atulizo o cadastro do funcionario
    Then Valido a atualizacao
    
 Scenario:  Cadastro de Funcionario
    Given que estou no site "https://inm-test-app.herokuapp.com/empregados/"
    When excluo o cadastro do funcionario
    Then Valido a exclusao
 