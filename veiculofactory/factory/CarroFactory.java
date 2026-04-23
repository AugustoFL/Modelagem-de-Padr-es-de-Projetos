/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.veiculofactory.factory;

import br.fatec.veiculofactory.model.Carro;
import br.fatec.veiculofactory.model.Veiculo;

/**
 *
 * @author Aluno
 */
public class CarroFactory extends VeiculoFactory{

    @Override
    public Veiculo criarVeiculo() {
            return new Carro();
    }
}
