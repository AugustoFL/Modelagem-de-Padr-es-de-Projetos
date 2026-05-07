/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetorelatorio.factory;

import br.fatec.projetorelatorio.model.Document;
import br.fatec.projetorelatorio.model.DocumentCSV;
import br.fatec.projetorelatorio.model.Exporter;
import br.fatec.projetorelatorio.model.ExporterCSV;

/**
 *
 * @author Aluno
 */
public class CSVFactory implements ReportFactory{

    @Override
    public Document createDocument() {
        return new DocumentCSV();
    }

    @Override
    public Exporter createExporter() {
        return new ExporterCSV();
    }
    
}
