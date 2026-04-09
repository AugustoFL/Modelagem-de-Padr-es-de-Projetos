/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author Aluno
 */
public class PagamentoDebito  extends Pagamento implements Autenticavel{

    public PagamentoDebito(double valorPgto) {
        super(valorPgto);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com debito | Valor: " + super.valorPgto);
    }

    @Override
    public boolean autenticar(String senha) {
        return super.senha.equals(senha);
    }
}
