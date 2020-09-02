Feature: Como futuro cliente deseo ingresar mis datos personales, para poder crear una cuenta en el sitio de compras

  @Register
  Scenario: El cliente ingresa sus datos y se registra
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: testing@test.crowdar.com
    And el cliente hace click en el botón Create an account
    Then el cliente verifica el formulario de carga de datos personales

    When el cliente ingresa sus datos personales: Title: Mr., First name: Joel, Last name: Vitelli, Password: Testing2020, Date of Birth 4/June/1992
    And el cliente ingresa sus datos de dirección: Company: Crowdar, Address: Buenos Aires 5692, City: Albuquerque, State: New Mexico, Zip: 55226, Country: United States, Mobile phone: 2619635215, Alias: Dirección Joel
    And el cliente hace click en el botón Register
    Then el cliente verifica que fue redireccionado a la pantalla de My Account
