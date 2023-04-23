/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author Henrique
 */
public class Ave extends Animal{
    private String corPena;
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Bicando");
    }
    
    @Override
    public void emitirsom(){
        System.out.println("Som de ave");
    }
    
    public void fazerninho(){
        System.out.println("Faz um ninho");
    }
}
