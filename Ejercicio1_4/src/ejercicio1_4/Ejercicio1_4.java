/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_4;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Ejercicio1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double c, f;
        
        System.out.println("Ingrese una cantidad de grados centigrados.");
        
        c= datos.nextDouble();
        
        f= 32+(9*c/5);
        
        System.out.println("La equilavencia en grados Farenheit es: " + f);
        
        
// TODO code application logic here
    }
    
}
