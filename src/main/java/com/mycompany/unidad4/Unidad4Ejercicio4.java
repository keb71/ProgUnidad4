/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

//Ejercicio 4 Unidad 4
/*
4. Escribe un programa que procese la tasa de impuesto de los salarios atendiendo a la
filiación o estado civil. El programa debe preguntar para que el usuario introduzca estado
civil (0 para solteros, 1 para recién casados o viudos, 2 para casados y separados y 3 para
cabeza de familia ) y salario y se procese la tasa total del salario que es el porcentaje del
salario.
*/
import java.util.Scanner;
public class Unidad4Ejercicio4{
    public static void main(String[] args){
       int estado;
       int salario;
      
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Escriba: \n 0 soltero/a \n 1 recién casados o viudo/a \n 2 casados o separados \n 3 cabeza de familia ");
        estado = entrada.nextInt();
      
        
      
               
                       
        if (estado == 0){
               System.out.println("Escriba su salario: ");
               salario = entrada.nextInt();
            if (salario == 0 || salario <= 8350 )
                System.out.println("Su estdo civil es soltera/o y su tasa Imp. es 10%");
            else if (salario <= 33950 )
                System.out.println("Su estdo civil es soltera/o y su tasa Imp. es 15%");
            else if (salario <= 82250 )
                System.out.println("Su estdo civil es soltera/o y su tasa Imp. es 25%");
            else if (salario <= 171550 )
                System.out.println("Su estdo civil es soltera/o y su tasa Imp. es 28%");
            else if (salario <= 372950 )
                System.out.println("Su estdo civil es soltera/o y su tasa Imp. es 33%");
            else if( salario >= 372951)
                System.out.println("Su estdo civil es soltera/o y su tasa Imp. es 35%");
         
       }
        if (estado == 1){
                System.out.println("Escriba su salario: ");
               salario = entrada.nextInt();
            if (salario == 0 || salario <= 8350 )
                System.out.println("Su estdo civil es recién casados o viudo/a y su tasa Imp. es 10%");
            else if (salario <= 33950 )
                System.out.println("Su estdo civil es recién casados o viudo/a y su tasa Imp. es 15%");
            else if (salario <= 68525 )
                System.out.println("Su estdo civil es recién casados o viudo/a y su tasa Imp. es 25%");
            else if (salario <= 104425 )
                System.out.println("Su estdo civil es recién casados o viudo/a y su tasa Imp. es 28%");
            else if (salario <= 186475 )
                System.out.println("Su estdo civil es recién casados o viudo/a y su tasa Imp. es 33%");
            else if (salario >= 186476)
                System.out.println("Su estdo civil es recién casados o viudo/a y su tasa Imp. es 35%");
            
        }
        if (estado == 2){
               System.out.println("Escriba su salario: ");
               salario = entrada.nextInt();
            if (salario == 0 || salario <= 11950 )
                System.out.println("Su estdo civil es casados o separados y su tasa Imp. es 10%");
            else if (salario <= 45500 )
                System.out.println("Su estdo civil es casados o separados y su tasa Imp. es 15%");
            else if (salario <= 117450 )
                System.out.println("Su estdo civil es casados o separados y su tasa Imp. es 25%");
            else if (salario <= 190200 )
                System.out.println("Su estdo civil es casados o separados y su tasa Imp. es 28%");
            else if (salario <= 372950 )
                System.out.println("Su estdo civil es casados o separados y su tasa Imp. es 33%");
            else if(salario >= 372951)
                System.out.println("Su estdo civil es casados o separados y su tasa Imp. es 35%");
            
        }
        if (estado == 3){
                System.out.println("Escriba su salario: ");
               salario = entrada.nextInt();
            if (salario <= 16700 )
                System.out.println("Su estdo civil es cabeza de familia y su tasa Imp. es 10%");
            else if (salario <= 67900 )
                System.out.println("Su estdo civil es cabeza de familia y su tasa Imp. es 15%");
            else if (salario <= 137050 )
                System.out.println("Su estdo civil es cabeza de familia y su tasa Imp. es 25%");
            else if (salario <= 208850 )
                System.out.println("Su estdo civil es cabeza de familia y su tasa Imp. es 28%");
            else if (salario <= 372950 )
                System.out.println("Su estdo civil es cabeza de familia y su tasa Imp. es 33%");
            else if( salario > 372951 )
                System.out.println("Su estdo civil es cabeza de familia y su tasa Imp. es 35%");
        }
        
    }
}