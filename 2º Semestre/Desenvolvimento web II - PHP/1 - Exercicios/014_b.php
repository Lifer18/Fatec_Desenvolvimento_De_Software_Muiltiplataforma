<?php
/*
Importar a função criada em 014_a.php para ser utilizada aqui.
*/
include '014_a.php';

$nota_1 = 9;
$nota_2 = 4;
$media = calculo_media($nota_1,$nota_2);
echo 'Média 1: '.$media.'<br/>';
// Calcular chamando a função

$nota_1 = 1;
$nota_2 = 5;
$media = calculo_media($nota_1,$nota_2);
echo 'Média 2: '.$media.'<br/>';
// Calcular chamando a função

$nota_1 = 5;
$nota_2 = 3;
$media = calculo_media($nota_1,$nota_2);
echo 'Média 3: '.$media.'<br/>';
// Calcular chamando a função
?>