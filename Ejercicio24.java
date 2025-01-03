/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;

/**
 *
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int Esfera1, Esfera2, Esfera3;
        
        System.out.println("Ingrese el peso de la esfera 1: ");
        Esfera1 = entrada.nextByte();
        
        System.out.println("Ingrese el peso de la esfera 2: ");
        Esfera2 = entrada.nextByte();
        
        System.out.println("Ingrese el peso de la esfera 3: ");
        Esfera3 = entrada.nextByte();
        
        if ((Esfera1 > Esfera2) && (Esfera1 > Esfera3)){
            System.out.println("La esfera 1 es la de mayor peso");
        }
        else if ((Esfera2 > Esfera1) && (Esfera2 > Esfera3)){
            System.out.println("La esfera 2 es la de mayor peso");
        }
        else if ((Esfera3 > Esfera1) && (Esfera3 > Esfera2)){
            System.out.println("La esfera 3 es la de mayor peso");
        }
        else{
            System.out.println("Las esferas no tienen diferente peso");
        }

    }
    
}
