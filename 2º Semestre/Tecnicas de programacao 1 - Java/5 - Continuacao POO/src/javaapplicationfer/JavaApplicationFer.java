/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationfer;

import java.util.Scanner;

/**
 *
 * @author f290ti
 */
public class JavaApplicationFer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        Moto moto1 = new Moto(300,2,"Vermelho");
        
        System.out.println("Motor: "+moto1.getMotor());
        System.out.println("Rodas: "+moto1.getRodas());
        System.out.println("Cor: "+moto1.getCor());
        
        Moto moto2 = new Moto(150,2,"Dourado");
        
        System.out.println("Motor: "+moto2.getMotor());
        System.out.println("Rodas: "+moto2.getRodas());
        System.out.println("Cor: "+moto2.getCor());
        */
        
        // Uso da palavra chave 'final'
        /*final int x = 10;
        // x = 11; -- não funciona, pois a variável x é finalç
        
        System.out.println("PI: "+Math.PI);*/
        
        Funcoes f = new Funcoes();
        
        double potencia;
        double raiz;
        double num1;
        double num2;
        
        System.out.println("Insira a base: ");
        num1 = sc.nextDouble();
        
        System.out.println("Insira o expoente: ");
        num2 = sc.nextDouble();
        
        potencia = f.potencia(num1, num2);
        
        raiz = f.raiz(potencia);

        
        f.setPotencia(potencia);
        f.setRaiz(raiz);
        
        System.out.println("\n");   
        f.imprimir();
                 
    }
    
}
