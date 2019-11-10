package com.mycompany.unidad4;
//Ejercicio 15 Unidad 4
/*
Reescribe el código con sentencia if-else
x = 3; y = 3;
switch (x + 3) {
case 6: y = 1;
default: y += 1;
}
*/
    

public class Unidad4Ejercicio15{
public static void main(String[] args){
       int x= 3; 
       int y= 3; 
       
      /* switch (x + 3) {
       case 6:System.out.println(" y = 1") ;
       break;
       default: System.out.println(y += 1);
        }*/
       if(x + 3 == 6){
          System.out.println(" y = 1") ; 
       }else 
          System.out.println(y += 1); 
}
}
