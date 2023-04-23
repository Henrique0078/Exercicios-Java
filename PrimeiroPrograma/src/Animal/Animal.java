/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author Henrique
 */
public abstract class Animal {
    
    private double peso;
    private int idade;
    private int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirsom();
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setMembros(int membros){
        this.membros = membros;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getMembros(){
        return membros;
    }
} 


