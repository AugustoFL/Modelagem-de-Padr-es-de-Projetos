/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Lobo extends Canino {
    
        @Override
    public void comer(String comida){
        
        System.out.println("Lobo comeu: " + comida);
        
    }
    
    @Override
    public void fazerBarulho(){
        
        System.out.println("Lobo fez barulho.");
        
    }
    
    @Override
    public void dormir(){
        System.out.println("Lobo dormiu.");
    }
    
        @Override
    public String ToString(){
        return "Lobo";
    }
    
}
