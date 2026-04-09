package Sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Main {
        
    public static void main(String[] args) {
        
        PagamentoCredito pC = new PagamentoCredito(2000);
        
        pC.senha = "12345";
        pC.processarPagamento();
        
        System.out.println("Validando senha...\nSenha: " + pC.autenticar("1234"));
        
        
        
    }
    
}
