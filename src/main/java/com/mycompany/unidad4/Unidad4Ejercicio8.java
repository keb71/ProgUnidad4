/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;

﻿8. x e y son tipos int, qué sentencias son legales:
a- x > y > 0
b- x = y && y
c- x /= y
d- x or y
e- x and y
f- (x != 0) || (x = 0)

a-
jshell> int x = 2;
x ==> 2

jshell> int y = 4;
y ==> 4

jshell> x > y > 0
|  Error:
|  bad operand types for binary operator '>'
|    first type:  boolean
|    second type: int
|  x > y > 0
|  ^-------^

b-
jshell> int x = 3;
x ==> 3

jshell> int y =5;
y ==> 5

jshell> x = y && y
|  Error:
|  bad operand types for binary operator '&&'
|    first type:  int
|    second type: int
|  x = y && y
|      ^----^

c-
jshell> int x = 4;
x ==> 4

jshell> int y = 2;
y ==> 2

jshell> x /= y
$8 ==> 2

d-
jshell> int x = 4;
x ==> 4

jshell> int y = 2;
y ==> 2

jshell> x or y
|  Error:
|  ';' expected
|  x or y;

e-
jshell> int x = 4;
x ==> 4

jshell> int y =2;
y ==> 2

jshell> x and y
|  Error:
|  ';' expected
|  x and y;

f-
jshell> int x = 4;
x ==> 4

jshell> (x != 0) || (x = 0)
|  Error:
|  bad operand types for binary operator '||'
|    first type:  boolean
|    second type: int
|  (x != 0) || (x = 0)
|  ^-----------------^

jshell> 


