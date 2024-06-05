/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto;

import java.util.Random;

/**
 *
 * @author jjleo
 */
public class Ejer14 {

    /**
     Realizar un programa que genere un arreglo de 50 posiciones y se rellene
     * de con la función ramdom de Java (los números deben ser 1 a 99), luego
     * de llenar hacer la impresión de la matriz.
     * @param args
     */
    public static void main(String[] args) {
        // funcion de 50 posiciones numeros aleatorios
        int[][] matriz = new int[5][10];
        Random random = new Random();
        int i = 0, j = 0;

        // Llenar la matriz con numeros del 1 al 99
        do {
            do {
                matriz[i][j] = random.nextInt(99) + 1;
                j++;
            } while (j < matriz[i].length);
            j = 0;
            i++;
        } while (i < matriz.length);

        // Impresion de la matriz
        System.out.println("Matriz generada:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.printf("%02d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
        
        
        
        
    
    

