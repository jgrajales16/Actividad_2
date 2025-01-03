/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;

/**
 *
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int VD1,VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese las ventas del departamento 1: ");
        VD1 = entrada.nextInt();
        
        System.out.println("Ingrese las ventas del departamento 2: ");
        VD2 = entrada.nextInt();
        
        System.out.println("Ingrese las ventas del departamento 3: ");
        VD3 = entrada.nextInt();
        
        System.out.println("Ingrese el salario: ");
        SALAR = entrada.nextInt();
        
        TOTVEN = VD1+VD2+VD3;
        
        PORVEN = (int) (0.33*TOTVEN);
        
        if (VD1>PORVEN){
            SALAR1 = (int) (SALAR+SALAR*0.2);
        }
        else{
            SALAR1=SALAR;
        }
        if (VD2>PORVEN){
            SALAR2 = (int) (SALAR+SALAR*0.2);
        }
        else{
            SALAR2=SALAR;
        }
        if (VD3>PORVEN){
            SALAR3 = (int) (SALAR+SALAR*0.2);
        }
        else{
            SALAR3=SALAR;
        }
        
        System.out.println("Salario vendedores DEPTO. 1: " + SALAR1 + " Salario vendedores DEPTO. 2: " + SALAR2 + " Salario vendedores DEPTO.3: " + SALAR3);

    }
    
}
