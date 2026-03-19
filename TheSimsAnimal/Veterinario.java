/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Veterinario {
    
    
    public void darInjecao(Animal a){
        System.out.println("Veteriano deu injecao no " + a.ToString());
        a.fazerBarulho();
    }
}
