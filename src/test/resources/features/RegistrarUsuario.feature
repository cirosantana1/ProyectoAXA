@FeatureUno
Feature: Registrar un usuario nuevo.

  Background:
    Given El usuario Ciro se encuentra en la aplicacion

  @CP_1
  Scenario Outline: Registro y autenticar de un nuevo usuario en la plataforma
    When El usuario ingresa sus datos de registro "<UserName>","<Password>"
    And Selecciona la opción registrarse
    Then El sistema notificara al usuario que el registro fue exitoso
    When El usuario ingresa sus datos de autenticación "<UserName>","<Password>"
    And Selecciona la opción login
    Then El sistema autenticara al usuario exitosamente y le muestra su username

    Examples:
     |UserName              |Password  |
     |ciro22Test@gmail.com  |Test2024* |