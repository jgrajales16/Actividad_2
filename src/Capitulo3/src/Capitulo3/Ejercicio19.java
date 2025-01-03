/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo3;
import java.util.Scanner;
/**
 *
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del triangulo equilatero: ");
        double lado = scanner.nextDouble();

        double perimetro = 3 * lado;

        double altura = (Math.sqrt(3) / 2) * lado;

        double area = (Math.sqrt(3) / 4) * lado * lado;

        // Mostrar los resultados
        System.out.println("Perimetro del triangulo equilatero: " + perimetro);
        System.out.println("Altura del triangulo equilatero: " + altura);
        System.out.println("Area del triangulo equilatero: " + area);

        scanner.close();
    }
    
    
}
