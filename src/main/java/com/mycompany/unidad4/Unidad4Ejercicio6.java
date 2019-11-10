/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

//Ejercicio 6 Unidad 4
/*
6. Crea un programa que verifique si un número es divisible por 2 y por 3 a la vez, por 2 ó por
3, y por 2 ó 3 pero no ambos.
*/
import java.util.Scanner;
public class Unidad4Ejercicio6{
    public static void main(String[] args){
       float numero;      
      
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextFloat();
        
        if (numero % 2 == 0 && numero % 3 == 0){
             System.out.println("este numero es divisible por 2 y por 3: " + numero);
             }
        else 
             System.out.println("este numero no es divisible por 2 y por 3: " + numero);       

        

        if (numero % 2 == 0 || numero % 3 == 0){
             System.out.println("este numero es divisible por 2 o  por 3: " + numero);
             }
        else 
             System.out.println("este numero no es divisible por 2 ni por 3: " + numero);
        
        
          
        if (numero % 2 == 0 ^ numero % 3 == 0){
             System.out.println("este numero es divisible por 2 o por 3 pero no por ambos: " + numero);
             }
        else 
             System.out.println("este numero es divisible por ambos: " + numero);
        
              }
        }