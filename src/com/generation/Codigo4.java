/*
 * Aquí están las correcciones que hice:

1. Agregué import java.util.Scanner; al inicio del código para importar la clase Scanner.

2. Cambié el segundo mensaje de “Turno del jugador 1” a “Turno del jugador 2”.

3. Usé el mismo objeto Scanner s para leer la entrada del jugador 2.

4. Reemplacé j1 == j2 por j1.equals(j2) para comparar correctamente las cadenas en Java.

5. Agregué break; después de cada caso en el switch para evitar que se ejecuten múltiples casos.

6. Reemplacé j2 == "tijeras" y j2 == "piedra" por j2.equals("tijeras") y j2.equals("piedra") respectivamente.

7. Agregué un caso default para manejar entradas no válidas.

8. Encerré todo el código en un método MAIN para que pueda ejecutarse.
 * 
 * 
 * 
 */
 /* Mejoras posibles para implementar en el código
  * 
  * Utilizar nombres de variables más descriptivas
  * 
  * Aunque el codigo ya funciona, si c debe aplicar una validación de las entradas, 
  * ya que si ingreso una palabra bien y la otra mal, en automatico gana el jugador 2, 
  * por lo que es un error si un usuario no se apega a la indicacion de 
  * de sólo escribir piedra, papel o tijeras.
  * 
  */

// Descripción comentada del codigo4

package com.generation;

//Importa la clase Scanner del paquete java.util, que se utiliza para obtener la entrada del usuario.
import java.util.Scanner;

//Define una clase pública llamada Codigo4.
public class Codigo4 {

 // Define el método principal que se ejecuta cuando se inicia el programa.
 public static void main(String[] args) {
     // Crea un nuevo objeto Scanner para leer la entrada del usuario.
     Scanner s = new Scanner(System.in);

     // Imprime un mensaje pidiendo al jugador 1 que introduzca su elección.
     System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
     // Lee la elección del jugador 1 de la entrada del usuario.
     String j1 = s.nextLine();

     // Imprime un mensaje pidiendo al jugador 2 que introduzca su elección.
     System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
     // Lee la elección del jugador 2 de la entrada del usuario.
     String j2 = s.nextLine();

     // Comprueba si las elecciones de los dos jugadores son iguales.
     if (j1.equals(j2)) {
         // Si son iguales, imprime un mensaje diciendo que es un empate.
         System.out.println("Empate");
     } else {
         // Si no son iguales, asume que el jugador 2 gana y establece g en 2.
         int g = 2;
         // Comprueba la elección del jugador 1.
         switch(j1) {
             // Si el jugador 1 eligió "piedra"...
             case "piedra":
                 // ...y el jugador 2 eligió "tijeras", entonces el jugador 1 gana.
                 if (j2.equals("tijeras")) {
                     g = 1;
                 }
                 // Rompe el caso para que no se ejecuten los siguientes casos.
                 break;

             // Si el jugador 1 eligió "papel"...
             case "papel":
                 // ...y el jugador 2 eligió "piedra", entonces el jugador 1 gana.
                 if (j2.equals("piedra")) {
                     g = 1;
                 }
                 // Rompe el caso para que no se ejecuten los siguientes casos.
                 break;

             // Si el jugador 1 eligió "tijeras"...
             case "tijeras":
                 // ...y el jugador 2 eligió "papel", entonces el jugador 1 gana.
                 if (j2.equals("papel")) {
                     g = 1;
                 }
                 // Rompe el caso para que no se ejecuten los siguientes casos.
                 break;

             // Si el jugador 1 no eligió "piedra", "papel" ni "tijeras"...
             default:
                 // ...imprime un mensaje de error y termina el programa.
                 System.out.println("Entrada no válida");
                 return;
         }
         // Imprime un mensaje diciendo qué jugador ganó.
         System.out.println("Gana el jugador " + g);
     }
 }
}
