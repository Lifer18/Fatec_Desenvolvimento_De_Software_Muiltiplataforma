<?php
/*
Crie uma função que demonstre 
 - Passagem por valor.
 - Passagem por referência.

 
*/

// $variavel com passagem de valor
function por_valor($variavel, $valor){
    $variavel += $valor;
}
// $variavel com passagem de referência
function por_referencia(&$variavel, $valor){
    $variavel += $valor;
}

$teste = 10;
echo 'Valor inicial: '.$teste.'<br/>';
por_valor($teste, 20);
echo 'Valor após 20 ser passado por valor: '.$teste.'<br/>';
por_referencia($teste, 20);
echo 'Valor após 20 ser passado por referência: '.$teste.'<br/>';

?>