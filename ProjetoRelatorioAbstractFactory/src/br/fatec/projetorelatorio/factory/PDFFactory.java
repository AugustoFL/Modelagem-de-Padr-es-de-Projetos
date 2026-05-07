/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetorelatorio.factory;

import br.fatec.projetorelatorio.model.Document;
import br.fatec.projetorelatorio.model.DocumentPDF;
import br.fatec.projetorelatorio.model.ExportPDF;
import br.fatec.projetorelatorio.model.Exporter;

/**
 *
 * @author Aluno
 */
public class PDFFactory implements ReportFactory{

    @Override
    public Document createDocument() {
        return new DocumentPDF();
    }

    @Override
    public Exporter createExporter() {
        return new ExportPDF();
    }
    
}
