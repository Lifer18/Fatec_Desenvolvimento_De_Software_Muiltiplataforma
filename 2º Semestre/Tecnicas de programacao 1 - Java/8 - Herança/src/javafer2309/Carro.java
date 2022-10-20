/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafer2309;

/**
 *
 * @author aluno.si
 */
public class Carro extends Veiculo {
    
    //atributos
    private int portas;
    private int airbag;
    
    public Carro(int motor, int rodas, String cor, int portas, int airbag){
        super(motor, rodas, cor);
        this.portas = portas;
        this.airbag = airbag;
    }
    
    public void setPortas(int portas){
        this.portas = portas;
    }
    
    public void setAirbag(int airbag){
        this.airbag = airbag;
    }
    
    public int getPortas(){
        return portas;
    }
    
    public int getAirbag(){
        return airbag;
    }
   
    //Sobrescrever o método ja utilizado na Classe "veículo"
    @Override
    public void imprimir(){
        super.imprimir(); // imprimir todos os atributos de veículo
        System.out.println("Portas: "+portas);
        System.out.println("Airbag: "+airbag);
        
    }
    
    //Overrides de sets
    
    @Override
    public void setRodas(int rodas){
        super.setRodas(rodas);
    }
}
