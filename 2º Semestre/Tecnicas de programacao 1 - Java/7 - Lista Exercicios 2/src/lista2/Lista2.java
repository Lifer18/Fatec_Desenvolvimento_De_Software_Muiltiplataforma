/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] num = new double[2];
        
        int op, sair=0;
        
        do{
            System.out.println("----Selecione o exercicio:----");
            System.out.println("1 - numero > 20");
            System.out.println("2 - soma e > 10");
            System.out.println("3 - raiz ou quadrado");
            System.out.println("4 - multiplo de 3");
            System.out.println("5 - divisivel por 3 e 7");
            System.out.println("6 - divisivel por 2, 5 e 10");
            System.out.println("7 - encerrar programa");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    num=Funcoes.teclado(1);
                    Funcoes.exercicioUm(num[0]);
                    break;
                    
                case 2:
                    num=Funcoes.teclado(2);
                    Funcoes.exercicioDois(num[0],num[1]);
                    break;
                    
                case 3:
                    num=Funcoes.teclado(1);
                    Funcoes.exercicioTres(num[0]);
                    break;
                    
                case 4:
                    num=Funcoes.teclado(1);
                    Funcoes.exercicioQuatro(num[0]);
                    break;
                    
                case 5:
                    num=Funcoes.teclado(1);
                    Funcoes.exercicioCinco(num[0]);
                    break;
                    
                case 6:
                    num=Funcoes.teclado(1);
                    Funcoes.exercicioSeis(num[0]);
                    break;
                    
                case 7:
                    System.out.println("Voce encerrou.");
                    sair=1;
                    break;
                    
                default:
                    System.out.println("Opcao invalida!");
            }
           
        }while(sair==0);
       
        //num = Funcoes.teclado(10);
        
        /*for (int i = 0; i < 10; i++) {
            
        System.out.println((i+1)+" numero: "+num[i]);
        
        }*/
        
    }
    
}
