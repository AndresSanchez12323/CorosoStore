# Algoritmos y Programacion 2

Proyecto base para la asignatura de Algoritmos y Programacion 2. Incluye un mini-sistema tipo tienda con manejo de usuario, cartera, biblioteca e historial de compras. El objetivo es practicar clases, objetos, metodos y flujo de menus en consola.

## Funcionalidades
- Registro e inicio de sesion de usuario.
- Recarga de dinero en cartera.
- Compra de juegos y registro en historial.
- Biblioteca de juegos del usuario.
- Agregar amigos (nombre simple).

## Estructura del proyecto
- Clases/: clases del dominio (Usuario, Cartera, Juego, etc.).
- main/: punto de entrada con menu en consola.

## Requisitos
- Java JDK 8 o superior.

## Como ejecutar
Desde la raiz del proyecto:

1) Compilar todas las clases:

	javac Clases\*.java main\Main.java

2) Ejecutar:

	java -cp . main.Main

## Notas
- Las clases estan en el paquete por defecto (sin package). Si deseas usar paquetes, agrega la declaracion package y ajusta las rutas de compilacion.
