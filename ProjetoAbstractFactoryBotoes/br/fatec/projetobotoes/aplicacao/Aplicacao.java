/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetobotoes.aplicacao;

import br.fatec.projetobotoes.abstractfactory.GUIAbstractFactory;
import br.fatec.projetobotoes.abstractfactory.MacOSFactory;
import br.fatec.projetobotoes.abstractfactory.WindowsFactory;
import br.fatec.projetobotoes.cliente.Cliente;

/**
 *
 * @author Aluno
 */
public class Aplicacao {

    public static void main(String[] args) {
        
        GUIAbstractFactory factory;
        
        String os = System.getProperty("os.name").toLowerCase();
        //System.getProperty(key) é um método da classe System do Java
        // que retorna o valor de uma propriedade do sistema.
        
        if(os.contains("win")){
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }
        
        Cliente app = new Cliente(factory);
        app.render();
        
        
    }

    
}
