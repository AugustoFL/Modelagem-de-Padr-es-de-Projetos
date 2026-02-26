package exer5;

public class ContaBancaria {

   private String titular;
   private double saldo;

   public ContaBancaria(String titular, double saldoInicial) {
       this.titular = titular;
       this.saldo = saldoInicial;
   }

   public String getTitular() {
       return titular;
   }
   public void setTitular(String titular) {
       this.titular = titular;
   }
   public double getSaldo() {
       return saldo;
   }

   public void depositar(double valor) {
       if (valor > 0) {
           saldo += valor;
       }
   }

   public boolean sacar(double valor) {
       if (valor > 0 && saldo >= valor) {
           saldo -= valor;
           return true;
       } else {
           return false;
       }
   }

   public void exibirSaldo() {
       System.out.println("Saldo atual: R$ " + saldo);
   }
}
