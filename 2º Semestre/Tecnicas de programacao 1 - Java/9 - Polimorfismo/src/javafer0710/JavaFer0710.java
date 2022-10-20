/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafer0710;

/**
 *
 * @author f290ti
 */
public class JavaFer0710 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a;

        a = new Peixe(10, "Cleber");
        a.mover();

        a = new Sapo(5, "Jorge");
        a.mover();

        a = new Ave(20, "Sabrina");
        a.mover();

        System.out.println("nome: "+a.getNome());


        Concreta x = new Concreta();

        x.texto();
        x.texto2();
        x.texto3();
    }
    
}
