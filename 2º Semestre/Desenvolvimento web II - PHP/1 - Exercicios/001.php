<?php
/*
Variáveis 
*/

$variavel_1 = 'texto';
// Imprimir o valor a variável e o seu tipo
echo $variavel_1.'<br/>';
echo '$variavel_1 <br/>';
echo gettype($variavel_1).'<br/>';
var_dump($variavel_1);
echo '<br/><br/>';

$variavel_2 = 123;
// Imprimir o valor a variável e o seu tipo
echo $variavel_2.'<br/>';
echo '$variavel_2 <br/>';
echo gettype($variavel_2).'<br/>';
var_dump($variavel_2);
echo '<br/><br/>';

$variavel_3 = 1;
// Imprimir o valor a variável e o seu tipo
echo $variavel_3.'<br/>';
echo '$variavel_3 <br/>';
echo gettype($variavel_3).'<br/>';
var_dump($variavel_3);
echo '<br/><br/>';

$array = [
    "foo" => "bar",
    "bar" => "foo",
];
// Imprimir o valor a variável e o seu tipo
print_r($array); echo '<br/>';
echo '$array <br/>';
echo gettype($array).'<br/>';
var_dump($array);
echo '<br/><br/>';

?>