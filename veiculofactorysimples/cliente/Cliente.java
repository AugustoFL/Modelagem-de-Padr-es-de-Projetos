/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.veiculofactorysimples.cliente;

import br.fatec.veiculofactorysimples.factory.VeiculoFactory;
import br.fatec.veiculofactorysimples.model.Veiculo;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        System.out.println("Criando um carro");
        Veiculo veiculo1 = VeiculoFactory.getVeiculo("carro");
        System.out.println(veiculo1);
        veiculo1.exibirDetalhes();
        
        System.out.println("Criando um moto");
        Veiculo veiculo2 = VeiculoFactory.getVeiculo("moto");
        System.out.println(veiculo2);
        veiculo2.exibirDetalhes();
        
    }
    
    
    
}
