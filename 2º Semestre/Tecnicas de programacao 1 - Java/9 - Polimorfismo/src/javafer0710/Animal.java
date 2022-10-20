/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafer0710;

/**
 *
 * @author f290ti
 */
public class Animal {
    
    private int tamanho;
    private String nome;

    public Animal(int tamanho, String nome){
        this.tamanho = tamanho;
        this.nome = nome;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void mover(){
        System.out.println("Movendo!!!");
    }
    
    
}