/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author aluno.si
 */
public class Carro {
    
    // atributos
    
    private int rodas = 4;
    private int portas = 4;
    private String placa= "ABC1234";
    private String cor = "prata";
    private boolean gasolina = true; 
    
    //métodos
    
    // imprimir
    public void imprimir(){
        System.out.println("Rodas: "+rodas);
        System.out.println("Portas: "+portas);
        System.out.println("Placa: "+placa);
        System.out.println("Cor: "+cor);
    }
    
    
    
}
