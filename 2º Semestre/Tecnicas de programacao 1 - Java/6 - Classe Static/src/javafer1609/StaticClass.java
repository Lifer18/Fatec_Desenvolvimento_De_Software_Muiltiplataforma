/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafer1609;

import java.util.Scanner;

/**
 *
 * @author f290ti
 */
public class StaticClass {
    
    public static void soma (double num1, double num2){
        double total;
        total = num1+num2;
        
        //System.out.println("Soma: "+(num1+num2));
        System.out.println("\nSoma: "+total);
        
    }
    
    public static void divisao (double num1, double num2){
        double total;
        total = num1 / num2;
        
        System.out.println("\nDivisao: "+total);
    }
    
    public static void potencia (double base, double expoente){
        double total;
        total = Math.pow(base, expoente);
        
        System.out.println("\nPotencia: "+total);
    }
   
    public static Scanner receberTeclado(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    
    public static double[] valores(){
        double[] num = new double[2];
        
        Scanner sc;
        sc = receberTeclado();
        
        System.out.println("Insira os dois numeros");
        System.out.println("Numero 1:");
        num[0] = sc.nextDouble();
        System.out.println("Numero 2:");
        num[1] = sc.nextDouble();
        
        return num;
    }
    
    /*public static final int x = 10;
    
    public static void metodoEstatico(){
        System.out.println("Metodo estatico");
    }*/
    
}
