/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo3;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el codigo del empleado: ");
        int codigoempleado = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el nombre del empleado: ");
        String nombreempleado = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas al mes: ");
        double horastrabajadas = scanner.nextDouble();

        System.out.print("Ingrese el valor de la hora trabajada: ");
        double valorhoratrabajada = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de retencion en la fuente: ");
        double porcentajeretencion = scanner.nextDouble();

     
        double salariobruto = horastrabajadas * valorhoratrabajada;

     
        double retencionfuente = (salariobruto * porcentajeretencion) / 100;

      
        double salarioneto = salariobruto - retencionfuente;

        
        System.out.println("Co001digo del empleado: " + codigoempleado);
        System.out.println("Nombre del empleado: " + nombreempleado);
        System.out.println("Salario Bruto: $" + salariobruto);
        System.out.println("Salario Neto: $" + salarioneto);

        scanner.close();
    }
    
}
