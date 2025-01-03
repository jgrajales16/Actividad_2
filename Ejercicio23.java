/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;

/**
 *
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);

        int a, b, c;
        double x1, x2, d;

        System.out.print("ingrese valor de a: ");
        a = entrada.nextInt();
        System.out.print("ingrese valor de b: ");
        b = entrada.nextInt();
        System.out.print("ingrese valor de c: ");
        c = entrada.nextInt();

        d = b * b - 4 * a * c;

        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);

        if (d < 0) {
            System.out.println("el resultado es un numero inmaginario");
        } else if (a == 0) {
            System.out.println("el resultado es indeterminado");
        } else {
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }

    }
    
}
