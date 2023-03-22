/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_1;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Ejercicio2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
    
    int c=0, f=0;
        
    System.out.println("Ingrese la cantidad de grados centigrados.");
    c= datos.nextInt();
    f= 32+(9*c/5);
    System.out.println("El equivalente de grados Fahenheit es:" +f);

    }
    
}
