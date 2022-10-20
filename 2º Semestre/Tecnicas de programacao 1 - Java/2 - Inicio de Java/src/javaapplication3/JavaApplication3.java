/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author aluno.si
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // entrada de dados
        Scanner sc = new Scanner(System.in);
        
       int x; // variável do tipo inteiro
       double d; // varíavel do tipo double, numeros não inteiros grandes
       String s; // CLASSE do tipo string, string tem que ser classe (Com S maíusculo)
       
        System.out.print("Digite um valor inteiro: ");
        x = sc.nextInt();
        
        System.out.print("\nDigite um valor não inteiro: ");
        d = sc.nextDouble();
        

        
        System.out.print("\nDigite uma linha: ");
        sc.nextLine();
        s = sc.nextLine();
        
       
       
       // imprimir os dados
        System.out.println("\nValor de x: "+x);
        System.out.println("Valor de d: "+d);
        System.out.println("Valor de s: "+s);
        
    }
    
}
