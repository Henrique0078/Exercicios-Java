/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal.Peixes;

import Animal.Peixe;

/**
 *
 * @author Henrique
 */
public class Beta extends Peixe{
    private String nome;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    public void morrem(boolean status){
        if(status == true){
            System.out.println("MORTO");
        }
        else{
            System.out.println("VIVO");
        }
    }
}
