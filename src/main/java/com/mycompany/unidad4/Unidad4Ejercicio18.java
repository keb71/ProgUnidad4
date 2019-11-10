package com.mycompany.unidad4;
//Ejercicio 18 Unidad 4
/*
18. Reescribe el siguiente código con operador condicional
*/
import java.util.Scanner;
public class Unidad4Ejercicio18 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double ages = input.nextDouble();


System.out.println((ages < 16 && ages >= 16) ? "10" : "20");
}
}
