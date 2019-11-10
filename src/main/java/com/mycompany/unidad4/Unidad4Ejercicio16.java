package com.mycompany.unidad4;
//Ejercicio 16 Unidad 4
/*
Qué vale x al finalizar la sentencia if-else . Reescribe el código con switch y
haz un diagrama de flujo ilustrando el funcionamiento.
*/
    

public class Unidad4Ejercicio16{
public static void main(String[] args){
   int x = 1;
   int a = 3;
if (a == 1)
x += 5;
else if (a == 2)
x += 10;
else if (a == 3)
x += 16;
else if (a == 4)
x += 34;
}
}

//x vale 17 ya que se le tiene que sumar uno antes de dar el resultado, 1 + 16 = 17

/*switch(a){
case1:x += 5; 
break;
case2:x += 10; 
break;
case3:x += 16; 
break;
case4:x += 34;
}*/