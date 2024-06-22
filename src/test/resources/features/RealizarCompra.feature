@FeatureDos
Feature: Generar la compra de diferentes productos.

  Background:
    Given El usuario Ciro se encuentra en la aplicacion

  @CP_2
  Scenario Outline: Realizar proceso de compra para cualquier producto
    When El usuario selecciona la "<Categoria>"
    And Selecciona el "<Producto>" a comprar
    Then Se muestra el producto seleccionado junto a su descripción
    When Selecciona la opción agregar al carrito
    Then El sistema notificá al usuario que el producto se agrego al carrito exitosamente
    When Selecciona la opción Carro
    Then Se muestra el carrito con el producto previamente agregado
    When Completa el proceso para generar pedido
    Then El sistema notificara al usuario Gracias por su compra

    #Categoria: {Phones, Laptops, Monitors}
    Examples:
      |Categoria |Producto  |
      |Phones   |Nokia lumia 1520 |
      |Laptops   |Dell i7 8gb |
      |Monitors   |ASUS Full HD|

