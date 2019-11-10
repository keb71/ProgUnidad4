/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

/*
28. Utilizando la librería Math para pasar a Radianes, Seno, Coseno y Tangente y utilizando
printf realiza un programa que imprima la siguiente tabla, los grados o Degrees es la
columna de los valores iniciales que se deben de tomar para calcular el resto.
*/
public class Unidad4Ejercicio22 {
public static void main(String[] args) {
	int a = 30;
	int b = 60;
	  double ar = Math.toRadians(a);
	  double br = Math.toRadians(b);

        System.out.printf("%s  %s  %s  %s  %s " , "Grados" , "Radianes" , "Seno" , "Coseno", "Tangente \n");
	
	    System.out.printf("%d  %f  %f  %f  %f \n " , a, ar, Math.sin(ar), Math.cos(ar), Math.tan(ar));
	  

    	System.out.printf("%d  %f  %f  %f  %f  \n" , b, br, Math.sin(br), Math.cos(br), Math.tan(br)); 
     
     }
}