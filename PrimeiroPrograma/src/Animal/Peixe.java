/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author Henrique
 */
public class Peixe extends Animal{
    private String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo particulas");
    }
    
    @Override
    public void emitirsom(){
        System.out.println("Peixe não faz som");
    }
    
    public void soltarbolha(){
        System.out.println("Solta bolhas");
    }
}
