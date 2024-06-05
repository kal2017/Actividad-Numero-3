

package co.edu.uniminuto;

import java.util.Scanner;

/**
 *
 * @author jjleo
 */
public class Ejer9 {

    /*
     Leer N cantidad de notas (validar rango de notas), imprimir el promedio 
    de las notas, la nota más alta y la más baja.*/
    public static void main(String[] args) {
        // Promedio de Notas
        int cantidadNotas;
        float promedio; // float Numero Flotante
        float notaMasAlta;
        float notaMasBaja;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        cantidadNotas = scanner.nextInt();
        float[] notas = new float[cantidadNotas];
             for (int i = 0; i < cantidadNotas; i++) {
             System.out.print("Ingrese la nota " + (i + 1) + ": ");
              notas[i] = scanner.nextFloat();
              promedio = 0;
             for (float nota : notas) {
              promedio += nota;
     }
             promedio /= cantidadNotas;
              notaMasAlta = notas[0];
               notaMasBaja = notas[0];
                for (float nota : notas) {
                    if (nota > notaMasAlta) {
             notaMasAlta = nota;
    }
                    if (nota < notaMasBaja) {
                    notaMasBaja = nota;
                         System.out.println("promedio: " + promedio);
                         System.out.println("nota mas alta: " + notaMasAlta);
                         System.out.println("nota mas baja: " + notaMasBaja);
                    }
    
                }

             }

        
    }     
                
       
}
    

