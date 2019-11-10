/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

//Ejercicio 7 Unidad 4
/*
7. La Ley de Morgan simplifica las expresiones condicionales de la siguiente forma:
!(condition1 && condition2) es equivalente a !condition1 || !condition2
!(condition1 || condition2) es equivalente a !condition1 && !condition2
Verifica que:
*/
import java.util.Scanner;
public class Unidad4Ejercicio7{
    public static void main(String[] args){
       float numero;      
      
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextFloat();
        
        if (!(numero % 2 == 0 && numero % 3 == 0)){
             System.out.println("este numero no es divisible por 2 y por 3: " + numero);
        }
        else 
             System.out.println("este numero  es divisible por 2 y por 3: " + numero); 
            

        if (numero % 2 != 0 || numero %3 != 0){
             System.out.println("este numero no es divisible por 2 y por 3 (ambos): " + numero);
        }
        else 
             System.out.println("este numero  es divisible por 2 y por 3 (<ambos): " + numero); 
             }
             }
//es igual

/*
        if (!(numero == 2 || numero == 3)){
             System.out.println("este numero no es igual a 2 o 3: " + numero);
        }
        else 
             System.out.println("este numero  es igual a 2 o 3: " + numero); 
            

        if (numero != 2 && numero != 3){
             System.out.println("este numero no es igual a 2 o 3: " + numero);
        }
        else 
             System.out.println("este numero es igual a 2 y por 3: " + numero); 
             }
             }
//es igual



*/