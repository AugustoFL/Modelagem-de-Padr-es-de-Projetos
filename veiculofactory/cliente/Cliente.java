/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.veiculofactory.cliente;

import br.fatec.veiculofactory.factory.CarroFactory;
import br.fatec.veiculofactory.factory.MotoFactory;
import br.fatec.veiculofactory.model.Veiculo;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        CarroFactory cf = new CarroFactory();
        Veiculo carro = cf.criarVeiculo();
        
        //Para demonstrar que foi criado
        // aparece o hashcode do objeto
        System.out.println(carro);
        carro.exibirDetalhes();
        
        MotoFactory mf = new MotoFactory();
        Veiculo moto = mf.criarVeiculo();
        moto.exibirDetalhes();
        
        
    }
    
}
