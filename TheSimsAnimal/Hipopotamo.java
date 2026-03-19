/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Hipopotamo extends Animal {
    
        @Override
    public void comer(String comida){
        
        System.out.println("Hipopotamo comeu: " + comida);
        
    }
    
    @Override
    public void fazerBarulho(){
        
        System.out.println("Hipopotamo fez barulho.");
        
    }
    
    @Override
    public void dormir(){
        System.out.println("Hipopotamo dormiu.");
    }
    
        @Override
    public String ToString(){
        return "Hipopotamo";
    }
    
}
