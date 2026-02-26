package exer4;

public class MainAluno {
    public static void main(String[] args) {
       Aluno aluno = new Aluno("Kelven", 7.5, 5.5);
       System.out.println("Nome: " + aluno.getNome());
       System.out.println("Media: " + aluno.calcularMedia());
       System.out.println("Situacao: " + aluno.verificarAprovacao());
   }
}
