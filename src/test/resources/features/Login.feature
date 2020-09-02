Feature: Como cliente, quiero ingresar los credenciales de mi cuenta, para ingresar al sitio de compras

  @Login
  Scenario: El cliente inicia sesión en el sitio de compras
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: testing.crowdar@testing.net.com
    And el cliente ingresa su password: 12345
    And el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de My Account

  @Login
  Scenario: El cliente inicia sesión en el sitio de compras
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: testing.ssdddadwecrowdar@testing.net.com
    And el cliente ingresa su password: asds1233
    And el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de My Account
