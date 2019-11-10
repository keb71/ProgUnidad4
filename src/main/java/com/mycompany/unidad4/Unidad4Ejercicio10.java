/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;


//Ejercicio 10 Unidad 4
/*
10. Cuál es el valor de x >= 50 && x <= 100 si x es 45, 67, 101
la respuesta es 67 ya que la condicion es un numero mayor/igual de 50 y menor/igual de 100
*/
    
    import java.util.Scanner;
public class Unidad4Ejercicio10{
    public static void main(String[] args){
       int x; 
     
            Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese un número: \n 45 \n 67 \n 101  ");
        x = entrada.nextInt();
       
        
        if (x >= 50 && x <= 100){
             System.out.println("es el numero: " + x);
        }
        else 
             System.out.println("no es el numero");
             }
             }