/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        HomemOvoFrito hof = new HomemOvoFrito();
        HomemPantera hp = new HomemPantera();
        
        System.out.println("Homem Ovo Frito");
        hof.usarPoderEspecial();
        hof.colocarRoupa();
        
          System.out.println("-----------------------");
          
        System.out.println("Homem Pantera");
        hp.colocarRoupa();
        hp.usarPoderEspecial();
        
        
    }
    
}
