/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.RPG.abstractfactory;

import br.fatec.RPG.model.ArcoeFlecha;
import br.fatec.RPG.model.Arma;
import br.fatec.RPG.model.Montaria;
import br.fatec.RPG.model.Unicornio;

/**
 *
 * @author Aluno
 */
public class ElfoFactory implements PersonagemFactory{

    @Override
    public Arma createArma() {
        return new ArcoeFlecha();
    }

    @Override
    public Montaria createMontaria() {
        return new Unicornio();
    }
    
}
