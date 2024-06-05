

package co.edu.uniminuto;

import java.util.Scanner;

/**
 *
 * @author jjleo
 */
public class Ejer2 {
    /*Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 
    (para ser sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) 
    comprendidos entre 1 y n (n es determinado por el usuario). Imprimir 
    la cantidad de múltiplos de 5 y 3.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;//Numero ingresado por el usuario hasta donde se evaluara
        int multiplo = 0;//Acumular la suma de multiplos de 5 y 3
        int control = 1;
        int acumuladorMultiplo = 0;
        System.out.println("Dame un numero");
        numero=leer.nextInt();
        do{
            if(control % 5==0){
                if(control % 3==0){
                    multiplo+=control;
                    acumuladorMultiplo++;
                          
                }
                
            }
            control++;    
                
        }while(control<=numero);
        System.out.println(multiplo+" "+acumuladorMultiplo);
        
    }
    
}
