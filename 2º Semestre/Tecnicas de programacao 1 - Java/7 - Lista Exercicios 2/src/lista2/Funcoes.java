/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Funcoes {
    
    public static double[] teclado(int quant){
        /*Esse módulo foi um grande teste, queria testar uma função para
        se obter números de um teclado de forma quantitativa, dependendo do que
        o código iria precisar para o cálculo
        
        Se o código necessitar 10 números, esse módulo recebe os 10 e retorna
        os 10 (se houver uma array de acordo no main).
        
        No caso dessa lista, vai utilizar de 1 a 2 números pras questões.
        */
        
        Scanner sc = new Scanner(System.in);
        
        if(quant<1){
            quant=1;
        }
        
        double[] num = new double[quant];
       
        
        if(quant>1){
            for (int count = 0; count < quant; count++) {
                
                System.out.println("Insira o "+(count+1)+" numero:");
                num[count] = sc.nextDouble();
                
            }
        }
        else{
            System.out.println("Insira o numero:");
            num[0] = sc.nextDouble();
        }
        return num;
    }
    
    public static void exercicioUm(double num){
        
        if(num>20){
            System.out.println("Numero maior que 20!, ele e: "+num);
        }
        else{
            System.out.println("Numero nao e maior que 20");
        }
        
    }
    
    public static void exercicioDois(double num1, double num2){
        /*Apesar do exercício pedir numericos inteiros, mantive double pela
        função "teclado" que utiliza um array double!
        */
        double total;
        
        total = num1 + num2;
        
        if(total>10){
            System.out.println("Soma maior que 10!, a soma e: "+total);
        }
        else{
            System.out.println("Soma nao e maior que 10");
        }        
    }
    
    public static void exercicioTres(double num){
        double calculo;     
        
        if(num>0){
            calculo = Math.sqrt(num);
            System.out.println("A raiz quadrada do numero e: "+calculo);
        }
        else{
            calculo = Math.pow(num, 2);
            System.out.println("O quadrado do numero e: "+calculo);
        }  
    }

    public static void exercicioQuatro(double num){
        if((num%3)==0){
            System.out.println("O numero "+num+" e multiplo de 3");
        }
        else{
            System.out.println("O numero "+num+" nao e multiplo de 3");
        } 
    }

    public static void exercicioCinco(double num){
        if((num%3)==0){
            System.out.println("O numero "+num+" e divisivel por 3");
        }
        else{
            if((num%7)==0){
                System.out.println("O numero "+num+" e divisivel por 7");
            }
            else{
                System.out.println("O numero "+num+" nao e divisivel nem por 3 e nem por 7");
            }
        }
    }
    
    public static void exercicioSeis(double num){
        if(((num%2)==0) && ((num%5)==0) && ((num%10)==0)){
            System.out.println("O numero "+num+" e divisivel por 2,5 e 10");
        }
        else{
            System.out.println("O numero "+num+" nao e divisivel por 2, 5 e 10");
        }
    }
    
}
