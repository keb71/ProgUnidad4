/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;



30. Muestra las salidas de las siguientes sentencias:



jshell> System.out.printf("amount is %f %e\n", 32.32, 32.32);
amount is 32,320000 3,232000e+01
$15 ==> java.io.PrintStream@42e26948


jshell> System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
amount is 32,33% 3,2320e+01
$16 ==> java.io.PrintStream@42e26948


jshell> System.out.printf("%6b\n", (1 > 2));
 false
$17 ==> java.io.PrintStream@42e26948


jshell> System.out.printf("%6s\n", "Java");
  Java
$18 ==> java.io.PrintStream@42e26948


jshell> System.out.printf("%−6b%s\n", (1 > 2), "Java");
|  Exception java.util.UnknownFormatConversionException: Conversion = '−'
|        at Formatter.checkText (Formatter.java:2732)
|        at Formatter.parse (Formatter.java:2708)
|        at Formatter.format (Formatter.java:2655)
|        at PrintStream.format (PrintStream.java:1053)
|        at PrintStream.printf (PrintStream.java:949)
|        at (#19:1)


jshell> System.out.printf("%6b%−8s\n", (1 > 2), "Java");
|  Exception java.util.UnknownFormatConversionException: Conversion = '−'
|        at Formatter.checkText (Formatter.java:2732)
|        at Formatter.parse (Formatter.java:2718)
|        at Formatter.format (Formatter.java:2655)
|        at PrintStream.format (PrintStream.java:1053)
|        at PrintStream.printf (PrintStream.java:949)
|        at (#20:1)


jshell> System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
312.342 315.562,9
$21 ==> java.io.PrintStream@42e26948


jshell> System.out.printf("%05d %06.1f\n", 32, 32.32);
00032 0032,3
$22 ==> java.io.PrintStream@42e26948
