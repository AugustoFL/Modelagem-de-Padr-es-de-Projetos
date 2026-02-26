/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Disciplina d = new Disciplina("Padrões", 2);
        
        Curso c = new Curso("ADS", "Tarde");
        
        Aluno a = new Aluno("Augusto", c, d);
        
        System.out.println(a);
        
    }
    
}
