/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;
/**
 *
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor de la hora normal de trabajo: ");
        double valorHoraNormal = scanner.nextDouble();

        
        double salario = 0;

        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            if (horasExtras > 8) {
                int horasExtrasExcedentes = horasExtras - 8;
                salario = (40 * valorHoraNormal) + (8 * valorHoraNormal * 2) + (horasExtrasExcedentes * valorHoraNormal * 3);
            } else {
                salario = (40 * valorHoraNormal) + (horasExtras * valorHoraNormal * 2);
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }

        System.out.println("EL TRABAJADOR " + nombre + " DEVENGO: $" + salario);

        scanner.close();
    }
    
}
