

package co.edu.uniminuto;

import java.util.Scanner;

/**
 *
 * @author jjleo
 */
public class Ejer3 {

    /*
     Hacer un programa en Java que, dado un rango, por el usuario, se da número
     * inicial y uno final (tomar en cuenta que el inicial debe ser menor que
     * el final, hacer la validación y volver a pedir los dos números si no
     * cumple la condición) y sume los números pares dentro del rango incluyendo
     * el valor inicial y final.
     */
    public static void main(String[] args) {
        // Numero inicial y Numero Final
        int inicio, fin, suma = 0;
        Scanner scanner = new Scanner(System.in);
        boolean numeroValido = false;
        //dato que pueude tener uno o dos valores 
        do{
            System.out.print("Ingrese el numero inicial: ");
             inicio = scanner.nextInt();
             System.out.print("Ingrese el numero final: ");
                fin = scanner.nextInt();
                  if (inicio < fin) {
                      // if condicion si es verdadera 
                      // else codigo ejecutar si la condicion es falsa 
                 }else {
                 System.out.println("Error: El numero inicial debe ser menor que el numero final.");
    }
}                while (!numeroValido);
                 for (int i = inicio; i <= fin; i++) {
                  if (i % 2 == 0) {
                   suma += i;
                    System.out.println("La suma de los numeros pares "
                            + inicio + " a " + fin + " es: " + suma);


}
        }
    }
}
            

            

    
         