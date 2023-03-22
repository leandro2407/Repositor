/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Ejercicio1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int num=0, doble=0, triple=0, raiz=0;
        System.out.println("Ingrese un numero entero");
        num= datos.nextInt();
        
        doble= num*2;
        triple=num*3;
        raiz= (int) sqrt(num);
        System.out.println("El doble es, "+ doble + " el triple es: " + triple + " y la raiz es : "+ raiz);
    }
    
}
