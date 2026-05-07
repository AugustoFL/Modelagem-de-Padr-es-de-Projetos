/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetoUi.abstractfactory;

import br.projetoUi.model.Button;
import br.projetoUi.model.Window;
import br.projetoUi.model.ButtonDark;
import br.projetoUi.model.WindowDark;

/**
 *
 * @author Aluno
 */
public class UiFactoryDark implements UIFactory{

    @Override
    public Button createButton() {
        return new ButtonDark();
    }

    @Override
    public Window createWindow() {
        return new WindowDark();

    }
    
}
