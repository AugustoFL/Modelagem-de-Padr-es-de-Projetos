/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheSimsAnimal;

/**
 *
 * @author Aluno
 */
public class Teste {
    
        public static void main(String[] args) {
        
            Animal animais[] = new Animal[5];
            
            animais[0] = new Cachorro();
            animais[1] = new Gato();
            animais[2] = new Tigre();
            animais[3] = new Leao();
            animais[4] = new Lobo();
            
            for(Animal a: animais){
                a.fazerBarulho();
            }
            
            Veterinario v = new Veterinario();
            
            Cachorro c = new Cachorro();
            Gato g = new Gato();
            
            v.darInjecao(c);
            v.darInjecao(g);
            
    }
    
    
}
