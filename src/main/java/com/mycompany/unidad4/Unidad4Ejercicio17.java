package com.mycompany.unidad4;
//Ejercicio 17 Unidad 4
/*
17. Cuál es la siguiente salida del programa introduciendo como valores 2, 3 y 6
*/
    

import java.util.Scanner;
public class Unidad4Ejercicio17 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double x = input.nextDouble();
double y = input.nextDouble();
double z = input.nextDouble();
System.out.println((x < y && y < z) ? "ordenado" : "no ordenado");
}
}
