/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.fatec.RPG.abstractfactory;

import br.fatec.RPG.model.Arma;
import br.fatec.RPG.model.Montaria;

/**
 *
 * @author Aluno
 */
public interface PersonagemFactory {
    
    Arma createArma();
    Montaria createMontaria();
    
}
