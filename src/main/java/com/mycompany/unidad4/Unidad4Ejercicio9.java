/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

//Ejercicio 9 Unidad 4
/*
9. Son las dos expresiones lo mismo:
(a) x % 2 == 0 && x % 3 == 0
(b) x % 6 == 0
*/
    
import java.util.Scanner;
public class Unidad4Ejercicio9{
public static void main(String[] args){
       int x; 
     
            Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese un número:  ");
        x = entrada.nextInt();
       
        
        if (x % 2 == 0 && x % 3 == 0){
             System.out.println("el numero es divisible por 2 y por 3 (ambos): " + x);
        }
        else 
             System.out.println("el numero no es divisible por 2 y por 3(ambos): " + x);
            

        if (x % 6 == 0){
             System.out.println("el numero es divisible por 6: " + x);
        }
        else 
             System.out.println("el numero no es divisible por 6: " + x);
             }
             }
//las dos son expresiones iguales