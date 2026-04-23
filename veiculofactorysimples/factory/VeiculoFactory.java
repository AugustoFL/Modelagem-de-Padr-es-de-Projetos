/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.veiculofactorysimples.factory;

import br.fatec.veiculofactorysimples.model.Carro;
import br.fatec.veiculofactorysimples.model.Moto;
import br.fatec.veiculofactorysimples.model.Veiculo;

/**
 *
 * @author Aluno
 */
public abstract class VeiculoFactory {
    
    /* método para não criar instâncias da classe
    VeiculoFactory
    */
    
    public static Veiculo getVeiculo(String tipo){
            
        if(tipo.equalsIgnoreCase("carro")){
            return new Carro();
        } else if (tipo.equalsIgnoreCase("moto")){
            return new Moto();
        } else {
            throw new IllegalArgumentException("Tipo de veiculo desconhecido");
        }
        
    }
    
}
