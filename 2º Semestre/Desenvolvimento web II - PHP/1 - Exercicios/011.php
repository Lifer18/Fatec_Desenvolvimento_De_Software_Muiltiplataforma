<?php
/*
Faça o cálculo da média simples de 
$nota_1 e $nota_2.
Imprima a média simples.
Imprima a condição:
    Se a média menor ou igual a 4.9, reprovado.
    Se a média entre 5 e 7, recuperação.
    Se a média acima de 7, aprovado.

Crie uma função com o nome calculo_media.
Use tipagem estrita e limite os parâmetros a receber float.
*/
function calculo_media(float $nota_1,float $nota_2){
    $media = ($nota_1 + $nota_2) / 2;
    return $media;
}


$nota_1 = 9;
$nota_2 = 4;

echo '1ª nota: '.$nota_1.'<br/>';
echo '2ª nota: '.$nota_2.'<br/>';
$media = calculo_media($nota_1,$nota_2);
echo 'Média: '.$media.'<br/>';

if($media < 5){
    echo 'Aluno reprovado';
}
else if($media >= 5 && $media <=7){
    echo 'Aluno de recuperação';
}
else{
    echo 'Aluno aprovado';
}


?>