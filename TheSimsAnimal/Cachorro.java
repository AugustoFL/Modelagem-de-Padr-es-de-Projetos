/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Cachorro extends Canino {
    
        @Override
    public void comer(String comida){
        
        System.out.println("Cachorro comeu: " + comida);
        
    }
    
    @Override
    public void fazerBarulho(){
        
        System.out.println("Cachorro fez barulho.");
        
    }
    
    @Override
    public void dormir(){
        System.out.println("Cachorro dormiu.");
    }
    
        @Override
    public String ToString(){
        return "Cachorro";
    }
}
