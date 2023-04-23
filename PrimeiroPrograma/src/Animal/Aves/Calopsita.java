/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal.Aves;

import Animal.Ave;

/**
 *
 * @author Henrique
 */
public class Calopsita extends Ave{
    private String nome;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    @Override
    public void fazerninho(){
        
    }
    
    public void habilidadesocial(){
        System.out.println("FIU FIU");
    }
}
