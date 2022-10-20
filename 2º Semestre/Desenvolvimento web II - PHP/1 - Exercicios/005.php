<?php
/*
Escreva um script que imprima qual o maior número.
Use IF .. ELSE
*/
$a = 10;
$b = 1;
$c = 40;

if($a > $b){
    if($a > $c){
        echo 'Maior valor: '.$a;
    }
    else{
        echo 'Maior valor: '.$c;
    }
}
else{
    if($b > $c){
        echo 'Maior valor: '.$b;
    }
    else{
        echo 'Maior valor: '.$c;
    }
}

?>