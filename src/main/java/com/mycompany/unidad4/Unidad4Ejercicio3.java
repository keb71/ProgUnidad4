/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

/Ejercicio 3 Unidad 4
/*
3. Qué hay de malo en este código
*/


if (score >= 60)
System.out.println("D");
else if (score >= 70)
System.out.println("C");
else if (score >= 80)
System.out.println("B");
else if (score >= 90)
System.out.println("A");
else
System.out.println("F");     

/*SOLUCION:
que cuando recorremos los else if, el primero abarca todos siempre imprimiria d, 
si es mayor que 60 o si es menor f 
*/
