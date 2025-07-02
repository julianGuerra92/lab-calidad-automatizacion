#Author: Julian Rodriguez - Miguelangel Velez
#Lenguage: es

Feature: Agregar items al carrito de compras
    Como cliente de la tienda en línea
    Necesito agregar productos al carrito de compras
    Para poder proceder con su poago más adelantes

    Scenario: Agregar un producto al carrito
        Given que estoy en la página principal de la tienda
        When identifico el primero producto del listado
        And lo agrego al carrito de compras
        Then el producto deberá aparecer en la lista de mi carrito

    Scenario: Agregar unidades negativas al carrito
        Given que estoy en la página principal de la tienda
        When identifico un producto que deseo comprar
        And ingreso al detalle del producto
        And incremento a -2 unidades del producto
        Then no debería poder agregar el producto al carrito de compras

    Scenario: Verificar el total del carrito
        Given que estoy en la página principal de la tienda
        When identifico un producto que deseo comprar
        And ingreso al detalle del producto
        And incremento hasta 3 unidades del producto
        And lo agrego al carrito de compras
        Then el total del carrito debería reflejar la suma total de los precios de los productos

    Scenario: Verificar el total del carrito vacío
        Given que estoy en la página principal de la tienda
        When no agrego ningún producto al carrito de compras
        Then el total del carrito debería ser cero