Feature: Test the greetings service for correct return messages

  #noinspection NonAsciiCharacters
  Scenario Outline: Introduce yourself and then say hi
    When we introduce ourselves as "<name>"
    And we say we want greeting "<greeting>"
    Then please say "<greeting> <name>"