/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;


//Ejercicio 12 Unidad 4
/*
12. Escribe un programa que calcule un año bisiesto. Un año bisiesto es:
si éste es divisible por 4 pero no es divisible por 100.
O si es divisible por 400.
Además un año bisiesto tiene 366 días.
*/
    
    
import java.util.Scanner;
public class Unidad4Ejercicio12{
public static void main(String[] args){
       int anio; 
     
            Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese un año:  ");
        anio = entrada.nextInt();
       
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)){
             System.out.println("Este año es bisiesto: " + anio);
        }
        else 
             System.out.println("Este año no es bisiesto: " + anio);
            

             }
             }
