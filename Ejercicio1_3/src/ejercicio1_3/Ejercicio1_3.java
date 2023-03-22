/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author leand
 */
public class Ejercicio1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase");
        cadena= leer.nextLine();
        System.out.println(toUpperCase(cadena));
        System.out.println(toLowerCase(cadena));
    }
    
}
