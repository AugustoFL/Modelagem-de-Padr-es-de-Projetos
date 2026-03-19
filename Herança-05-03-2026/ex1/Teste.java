/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    
    public static void main(String[] args) {
    
        Cavalo c = new Cavalo();
        Leao l = new Leao();
    
        
        c.setCor("Preto");
        c.setRaca("Qualquer coisa");
        c.setTamanho(140);
        c.fugir();
        
        l.setCor("laranja");
        l.setJuba(true);
        l.cacar();
        
        
    }
    
}
