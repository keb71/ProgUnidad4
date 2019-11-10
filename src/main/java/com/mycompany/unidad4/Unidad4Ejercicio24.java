/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad4;


24. ¿Son correctos estos caracteres?
'1', '\u345dE', '\u3fFa', '\b', '\t'

jshell> '1'
$1 ==> '1'

jshell> '\u345dE'
|  Error:
|  unclosed character literal
|  '\u345dE'
|  ^
|  Error:
|  unclosed character literal
|  '\u345dE'
|          ^
|  Error:
|  reached end of file while parsing
|  '\u345dE'

jshell> '\u3fFa'(caracter chino)
$2 ==> '㿺'

jshell> '\b'(backspace)
$3 ==> '\b'

jshell> '\t' (tab horizontal)
$4 ==> '\t'




