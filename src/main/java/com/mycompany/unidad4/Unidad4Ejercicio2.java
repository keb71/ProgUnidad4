/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

//Ejercicio 2 Unidad 4
/*
2. Según el código siguiente muestra las salidas para x = 2, y = 3. Para x = 3, y = 2. Y para x = y =3.
*/
public class Unidad4Ejercicio2{
	public static void main(String[] args){
        int x = 2;
        int y = 3;
       
        if (x > 2)
            if (y > 2) {
                int z = x + y;
                System.out.println("z es " + z);
                }
                else
                System.out.println("x es " + x);        
    	
	}
}
//no se imprime nada. Termina programa porque el primer if es falso


        /*

public class Unidad4Ejercicio1{
	public static void main(String[] args){
        int x = 3;
        int y = 3;
       
        if (x > 2)
            if (y > 2) {
                int z = x + y;
                System.out.println("z es " + z);
                }
                else
                System.out.println("x es " + x);        
    	
	}
}
//x es 3 lo que imprime
/*
el primer if es verdadero y ejecuta el segundo if, al ser falso sale el programa por else u se ejecuta imprimiendo 
*/

/*

public class Unidad4Ejercicio1{
	public static void main(String[] args){
        int x = 3;
        int y = 2;
       
        if (x > 2)
            if (y > 2) {
                int z = x + y;
                System.out.println("z es " + z);
                }
                else
                System.out.println("x es " + x);        
    	
	}
}
//z es 6 lo que imprime
/*
el primer if es verdadero, el segundo if es verdadero y se ejecuta la suma y se imprime el resultado
*/

        */