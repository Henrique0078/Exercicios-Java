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
public class Conta {
    private String nome;
    private double saldo;
    
    public void sacar(double saque){
        this.saldo = this.saldo - saque;
    }
    
    public void depositar(double deposito){
        this.saldo = this.saldo + deposito;
    }
    
    public void transferir(Conta conta, double transferencia){
        if (this.saldo > transferencia){
            this.saldo = (this.saldo - transferencia);
            conta.saldo = (conta.saldo + transferencia);
        }
        else{
            System.out.println("Valor insuficiente para transferencia");
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
