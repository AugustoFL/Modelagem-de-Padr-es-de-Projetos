/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author Aluno
 */
public abstract class Pagamento {
    
    String senha;
    double valorPgto;

    public Pagamento(double valorPgto) {
        this.valorPgto = valorPgto;
    }
    
    public abstract void processarPagamento();
    
    
    
}
