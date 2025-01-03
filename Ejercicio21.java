/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo3;
import java.util.Scanner;
/**
 *
 */
public class Ejercicio21 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado del triangulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado del triangulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado del triangulo: ");
        double lado3 = scanner.nextDouble();

        double perimetro = lado1 + lado2 + lado3;

        double semiperimetro = perimetro / 2.0;

        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        // Mostrar los resultados
        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("Semiperimetro del triangulo: " + semiperimetro);
        System.out.println("Area del triangulo: " + area);

        scanner.close();
    }
}
