package com.mycompany.unidad4;

/*

 */

/**
 *
 * @author alumnot
 */

import java.util.Scanner;

public class Unidad4Ejercicio13{
public static void main(String[] args){
       int x; 
       int y; 
        int aleatorio1 = (int)(Math.random()*9); 
        int aleatorio2 = (int)(Math.random()*9); 
     
            Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese un número del 0 al 9:  ");
        x = entrada.nextInt();
         System.out.println("Ingrese otro número del 0 al 9:  ");
        y = entrada.nextInt();
    
        
        if (x == aleatorio1 && y == aleatorio2){
             System.out.println("Usted ha ganado la lotería con 10000€ con los números: " + aleatorio1 + aleatorio2);
        }else if (y == aleatorio1 && x == aleatorio2){
             System.out.println("Usted ha acertado los números de la lotería pero invertidos y ha ganado 3000€ con los números: " + aleatorio2 + aleatorio1);
        }else if (x == aleatorio1 || y == aleatorio2){
             System.out.println("Usted ha acertado con su número " + aleatorio1 + aleatorio2 + " uno de los dos números de la lotería y a ganado 1000€ con el números: " + aleatorio1 + aleatorio2);
        }else 
              System.out.println("Usted no ha acertado los números de la lotería : " + aleatorio1 + aleatorio2);            

             }
             }
