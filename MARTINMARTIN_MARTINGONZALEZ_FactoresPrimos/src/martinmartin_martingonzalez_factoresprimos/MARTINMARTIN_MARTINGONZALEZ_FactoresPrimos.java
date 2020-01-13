/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinmartin_martingonzalez_factoresprimos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MARTINMARTIN_MARTINGONZALEZ_FactoresPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean esPrimo = true;
        
        Scanner teclado  = new Scanner (System.in);
        
        
        System.out.println("Introduce un numero ");
        long numero = teclado.nextLong();
        
        do {
            for (long i = 2; i <= numero; i++) {
            if (numero%i==0) {
                System.out.println(i);
                numero=numero/i;
                i--;
            }
        }
        } while (numero!=1);
        
        
        
        
    }
    
}
