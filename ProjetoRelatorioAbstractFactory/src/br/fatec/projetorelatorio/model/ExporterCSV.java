/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetorelatorio.model;

/**
 *
 * @author Aluno
 */
public class ExporterCSV implements Exporter{

    @Override
    public void export(Document dococument) {
        System.out.println("Exportando para CSV: " + dococument.generate());
    }
    
    
    
}
