package com.mycompany.unidad4;
//Ejercicio 14 Unidad 4
/*
Escribir un programa que calcule cuál es el horóscopo chino de un usuario.  
El horóscopo chino se basa en el cálculo de un animal para cada año de 
nacimiento del usuario mediante anyoNacimiento %12. Con lo que si alguien 
nación en 1970, el resto es 2 con lo cual es el perro en su signo zodiacal 
chino.  Podéis utilizar switch.
*/
    
import java.util.Scanner;

public class Unidad4Ejercicio14{
public static void main(String[] args){
           int anioNacimiento; 
       
           Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese su año de nacimiento:  ");
        anioNacimiento = entrada.nextInt();
           int resto = anioNacimiento %12;
      switch (resto){
case 0:
	System.out.println("Su horóscopo chino es Monkey");
break;
case 1:
	System.out.println("Su horóscopo chino es Rooster");
break;
case 2:
	System.out.println("Su horóscopo chino es Dog");
break;
case 3:
	System.out.println("Su horóscopo chino es Pig");
break;
case 4:
	System.out.println("Su horóscopo chino es Rat");
break;
case 5:
	System.out.println("Su horóscopo chino es Ox");
break;
case 6:
	System.out.println("Su horóscopo chino es Tiger");
break;
case 7:
	System.out.println("Su horóscopo chino es Rabbit");
break;
case 8: 
	System.out.println("Su horóscopo chino es Dragon");
break;
case 9:
	System.out.println("Su horóscopo chino es Snake");
break;
case 10:
	System.out.println("Su horóscopo chino es  Horse");
break;
case 11:
	System.out.println("Su horóscopo chino es Sheep");
break;

}
}
}