
package co.edu.uniminuto;

import java.util.Scanner;

/**
 *
 * @author jjleo
 */
public class Ejer7 {

    /*Realizar un programa en Java que dado n cantidad de números determine si 
    es primo o no y si ese número primo es múltiplo de 3, se debe contar. 
    Imprimir cantidad de primos y cantidad de múltiplos de 3     */
    public static void main(String[] args) {
        // Numeros primos multiplos de 3
        Scanner leer = new Scanner(System.in);
        int numero;
        int contadorPrimos = 0;
        int contadorMultiplosDeTres = 0;
        //Lectura de numero
        System.out.print("Dame un numero:");
        numero = leer.nextInt();
        for (int i = 0; i <= numero; i++) {
            if (esNumeroPrimo(i)) {
                if (i % 3 == 0) {
                    contadorMultiplosDeTres++;
                }
                contadorPrimos++;
                System.out.print(i + " ");
            }
        }
        System.out.println("numerosPrimos: " + contadorPrimos);
        System.out.println("Multiplos de 3: " + contadorMultiplosDeTres);
    }
   // public: este modificador de acceso indica que el método o la variable es.
   // static:modificador indica que el método o la variable pertenece a la clase en sí misma
   // boolean :Este es el tipo de retorno del método o el tipo de la variable. 
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false; 
            //
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false; // El número no es positivo
            }
        }
        return true; //El numero es positivo
    }
}
        
    
    


    
   

