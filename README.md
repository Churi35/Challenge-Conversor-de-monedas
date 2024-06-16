# Challenge Conversor de monedas

Este proyecto es un convertidor de moneda en Java que utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com) para obtener las tasas de cambio en tiempo real.

## Descripción

El proyecto contiene 3 partes:

- `Principal.java`: Es donde esta localizado el `main`, en el cual, se imprime el menu al Usuario para poder seleccionar una divisa base, posteriormente la divisa a la cual se le desea hacer la conversion y por último la cantidad a convertir. 

- `ConsultarApi.java`: Es la clase encargada de hacer la request a la API, la cual, envia las dos divisas para devolver la tasa de cambio de 1 unidad de divisa base a la otra divisa.

- `Cambio.java`: Es la clase encargada de hacer el calculo del cambio de una divisa a otra.

Las divisas consideradas fueron las siguientes: 
- ARS - Peso argentino
- BOB - Boliviano boliviano
- BRL - Real brasileño
- CLP - Peso chileno
- COP - Peso colombiano
- USD - Dólar estadounidense
- MXN - Peso mexicano

Al final de la conversion, se le pide al usuario si desea realizar otra conversión, en dado caso de que el usuario ya no quiere realizar más, el programa se finalizara