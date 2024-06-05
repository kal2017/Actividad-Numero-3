

package co.edu.uniminuto;

import java.util.Scanner;

/**
 *
 * @author jjleo
 */
public class Ejer15 {

    /*Realizar un programa que genere una matriz 5x6 y se rellene
     * dinámicamente con los números impares partiendo desde n (n es dada
     * por el usuario) y se imprima.*/
     
     
    public static void main(String[] args) {
        // Matriz 5*6 relleno dinamico
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de 1:");
        int n = scanner.nextInt();
        int[][] matriz = new int[5][6];// Esta línea crea una matriz bidimensional de enteros llamada matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i * 6 + j >= n){
                    matriz[i][j] = i * 6 + j + 1;
                } else matriz[i][j] = 0;  {
                    
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (matriz[i][j] != 0) {
                    System.out.print(matriz[i][j] + "  ");
                } else { // El else en el código es utilizado para especificar una condición alternativa
                    System.out.print("  0  ");
                }// imprimir 
            }
            System.out.println();
        }
    }
}
    
    

