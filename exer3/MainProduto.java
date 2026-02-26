package exer3;

public class MainProduto {
    public static void main(String[] args) {

       Produto produto = new Produto("Notebook", 3500.00, 2);

       System.out.println("Nome: " + produto.getNome());
       System.out.println("Preco: R$ " + produto.getPreco());
       System.out.println("Quantidade: " + produto.getQuantidade());
       
       
       System.out.println("Total: R$ " + produto.calcularTotal());
   }
}
