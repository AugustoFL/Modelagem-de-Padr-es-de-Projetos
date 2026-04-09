/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Escola esc = new Escola();
        
        Aluno al = new Aluno("Augusto", 19);
        
        al.setNota1(10);
        al.setNota2(10);
        al.setNota3(10);
        
        AlunoBolsista alBol = new AlunoBolsista("Afonso", 19, 10);
        
        alBol.setNota1(10);
        alBol.setNota2(10);
        alBol.setNota3(10);
        
        Professor pr = new Professor("Andre", 19);
        
        pr.setHorasAula(10);
        pr.setValorHora(50);
        
        ProfessorCordenador prCor = new ProfessorCordenador("Fabio", 22);
        
        prCor.setHorasAula(10);
        pr.setValorHora(50);
        
        esc.adicionarPessoa(al);
        esc.adicionarPessoa(alBol);
        esc.adicionarPessoa(pr);
        esc.adicionarPessoa(prCor);
        
        esc.listarPessoas();
        System.out.println("Total de Indicador: " + esc.calcularTotalIndicadores());
        
    }
    
}
