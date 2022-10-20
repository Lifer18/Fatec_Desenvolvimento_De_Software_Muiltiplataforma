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
Crie validações na função, para que os parâmetros aceitos estejam 
entre 0 e 10.
Crie constantes para os limites ( 0 e 10 )
*/

function calculo_media($nota_1,$nota_2){
    if($nota_1 >0 && $nota_1 <=10 && $nota_2 >0 && $nota_2 <=10 ){
    $media = ($nota_1 + $nota_2) / 2;
    return $media;
    }
    else{
    return 'Erro, valores de notas inválidos, insira um número de 0 a 10';
    }
}


$nota_1 = 9;
$nota_2 = 4;

echo '1ª nota: '.$nota_1.'<br/>';
echo '2ª nota: '.$nota_2.'<br/>';
$media = calculo_media($nota_1,$nota_2);
echo 'Média: '.$media.'<br/>';

$checagem = gettype($media);

if($checagem != 'string'){
    if($media < 5){
        echo 'Aluno reprovado';
    }
    else if($media >= 5 && $media <=7){
        echo 'Aluno de recuperação';
    }
    else{
        echo 'Aluno aprovado';
    }
}
else{
    echo 'Erro no calculo da média.';
}

?>