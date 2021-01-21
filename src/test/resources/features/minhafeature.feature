Feature: Minha primeira feature

  Background:
    Given uma request para minha feature

  Scenario: requisitar com sucesso minha feature
    When fizer um "POST" para resource "/v1/minhafeature"
    Then deve retornar 201