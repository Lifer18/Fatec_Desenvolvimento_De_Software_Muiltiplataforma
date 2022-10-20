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
    
    //get
    public int getRodas(){
        return rodas;
    }
    public int getPortas(){
        return portas;
    }
    public String getPlaca(){
        return placa;
    }
    public String getCor(){
        return cor;
    }
    public boolean getGasolina(){
        return gasolina;
    }
    
    //set
    public void setRodas(int rodas){
        this.rodas = rodas;
    }
    public void setPortas(int portas){
        this.portas = portas;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setGasolina(boolean gasolina){
        this.gasolina = gasolina;
    }
    
    // imprimir
    public void imprimir(){
        System.out.println("\nRodas: "+rodas);
        System.out.println("Portas: "+portas);
        System.out.println("Placa: "+placa);
        System.out.println("Cor: "+cor);
        System.out.println("Gasolina: "+gasolina);
    }
    
    
    
}
