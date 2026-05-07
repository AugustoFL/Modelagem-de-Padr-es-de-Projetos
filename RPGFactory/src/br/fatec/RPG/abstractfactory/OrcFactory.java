/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.RPG.abstractfactory;

import br.fatec.RPG.model.Arma;
import br.fatec.RPG.model.Lobo;
import br.fatec.RPG.model.Machado;
import br.fatec.RPG.model.Montaria;

/**
 *
 * @author Aluno
 */
public class OrcFactory implements PersonagemFactory{

    @Override
    public Arma createArma() {
        return new Machado();
    }

    @Override
    public Montaria createMontaria() {
        return new Lobo();
    }
    
}
