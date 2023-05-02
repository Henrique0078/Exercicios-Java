/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carteira;
import Model.Banco;
import Model.ContaCorrente;




/**
 *
 * @author UNIP
 */
public class Principal {
    public static void main(String[] args) {
        
        Carteira Henrique = new Carteira();
        Henrique.setSaldo(1000);
        Henrique.setNome("Henrique");
        
        System.out.println("Opa " + Henrique.getNome());
        System.out.println("Tu tem " + Henrique.getSaldo());

        Henrique.depositar(500);
        System.out.println("O cliente "+ Henrique.getNome() + " tem R$" + Henrique.getSaldo());
        
        
        Carteira Thayna = new Carteira();
        Thayna.setNome("Thayna");
        Thayna.setSaldo(1000);
        Henrique.transferir(Thayna, 500);
        
        System.out.println("\n" + Henrique.getNome() + " Saldo: " + Henrique.getSaldo());
        System.out.println(Thayna.getNome() + " Saldo: " + Thayna.getSaldo());
        
        System.out.println("\nOpa " + Thayna.getNome());
        System.out.println("Tu tem " + Thayna.getSaldo());
        
        
        
        System.out.println("----------------------------------------------------------------");
        
        ContaCorrente Irineu = new ContaCorrente();
        Irineu.setAgencia("PAULO");
        Irineu.setNumero(1);
        Irineu.transferir(Henrique, 500);
        System.out.println("Agencia: "+ Irineu.getAgencia());
        System.out.println("Numero : "+ Irineu.getNumero());
    }
    
}
