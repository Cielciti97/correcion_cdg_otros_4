Este código simula el juego de piedra, papel o tijeras en JAVA.

Aquí están las correcciones que hice para que funcione:

1. Agregué `import java.util.Scanner;` al inicio del código para importar la clase Scanner.
2. Cambié el segundo mensaje de "Turno del jugador 1" a "Turno del jugador 2".
3. Usé el mismo objeto Scanner `s` para leer la entrada del jugador 2.
4. Reemplacé `j1 == j2` por `j1.equals(j2)` para comparar correctamente las cadenas en Java.
5. Agregué `break;` después de cada caso en el switch para evitar que se ejecuten múltiples casos.
6. Reemplacé `j2 == "tijeras"` y `j2 == "piedra"` por `j2.equals("tijeras")` y `j2.equals("piedra")` respectivamente.
7. Agregué un caso `default` para manejar entradas no válidas.
8. Encerré todo el código en una clase y un método principal para que pueda ejecutarse.
