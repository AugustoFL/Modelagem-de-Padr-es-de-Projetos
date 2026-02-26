package exer5;


public class MainContaBancaria {
    public static void main(String[] args) {
       ContaBancaria conta = new ContaBancaria("Kelven", 1000.0);
       conta.exibirSaldo();
       conta.depositar(500.0);
       System.out.println("Apos deposito:");
       conta.exibirSaldo();
       boolean saqueRealizado = conta.sacar(300.0);
       if (saqueRealizado) {
           System.out.println("Saque realizado com sucesso.");
       } else {
           System.out.println("Saldo insuficiente.");
       }
       conta.exibirSaldo();
   }
}
