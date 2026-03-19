/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Tigre extends Felino {
    
        @Override
    public void comer(String comida){
        
        System.out.println("Tigre comeu: " + comida);
        
    }
    
    @Override
    public void fazerBarulho(){
        
        System.out.println("Tigre fez barulho.");
        
    }
    
    @Override
    public void dormir(){
        System.out.println("Tigre dormiu.");
    }
    
        @Override
    public String ToString(){
        return "Tigre";
    }
    
}
