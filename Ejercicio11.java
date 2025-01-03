/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;

/**
 *
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        int mayor = numero1; 

        if (numero2 > mayor) {
            mayor = numero2; 
        }

        if (numero3 > mayor) {
            mayor = numero3; 
        }

      
        System.out.println("El valor mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);

        scanner.close();
    }
    
}
