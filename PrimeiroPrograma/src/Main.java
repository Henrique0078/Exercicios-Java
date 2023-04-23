
import Animal.Aves.Calopsita;
import Animal.Mamiferos.Cachorro;
import Animal.Peixes.Beta;
import Animal.Repteis.Cobra;

public class Main {
   
    public static void main(String args[]){
    
    Calopsita amarelinho = new Calopsita();
    amarelinho.setNome("Amarelinho");
    amarelinho.setPeso(1.350);
    amarelinho.setIdade(2);
    amarelinho.setMembros(5);
    System.out.println(amarelinho.getNome());
    amarelinho.alimentar();
    amarelinho.emitirsom();
    amarelinho.fazerninho();
    amarelinho.locomover();
    amarelinho.habilidadesocial();
    
    System.out.println("---------------------------------------------------");
    
    Cachorro toby = new Cachorro();
    toby.setNome("Toby");
    toby.setIdade(11);
    toby.setMembros(4);
    toby.setPeso(3.2);
    System.out.println(toby.getNome());
    toby.alimentar();
    toby.emitirsom();
    toby.locomover();
    toby.cavar();
    
    System.out.println("---------------------------------------------------");
    
    Beta peixonauta = new Beta();
    peixonauta.setNome("Peixonauta");
    peixonauta.setIdade(3);
    peixonauta.setMembros(3);
    peixonauta.setPeso(0.3);
    System.out.println(peixonauta.getNome());
    peixonauta.alimentar();
    peixonauta.emitirsom();
    peixonauta.locomover();
    peixonauta.soltarbolha();
    peixonauta.morrem(true);
    
    System.out.println("---------------------------------------------------");
    
    Cobra jararaca = new Cobra();
    jararaca.setIdade(2);
    jararaca.setMembros(0);
    jararaca.setPeso(16);
    jararaca.alimentar();
    jararaca.emitirsom();
    jararaca.locomover();
    jararaca.picar();
    
    System.out.println("---------------------------------------------------");
    
    }
} 
