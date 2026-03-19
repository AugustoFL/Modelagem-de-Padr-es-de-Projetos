/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Carro c = new Carro();
        Moto m = new Moto();
        
       
        c.setCor("Roxa");
        c.setChassi("chassi de carro");
        c.setPlaca("1231241");
        
        
        m.setChassi("chassi de moto");
        m.setCor("branca");
        m.setPlaca("987987");
        
        System.out.println("Informacoes do carro: " +
        "\nChassi: " + c.getChassi() +
        "\nCor: " + c.getCor() +
        "\nPlaca: "+ c.getPlaca() 
        );  
        c.EmitirGuiaSeguro();
        
        System.out.println("----------------------------");
        
        System.out.println("Informacoes da moto: " +
        "\nChassi: " + m.getChassi() +
        "\nCor: " + m.getCor() +
        "\nPlaca: " + m.getPlaca()
                );
        m.EmitirGuiaSeguro();
        
        
    }
 
    
    
}
