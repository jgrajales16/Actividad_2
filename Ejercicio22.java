/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;

/**
 *
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String Nombre;
        int SalarioHora, HorasTrabajadas, SalarioMensual;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        Nombre = entrada.nextLine();
        
        System.out.println("Ingrese su salario basico por hora: ");
        SalarioHora = entrada.nextByte();
        
        System.out.println("Ingrese el numero trabajado de horas: ");
        HorasTrabajadas = entrada.nextByte();
        
        SalarioMensual = SalarioHora * HorasTrabajadas;
        
        if (SalarioMensual > 450000){
            System.out.println(Nombre + SalarioMensual);
        }
        else{
            System.out.println(Nombre);
        }

    }
    
}
