package com.mycompany.unidad4;
//Ejercicio 20 Unidad 4
/*22. Una empresa de transporte utiliza la siguiente función para calcular 
el cose en USD$ de transporte basado en su peso en libras. Escribe el programa 
que permita que el usuario introduzca el peso del packete y mueste el coste de 
transporte. Si el peso es > 20, muestra el mensaje "el paquete no puede ser
enviado".*/

import java.util.Scanner;
public class Unidad4Ejercicio22 {
public static void main(String[] args) {


 double peso;
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese el peso del envio:  ");
        peso = entrada.nextDouble();
       
        double precioTotal;
       
           if(peso <= 2){
               double precio = 2.5;
                precioTotal = precio * peso;
                System.out.println("Su presio es:  " + precioTotal);
           }
           else  if( peso <= 4){
               double precio = 4.5;
               precioTotal = precio * peso;
                System.out.println("Su presio es:  " + precioTotal);
           }
            else  if(peso <= 10){
                  double precio = 7.5;
               precioTotal = precio * peso;
                System.out.println("Su presio es: " + precioTotal);
           }
            else  if(peso <= 20){
                  double precio = 10.5;
               precioTotal = precio * peso;
                System.out.println("Su presio es:  " + precioTotal);
           }
            else  {
                System.out.println("Su envio excede el peso, no podemos realizarlo");
           }
}
}
