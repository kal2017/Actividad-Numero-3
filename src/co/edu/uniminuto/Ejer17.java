
 
package co.edu.uniminuto;

import java.util.Random;

/**
 *
 * @author jjleo
 */
public class Ejer17 {

    /*
     Generar un arreglo unidimensional de 50 posiciones que se llene con
     * valores aleatorios y contar la cantidad de positivos, negativos y
     * ceros del arreglo.
     */
    public static void main(String[] args) {
        // Arreglo Unidimencional
        int[] arreglo = new int[50];
        Random random = new Random();
        //El bucle se ejecutará tantas veces  empezando desde 0
              for (int i = 0; i < arreglo.length; i++) {
              arreglo[i] = random.nextInt(100) - 50;
              }
              int positivos = 0;
              int negativos = 0;
              int ceros = 0;
                  for (int numero : arreglo) {
                   if (numero > 0) positivos++;{
                     if (numero < 0) negativos++;{
                
                for (int num : arreglo) {
                System.out.print(num + " ");
                   }
                   System.out.println("\nCantidad de positivos: " + positivos);
                   System.out.println("Cantidad de negativos: " + negativos);
                   System.out.println("Cantidad de ceros: " + ceros);
                 }
                     
              }  
            
           }
       }
            
   }

    
    