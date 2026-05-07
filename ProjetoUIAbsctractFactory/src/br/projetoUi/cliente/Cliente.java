/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.projetoUi.cliente;

import br.fatec.projetoUi.abstractfactory.UIFactory;
import br.projetoUi.model.Button;
import br.projetoUi.model.Window;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    public static void renderUI(UIFactory factory){
        
        Button button = factory.createButton();
        Window window = factory.createWindow();
        System.out.println(button.render());
        System.out.println(window.render());
        
    }
    
}
