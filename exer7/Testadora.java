/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exer7;

/**
 *
 * @author Afonso
 */
public class Testadora {

    
    public static void main(String[] args) {
        
        
        Pessoa p = new Pessoa();
        p.setEndereco("Pacheco Chaves", 1, "Ourinhos", "123123", "Musa");
        
        p.setNome("Augusto");
        p.setIdade(19);
        
        System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\n" +
                "Endereco: " + p.getEndereco());
        
        p.getNome();
        p.getIdade();
        p.getEndereco();
    }
    
    
}
