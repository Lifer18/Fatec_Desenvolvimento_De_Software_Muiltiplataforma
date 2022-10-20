/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafer1609;

import java.util.Scanner;

/**
 *
 * @author f290ti
 */
public class JavaFer1609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc;
        sc = StaticClass.receberTeclado();
        
        double[] num = new double[2];
        
        int op;
        int sair = 0;
        
        Revisao r = new Revisao();
        int x;
        
        
        do{
            System.out.println("\n----Selecione a operacao----");
            System.out.println("1 - Soma");
            System.out.println("2 - Divisao");
            System.out.println("3 - Potencia");
            System.out.println("4 - Sair");
            op = sc.nextInt();

            switch (op){
                case 1:
                    num = StaticClass.valores();
                    StaticClass.soma(num[0],num[1]);
                    break;

                case 2:
                    num = StaticClass.valores();
                    if (num[1]==0){
                        System.out.println("Erro, divisor e 0!");
                    }
                    else{
                        StaticClass.divisao(num[0], num[1]);
                    }
                    break;

                case 3:
                    num = StaticClass.valores();
                    StaticClass.potencia(num[0], num[1]);
                    break;
                
                case 4:
                    System.out.println("\nVoce saiu!");
                    sair=1;
                    break;
                    
                default:
                    System.out.println("\nOpção invalida");
            }
        }while(sair!=1);
        
        
        
        
        System.out.println("\nInsira o valor para X (revisao)");
        x = sc.nextInt();
        r.setX(x);
        
        

        System.out.println("\nX: "+r.getX());
        
        System.out.println("\nMetodo IF: \n");
        r.metodoIF();
        
        System.out.println("\nMetodo ElseIf: \n");
        r.metodoIfElseIf();
        
        System.out.println("\nMetodo Switch: \n");
        r.metodoSwitch();
        
        System.out.println("\nMetodo While: \n");
        r.metodoWhile();
        
        System.out.println("\nMetodo For: \n");
        r.metodoFor();
        
        
        
        /*System.out.println("X: "+StaticClass.x);
        StaticClass.metodoEstatico();
        
        StaticClass.teste();*/
        
    }
    
}
