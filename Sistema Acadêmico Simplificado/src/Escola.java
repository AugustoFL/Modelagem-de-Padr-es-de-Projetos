/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
import java.util.ArrayList;

public class Escola {
    
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    
 
    
    public void adicionarPessoa(Pessoa p){
               
            pessoas.add(p);
                               
    }
    
    public void listarPessoas(){
        
        System.out.println("Listando...");       

      for (Pessoa p : pessoas) {
          System.out.println(p.exibirDados());
}
    
    }
        
   
   public double calcularTotalIndicadores(){
        
        System.out.println("Calculando tota...");
        
        double total = 0;
        
        for(Pessoa p: pessoas){
         total += p.calcularIndicador();
        } 
        return total;
    }
        
       
}
    

