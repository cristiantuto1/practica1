/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinmartin_martingonzalez_primos3;

import java.util.Scanner;

public class MARTINMARTIN_MARTINGONZALEZ_Primos3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero");
        float numero = teclado.nextFloat();
        int temp = 3;
        boolean res = false;
        double raiz = Math.sqrt(numero);
                
        for (int i = 0; i < raiz; i++) {

            if (numero > 5 && numero  % 5 == 0) {

            } else {
                for (int j = 0; j < 3; j++) {
                    temp = temp + 2;

                    if (numero == temp) {
                        res = true;
                    }
                }
                temp = temp + 4;
                if (numero == temp) {
                    res = true;
                }
                
            }

        }

        if (res == true) {
            System.out.println("El numero es primo");

        } else {
            System.out.println("El numero no es primo");
        }

    }

}
// // 1 2 2 4 2 4 2 2 4 4
