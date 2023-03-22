/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_1;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Ejercicio1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int num1 = 0,num2 = 0, resultado = 0;
        System.out.println("Ingrese 2 numeros enteros");
        
        num1 = dato.nextInt();
        num2 = dato.nextInt();
        resultado = num1 + num2;
        
        System.out.println("La suma da  " + resultado);
    }
    
}
