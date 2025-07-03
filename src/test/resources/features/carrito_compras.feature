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
        When identifico el primero producto del listado
        And dentro del detalle del producto agrego -2 unidades al carrito
        Then no debería poder agregar el producto al carrito de compras

    Scenario: Verificar el total del carrito
        Given que estoy en la página principal de la tienda
        When identifico el primero producto del listado
        And dentro del detalle del producto agregoo 3 unidades al carrito
        And al ingresar al carrito de compras
        Then el total del carrito debería reflejar la suma total de los precios de los productos

    Scenario: Verificar el total del carrito vacío
        Given que estoy en la página principal de la tienda
        When ingreso al carrito de compras sin agregar productos
        Then el carrito debería estar vacío