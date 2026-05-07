/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetobotoes.abstractfactory;

import br.fatec.projetobotoes.model.Button;
import br.fatec.projetobotoes.model.WindowsButton;

/**
 *
 * @author Aluno
 */
public class WindowsFactory implements GUIAbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
