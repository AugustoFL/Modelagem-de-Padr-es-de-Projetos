/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fatec.projetorelatorio.aplicacao;

import br.fatec.projetorelatorio.factory.CSVFactory;
import br.fatec.projetorelatorio.factory.PDFFactory;
import br.fatec.projetorelatorio.factory.ReportFactory;
import br.fatec.projetorelatorio.model.Document;
import br.fatec.projetorelatorio.model.Exporter;

/**
 *
 * @author Aluno
 */
public class AplicacaoCliente {
    
   public static void generateReport(ReportFactory factory){
      
       Document document = factory.createDocument();
       Exporter exporter = factory.createExporter();
       exporter.export(document);
       
   }
    
   public static void main(String [] args){
       
       String format = "csv"; // Troque para "pdf" para outro formato
       ReportFactory factory = null;
       if (format.equals("pdf")){
           factory = new PDFFactory();
       } else 
           if (format.equals("csv")){
               factory = new CSVFactory();
           }
            generateReport(factory);
      
       
       
   }
   
    
}
