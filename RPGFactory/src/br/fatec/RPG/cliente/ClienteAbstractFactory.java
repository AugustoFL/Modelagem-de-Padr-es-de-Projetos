/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.RPG.cliente;

import br.fatec.RPG.abstractfactory.ElfoFactory;
import br.fatec.RPG.abstractfactory.OrcFactory;
import br.fatec.RPG.abstractfactory.PersonagemFactory;
import br.fatec.RPG.model.Arma;
import br.fatec.RPG.model.Montaria;

/**
 *
 * @author Aluno
 */
public class ClienteAbstractFactory {
    
    public static void criarPersonagem(PersonagemFactory factory ){
     
        Arma arma = factory.createArma();
        Montaria montaria = factory.createMontaria();
        System.out.println("Personagem equipado com: " + arma.atacar());
        System.out.println("Montaria escolhida: " + montaria.montar());
    
    }
    
    public static void main(String[] args) {
        
        String classe = "elfo"; //Troque para "orc" para outra classe
        
        PersonagemFactory factory = null;
        if (classe.equals("elfo")){
            System.out.println("Elfo criado!");
            factory = new ElfoFactory();
        } else
            if (classe.equals("orc")){
                System.out.println("Orc criado!");
                factory = new OrcFactory();
            }
        
        criarPersonagem(factory);
        
        
    }
    
}
