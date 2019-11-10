/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;


//Ejercicio 11 Unidad 4
/*
11. Cuál es el resultado del siguiente programa con datos introducidos 2, 3 y 6
*/
//public class Test {
public class Unidad4Ejercicio11{
public static void main(String[] args) {
java.util.Scanner input = new java.util.Scanner(System.in);
double x = input.nextDouble();
double y = input.nextDouble();
double z = input.nextDouble();
System.out.println("(x < y && y < z) is " + (x < y && y < z));
System.out.println("(x < y || y < z) is " + (x < y || y < z));
System.out.println("!(x < y) is " + !(x < y));
System.out.println("(x + y < z) is " + (x + y < z));
System.out.println("(x + y > z) is " + (x + y > z));
}
}
/*
Esto es lo que imprime
(x < y && y < z) is true
(x < y || y < z) is true
!(x < y) is false
(x + y < z) is true
(x + y > z) is false

*/