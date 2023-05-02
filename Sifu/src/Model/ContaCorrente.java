/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author UNIP
 */
public class ContaCorrente extends Banco {
    private double limite;
    
    public double getLimite(){
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
}
