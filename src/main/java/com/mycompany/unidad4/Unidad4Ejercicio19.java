/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;


19. Reescribe los siguientes códigos utilizando sentencias if-else
a. score = (x > 10) ? 3 * scale : 4 * scale;

if(x > 10){
score = 3 * scale;
}
else  
score = 4 * scale;

b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
if(income > 10000){
tax = income *0.2
}
else
tax = income *0.17 + 1000;

c. System.out.println((number % 3 == 0) ? i : j);
if(number % 3 == 0){
System.out.println(i);
}
else
System.out.println(j);