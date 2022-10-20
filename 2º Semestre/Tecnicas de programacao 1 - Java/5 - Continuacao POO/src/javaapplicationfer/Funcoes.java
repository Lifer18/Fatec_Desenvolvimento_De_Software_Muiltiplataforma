/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationfer;

/**
 *
 * @author f290ti
 */
public class Funcoes {
    private double potencia = 0;
    private double raiz = 0;
    
    public double potencia(double b, double e){
        double r;
        
        r = Math.pow(b, e);
        //this.potencia = r;
        
        return r;
    }
    
    public double raiz(double p){
        double r;
        
        r = Math.sqrt(p);
        //this.raiz = r;
        
        return r;
    }
    
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    
    public void setRaiz(double raiz){
        this.raiz = raiz;
    }
    
    public void imprimir(){
        System.out.println("Potencia: "+potencia);
        System.out.println("Raiz: "+raiz);
    }
    
}
