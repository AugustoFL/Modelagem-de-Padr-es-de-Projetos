/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.fatec.projetorelatorio.factory;

import br.fatec.projetorelatorio.model.Document;
import br.fatec.projetorelatorio.model.Exporter;

/**
 *
 * @author Aluno
 */
public interface ReportFactory {
    
    Document createDocument();
    Exporter createExporter();
    
    
}
