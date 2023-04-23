/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal.Mamiferos;

import Animal.Mamifero;

/**
 *
 * @author Henrique
 */
public class Cachorro extends Mamifero{
    private String nome;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    @Override
    public void emitirsom(){
        System.out.println("AU AU");
    }
    @Override
    public void alimentar(){
        System.out.println("Mastigando");
    }
    public void cavar(){
        System.out.println("Cavando");
    }
}
