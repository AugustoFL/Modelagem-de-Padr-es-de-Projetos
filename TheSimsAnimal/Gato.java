/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Gato extends Felino{
    
        @Override
    public void comer(String comida){
        
        System.out.println("Gato comeu: " + comida);
        
    }
    
    @Override
    public void fazerBarulho(){
        
        System.out.println("Gato fez barulho.");
        
    }
    
    @Override
    public void dormir(){
        System.out.println("Gato dormiu.");
    }
        @Override
        public String toString(){
        return "Gato";
    }
}
