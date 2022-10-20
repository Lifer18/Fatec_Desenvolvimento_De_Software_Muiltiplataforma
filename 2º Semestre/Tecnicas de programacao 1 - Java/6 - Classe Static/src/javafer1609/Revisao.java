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
public class Revisao {
    private int x;
    private double d;
    private String s;
    
    // IF - condicionais
    public void metodoIF(){
        if(x<0){
            System.out.println("Numero negativo!");
        }
        else{
            System.out.println("Numero positivo!");
        }
    }
    
    public void metodoIfElseIf(){
        if(x>0 && x<= 10){
            System.out.println("X entre 0 e 10");            
        }
        else if(x >10 && x<=20){
            System.out.println("X entre 11 e 20");
        }
        else{
            System.out.println("X maior que 20");
        }
    }
    
    public void metodoSwitch(){
        int opcao = 1;
        
        switch(opcao){
            case 1:
                System.out.println("Caso 1");
                break;
            
            case 2:
                System.out.println("Caso 2");
                break;
            
            case 3:
                System.out.println("Caso 3");
                break;
                
            default:
                System.out.println("Opcao invalida");
        }
    }
    
    public void metodoWhile(){
        int y = x;
        while(x <= 10){
            System.out.println("X: "+x);
            x++;
        }
        x = y;
    }
    
    public void metodoFor(){
        for(int i =0; i <= 10; i++){
            System.out.println("De 1 em 1: "+i);
        }
        
        System.out.println("\n");
        
        for (int j = 0; j <= 10;) {
            System.out.println("De 2 em 2: "+j);
            j = j + 2;
        }
        
        /*
        for(;;){
            System.out.println("Looping infinito!!!");
        }*/
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
}
