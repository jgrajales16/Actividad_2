/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;

/**
 *
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int VALCOMP, VALPAG, PDES;
        String COLOR;
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la compra: ");
        VALCOMP = entrada.nextInt();
        
        System.out.println("Ingrese el color de la bola: ");
        COLOR = entrada2.nextLine();
        
        if (COLOR.equals("BLANCO")){
            PDES=0;
        }
        else if (COLOR.equals("VERDE")){
            PDES=10;
        }
        else if (COLOR.equals("AMARILLO")){
            PDES=25;
        }
        else if (COLOR.equals("AZUL")){
            PDES=50;
        }
        else{
            PDES=100;
        }
        
        VALPAG=VALCOMP-((PDES*VALCOMP)/100);
        System.out.println("El cliente debe pagar: "+ VALPAG);

    }
    
}
