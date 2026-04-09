/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author Aluno
 */
public class PagamentoPIX extends Pagamento{

    public PagamentoPIX(double valorPgto) {
        super(valorPgto);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em PIX | Valor: " + super.valorPgto);
    }
    
    
    
}
