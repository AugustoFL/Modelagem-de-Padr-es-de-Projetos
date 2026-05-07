/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetoUi.abstractfactory;

import br.projetoUi.model.Button;
import br.projetoUi.model.ButtonLight;
import br.projetoUi.model.Window;
import br.projetoUi.model.WindowLight;

/**
 *
 * @author Aluno
 */
public class UiFactoryLight implements UIFactory{

    @Override
    public Button createButton() {
        return new ButtonLight();
    }

    @Override
    public Window createWindow() {
        return new WindowLight();
    }
    
    
    
}
