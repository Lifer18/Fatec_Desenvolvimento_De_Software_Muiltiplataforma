/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafer0710;

/**
 *
 * @author f290ti
 */
public class Sapo extends Animal{
    
    public Sapo(int tamanho, String nome){
        super(tamanho,nome);
    }

    @Override
    public int getTamanho(){
        return super.getTamanho();
    }

    @Override
    public String getNome(){
        return super.getNome();
    }

    
    @Override
    public void mover(){
        System.out.println("Sapo movendo!!!");
    }
}
