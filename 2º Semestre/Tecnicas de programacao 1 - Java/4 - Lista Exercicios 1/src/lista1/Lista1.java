/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lista1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);  
        Calculadora c = new Calculadora();
        
        
        float num1 , num2 , num3, resultado;
        int op,saida=0;
        String s;
        

        do{
            System.out.println("-----------------CALCULADORA-----------------");
            System.out.println("Selecione qual opcao quer utilizar: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Encerrar programa");

            op = sc.nextInt();

            switch (op) {
            case 1:
                System.out.println("Insira o primeiro numero:");
                num1 = sc.nextFloat();

                System.out.println("Insira o segundo numero:");
                num2 = sc.nextFloat();

                c.soma(num1,num2);
                break;

            case 2:
                System.out.println("Insira o primeiro numero:");
                num1 = sc.nextFloat();

                System.out.println("Insira o segundo numero:");
                num2 = sc.nextFloat();

                System.out.println("Insira o terceiro numero:");
                num3 = sc.nextFloat();

                c.subtracao(num1,num2,num3);
                break;

            case 3:
                System.out.println("Insira o primeiro numero:");
                num1 = sc.nextFloat();

                System.out.println("Insira o segundo numero:");
                num2 = sc.nextFloat();

                resultado = c.multiplicacao(num1,num2);
                System.out.println("O resultado e: "+resultado);
                break;

            case 4:
                System.out.println("Insira o primeiro numero:");
                num1 = sc.nextFloat();

                System.out.println("Insira o segundo numero:");
                num2 = sc.nextFloat();

                resultado = c.divisao(num1,num2);

                if(resultado!=0){
                    System.out.println("O resultado e: "+resultado);
                }

                break;

             case 5:
                System.out.println("Encerrando o programa.");
                saida=1;
                break;
                
             default:
                System.out.println("Opcao invalida, selecione de 1 a 5.");   

            }
        }while(saida==0);
        
    }
    
}
