/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author f290ti
 */
public class Calculadora {
        
    public void soma(float num1, float num2){
        float soma;
        
        soma = num1+num2;
        
        System.out.println("O resultado e: "+soma);
        
    }
    
    public void subtracao(float num1, float num2, float num3){
        float subtracao, soma;
        
        subtracao = num1-num2;
        
        System.out.println("A subtracao e: "+subtracao);
        
        soma = num3 + subtracao;
        
        System.out.println("O resultado e: "+soma);
        
    }
    
    public float multiplicacao(float num1, float num2){
        float multiplicacao;
        
        multiplicacao = num1*num2;
        
        return multiplicacao;
        
    }
    
    public float divisao(float num1, float num2){
        float divisao;
        
        if(num2==0){
            System.out.println("Impossivel dividir por 0!");
            return 0;
        }
        else{
        divisao = num1/num2;
        return divisao;
        }      
    }
    
}
