/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetobotoes.cliente;

import br.fatec.projetobotoes.abstractfactory.GUIAbstractFactory;
import br.fatec.projetobotoes.model.Button;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    private Button button;

    public Cliente(GUIAbstractFactory factory) {
        this.button = factory.createButton();
    }
    
    public void render(){
        this.button.render();
    }
    
}
