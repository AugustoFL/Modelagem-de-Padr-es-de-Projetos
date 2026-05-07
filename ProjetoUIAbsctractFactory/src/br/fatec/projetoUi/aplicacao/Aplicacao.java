/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetoUi.aplicacao;

import br.fatec.projetoUi.abstractfactory.UIFactory;
import br.fatec.projetoUi.abstractfactory.UiFactoryDark;
import br.fatec.projetoUi.abstractfactory.UiFactoryLight;
import br.projetoUi.cliente.Cliente;

/**
 *
 * @author Aluno
 */
public class Aplicacao {
    
    
    public static void main(String[] args) {
    
        String theme = "dark"; // Troque para "Light" para outro tema
    
        UIFactory factory;
    
        if  (theme.equals("light")){
            factory = new UiFactoryLight();
            Cliente.renderUI(factory);
        } else
            if (theme.equals("dark")){
                factory = new UiFactoryDark();
                Cliente.renderUI(factory);
            }
    
        
    }
    
        
    
    
}
