/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

/**
 *
 * @author alumnot
 */
    
import java.util.Scanner;
public class Unidad4Ejercicio21{
public static void main(String[] args){
       	int d1; 
	int d2; 
 	int d3; 
 	int d4; 
 	int d5; 
 	int d6; 
 	int d7; 
 	int d8; 
 	int d9;
	int d10;
     
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese 9 números enteros:  ");
        d1 = entrada.nextInt();
        d2 = entrada.nextInt();
	d3 = entrada.nextInt();
	d4 = entrada.nextInt();
	d5 = entrada.nextInt();
	d6 = entrada.nextInt();
	d7 = entrada.nextInt();
	d8 = entrada.nextInt();
	d9 = entrada.nextInt();
	d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11 ;
	
	
        
        if (d10 == 10){
		
             System.out.println("El formato ISBN-10 (International Standard Book Number)es: " + d1+ d2+ d3+ d4+ d5+ d6+ d7+ d8 +d9+ "x");
        }
        else 
           System.out.println("El formato ISBN-10 (International Standard Book Number)es: " + d1+ d2+ d3+ d4+ d5+ d6+ d7+ d8 +d9+ d10);
             }
             }