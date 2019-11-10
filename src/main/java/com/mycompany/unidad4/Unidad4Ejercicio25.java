/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;


25. Averigua qué resultado tienen estos castings:
char c = 'A';
jshell> char c ='A'
c ==> 'A'

int i = (int)c;
jshell> int i = (int)c;
i ==> 65

float f = 1000.34f;
jshell> float f = 1000.34f;
f ==> 1000.34

int i = (int)f;
jshell> int i = (int)f;
i ==> 1000

double d = 1000.34;
jshell> double d = 1000.34;
d ==> 1000.34

int i = (int)d;
jshell> int i = (int)d;
i ==> 1000

int i = 97;
jshell> int i = 97;
i ==> 97

char c = (char)i;
jshell> char c = (char)i;
c ==> 'a'

