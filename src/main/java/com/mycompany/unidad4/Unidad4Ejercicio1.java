/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;
//Ejercicio 1 Unidad 4
/*
1. Según este código muestra las salidas para x = 3, y = 2. Para x = 3, y = 4. Para x = 2, y = 2.
*/
public class Unidad4Ejercicio1{
	public static void main(String[] args){
        int x = 3;
        int y = 2;
        int z;
        if (x > 2) {
            if (y > 2) {
            z = x + y;
            System.out.println("z es " + z);
            }
        //     else
        //    System.out.println("hola");
        }
        else
            System.out.println("x es " + x);
    	
	}
}
/*al no tener else el segundo if, al ser falso termina programa*/




/*

public class Unidad4Ejercicio1{
	public static void main(String[] args){
        int x = 3;
        int y = 4;
        int z;
        if (x > 2) {
            if (y > 2) {
            z = x + y;
            System.out.println("z es " + z);
            }
        //     else
        //    System.out.println("hola");
        }
        else
            System.out.println("x es " + x);
    	
	}
}
//z es 7 lo que imprime
//al ser verdad los dos if se realiza la operacion de suma y te da el resultado


public class Unidad4Ejercicio1{
	public static void main(String[] args){
        int x = 2;
        int y = 2;
        int z;



*/