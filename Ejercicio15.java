/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Capitulo4;
import java.util.Scanner;

/**
 *
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int PESOA, PESOB, PESOC, PESOD;
        
        System.out.println("Ingrese el peso de la esfera A: ");
        PESOA = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        PESOB = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        PESOC = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera D: ");
        PESOD = entrada.nextInt();
        
        if (PESOD == PESOA ^ PESOA==PESOC){
            if (PESOD > PESOA){
               System.out.println("La esfera D es la diferente y ");
            }
            else{
               System.out.println("La esfera D es la diferente y ");
            }
        }
        else{
            if (PESOA == PESOB ^ PESOA == PESOD){
                System.out.println("La esfera C es la diferente ");
                if (PESOC > PESOA){
                    System.out.println("y es de mayor peso");
                }
                else{
                    System.out.println("y es de menor peso");
                }
            }
            else{
                if (PESOA == PESOC ^ PESOA == PESOD){
                    System.out.println("La esfera B es la diferente ");
                    if ( PESOB > PESOD){
                        System.out.println("y es de mayor peso ");
                    }
                    else{
                        System.out.println("y es de menor peso");
                    }
                }
                else{
                    System.out.println("La esfera A es la diferente ");
                    if ( PESOA > PESOB){
                        System.out.println("y es de mayor peso");
                    }
                    else{
                        System.out.println("y es de menor peso");
                    }
                }
            }
        }

    }
    
}
