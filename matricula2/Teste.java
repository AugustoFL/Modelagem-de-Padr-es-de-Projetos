/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula2;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Disciplina d1 = new Disciplina("Padrões", 2);
        Disciplina d2 = new Disciplina("Java", 3);
        Disciplina d3 = new Disciplina("Modelo", 5);              
        
        Curso c = new Curso("ADS", "Tarde");              
        
        Aluno a = new Aluno("Augusto", c);
        
        a.adicionarDisciplina(d1);
        a.adicionarDisciplina(d2);
        a.adicionarDisciplina(d3);
        
        System.out.println(a);
        
    }
    
}
